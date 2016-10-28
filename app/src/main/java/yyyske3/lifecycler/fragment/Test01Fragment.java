package yyyske3.lifecycler.fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import yyyske3.lifecycler.MainActivity;
import yyyske3.lifecycler.R;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link Test01Fragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link Test01Fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Test01Fragment extends Fragment {

    public static String classTag() {
        return Test01Fragment.class.getName();
    }

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public Test01Fragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Test01Fragment.
     */
    // TODO: Rename and change types and number of parameters
    public static Test01Fragment newInstance(String param1, String param2) {
        Test01Fragment fragment = new Test01Fragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        Log.d(classTag(), "* onCreate");

        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.d(classTag(), "* onCreateView");

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_test01, container, false);
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        Log.d(classTag(), "* onAttach");

        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        Log.d(classTag(), "* onDetach");

        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        Log.d(classTag(), "* onViewCreated");
        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public void onStart() {
        Log.d(classTag(), "* onStart");
        super.onStart();
    }

    @Override
    public void onResume() {
        Log.d(classTag(), "* onResume");
        super.onResume();
    }

    @Override
    public void onPause() {
        Log.d(classTag(), "* onPause");
        super.onPause();
    }

    @Override
    public void onStop() {
        Log.d(classTag(), "* onStop");
        super.onStop();
    }

    @Override
    public void onDestroyView() {
        Log.d(classTag(), "* onDestroyView");
        super.onDestroyView();
    }

    @Override
    public void onDestroy() {
        Log.d(classTag(), "* onDestroy");
        super.onDestroy();
    }

}
