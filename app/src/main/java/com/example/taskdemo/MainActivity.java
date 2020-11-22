package com.example.taskdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button bt1;
    Button bt2;
    Button bt3;
    Button bt4;
    Button bt5;
    Button bt6;
    Button bt7;
    Button bt8;
    Activity activity = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt1 = findViewById(R.id.bt1);
        bt2 = findViewById(R.id.bt2);
        bt3 = findViewById(R.id.bt3);
        bt4 = findViewById(R.id.bt4);
        bt5 = findViewById(R.id.bt5);
        bt6 = findViewById(R.id.bt6);
        bt7 = findViewById(R.id.bt7);
        bt8 = findViewById(R.id.bt8);
        bt1.setOnClickListener(this);
        bt2.setOnClickListener(this);
        bt3.setOnClickListener(this);
        bt4.setOnClickListener(this);
        bt5.setOnClickListener(this);
        bt6.setOnClickListener(this);
        bt7.setOnClickListener(this);
        bt8.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        if (view == bt1) {
            // 启动非本应用的标准模式Activity
            Intent intent = new Intent();
            intent.setAction(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("demo://task/standard"));
            startActivity(intent);
        } else if (view == bt2) {
            // 启动本应用的标准模式Activity
            Intent intent = new Intent(activity, StandardActivity.class);
            startActivity(intent);
        } else if (view == bt3) {
            Intent intent = new Intent();
            intent.setAction(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("demo://task/singleTask"));
            startActivity(intent);
        } else if (view == bt4) {
            // 启动本应用的SingleTaskActivity
            Intent intent = new Intent(activity, SingleTaskActivity.class);
            startActivity(intent);
        } else if (view == bt5) {
            // SingleTaskDifferentTaskActivity
            Intent intent = new Intent(activity, SingleTaskDifferentTaskActivity.class);
            startActivity(intent);

        } else if (view == bt6) {
            // SingleInstanceActivity
            Intent intent = new Intent(activity, SingleInstanceActivity.class);
            startActivity(intent);

        } else if (view == bt7) {
            // SingleInstanceDifferentTaskActivity
            Intent intent = new Intent(activity, SingleInstanceDifferentTaskActivity.class);
            startActivity(intent);
        } else if (view == bt8) {

            startActivity(getPackageManager()
                            .getLaunchIntentForPackage("com.example.taskdemo2"));
        }
    }
}
