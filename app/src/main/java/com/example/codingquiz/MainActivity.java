package com.example.codingquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void openJava(View view){
        Intent intent = new Intent(this,techjava.class);
        startActivity(intent);
    }
    public void openJavaScript(View view){
        Intent intent = new Intent(this, techJs.class);
        startActivity(intent);
    }
    public void openPython(View view){
        Intent intent = new Intent(this, techPython.class);
        startActivity(intent);
    }
    public void openReact(View view){
        Intent intent = new Intent(this, techReact.class);
        startActivity(intent);
    }
    public void openMySql(View view){
        Intent intent = new Intent(this, techMySql.class);
        startActivity(intent);
    }
    public void openCss(View view){
        Intent intent = new Intent(this, techCss.class);
        startActivity(intent);
    }

}