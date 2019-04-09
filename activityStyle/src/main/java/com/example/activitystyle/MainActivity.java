package com.example.activitystyle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i("info", "create");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void dialogMethod(View view) {
        Intent intent = new Intent(MainActivity.this, DialogActivity.class);
        startActivity(intent);
    }

    public void normalMethod(View view) {
        Intent intent = new Intent(MainActivity.this, NormalActivity.class);
        startActivity(intent);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.v("info", "start");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.v("info", "resume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.v("info", "pause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.v("info", "stop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v("info", "destroy");
    }
}
