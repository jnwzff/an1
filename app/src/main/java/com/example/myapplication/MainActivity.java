package com.example.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {
    public final static String MY_TEXT="my-message";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View view){
        Intent intent=new Intent(this,GetActivity.class);
        EditText editText=findViewById(R.id.edit);
        String text=editText.getText().toString();
        intent.putExtra(MY_TEXT,text);
        startActivity(intent);
    }
    public void showALitte(View view){
//        Toast.makeText(MainActivity.this,"aa",Toast.LENGTH_SHORT).show();
        Intent intent=new Intent(MainActivity.this,ThirdActivity.class);
        startActivity(intent);
    }
    public void showAlittle2(View view){
//         打开系统浏览器
//        Intent intent=new Intent(Intent.ACTION_VIEW);
//        intent.setData(Uri.parse("http://www.baidu.com"));
//        startActivity(intent);
//        返回activity 传值
        Intent intent=new Intent(MainActivity.this,FourActivity.class);
        startActivityForResult(intent,1);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if(requestCode==1&&resultCode==RESULT_OK){
           String message= data.getStringExtra("aa");
           EditText editText=findViewById(R.id.edit);
           editText.setText(message);
        }
    }
}
