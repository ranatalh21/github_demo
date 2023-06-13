package com.example.githubdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getData();
    }
    public void getData(){
        Toast.makeText(this, "Hello gitHub", Toast.LENGTH_SHORT).show();
    }
    // This is my 3rd commit
    //4th
}