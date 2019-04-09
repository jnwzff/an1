package com.example.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.database.CursorJoiner;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.TextView;

public class FourActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four);
    }

    public void backFour(View view) {
        Intent intent = getIntent();
        intent.putExtra("aa", "aa");
        setResult(RESULT_OK, intent);
        finish();
    }
    @Override
    public void onBackPressed() {
        Intent intent = getIntent();
        intent.putExtra("aa", "aa");
        setResult(RESULT_OK, intent);
        finish();
    }
}
