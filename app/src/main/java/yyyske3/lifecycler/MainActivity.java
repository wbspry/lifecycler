package yyyske3.lifecycler;

import android.net.Uri;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import yyyske3.lifecycler.fragment.Test01Fragment;
import yyyske3.lifecycler.fragment.Test01Fragment.OnFragmentInteractionListener;

public class MainActivity extends AppCompatActivity implements OnFragmentInteractionListener{

    public static String classTag() {
        return MainActivity.class.getName();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(classTag(), "* onCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Test01Fragment test01Fragment = new Test01Fragment();
        FragmentManager fragmentManager = getSupportFragmentManager();

        fragmentManager.beginTransaction().replace(R.id.fl_fragment_container, test01Fragment, null).commit();

    }

    @Override
    protected void onRestart() {
        Log.d(classTag(), "* onRestart");
        super.onRestart();
    }

    @Override
    protected void onStart() {
        Log.d(classTag(), "* onStart");
        super.onStart();
    }

    @Override
    protected void onResume() {
        Log.d(classTag(), "* onResume");
        super.onResume();
    }

    @Override
    protected void onPause() {
        Log.d(classTag(), "* onPause");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.d(classTag(), "* onStop");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.d(classTag(), "* onDestroy");
        super.onDestroy();
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
