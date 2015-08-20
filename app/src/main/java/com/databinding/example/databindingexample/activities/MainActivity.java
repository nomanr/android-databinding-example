package com.databinding.example.databindingexample.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.databinding.example.databindingexample.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onSimpleTextClick(View view){
        startActivity(new Intent(this,SimpleTextActivity.class));
    }
    public void onListViewActivityClick(View view){
        startActivity(new Intent(this,ListViewActivity.class));

    }


}
