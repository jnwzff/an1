package com.example.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.widget.TextView;

public class GetActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent=getIntent();
        String message=intent.getStringExtra(MainActivity.MY_TEXT);
        TextView textView=new TextView(this);
        textView.setText(message);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(textView);
    }
}
