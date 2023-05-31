package com.example.codingquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class techjava extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_techjava);
    }
    public void openJavaQuiz(View view){
        Intent intent = new Intent(this, JavaQuiz.class);
        startActivity(intent);
    }
}