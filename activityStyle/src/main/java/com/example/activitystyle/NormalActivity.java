package com.example.activitystyle;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.activitystyle.util.MyAdapter;
import com.example.activitystyle.util.MyIma;

import java.util.ArrayList;
import java.util.List;

public class NormalActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_normal);
        ListView listView=findViewById(R.id.list);
        List<MyIma> myImas=new ArrayList<>();
        MyIma myIma0=new MyIma();
        myIma0.setImageId(R.drawable.ic_launcher_foreground);
        myIma0.setText("0");
        MyIma myIma1=new MyIma();
        myIma1.setImageId(R.drawable.ic_launcher_foreground);
        myIma1.setText("1");
        myImas.add(myIma0);
        myImas.add(myIma1);
        listView.setAdapter(new MyAdapter(NormalActivity.this,R.layout.activity_image,myImas));
    }
}
