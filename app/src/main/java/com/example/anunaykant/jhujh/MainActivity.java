package com.example.anunaykant.jhujh;

import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onclick(View view) {
        Intent click = new Intent(MainActivity.this, Main2Activity.class);
        startActivity(click);
    }

    public void l1(View view) {
        Intent i=new Intent(MainActivity.this,Main2Activity.class);
        startActivity(i);
    }

    public void l2(View view) {
        Intent j=new Intent(MainActivity.this,Main3Activity.class);
    startActivity(j);
    }
}
