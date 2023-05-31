package com.example.codingquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class JavaQuiz extends AppCompatActivity {
    Button op1;
    Button op2;
    Button op3;
    Button op4;
    String[] questions = {"1) Which of the following option leads to the portability and security of Java?","2) Which of the following is not a Java features?","3)_____ is used to find and fix bugs in the Java programs.","4) What is the return type of the hashCode() method in the Object class?","5) Which of the following is a valid long literal?","6) What does the expression float a = 35 / 0 return?","7) Evaluate the following Java expression, if x=3, y=5, and z=10:\n++z + y - y + z + x++","8)Which of the following tool is used to generate API documentation in HTML format from doc comments in source code?","9) Which of the following creates a List of 3 visible items and multiple selections abled?","10)Which of the following for loop declaration is not valid?"};
    String[] option1={"Bytecode is executed by JVM","Dynamic","JVM","Object","ABH8097","0","24","javap tool","new List(false, 3)","for ( int i = 99; i >= 0; i / 9 )"};
    String[] option2={"The applet makes the Java code secure and portable","Architecture Neutral","JRE","int","L990023","Not a Number","23","javaw command","new List(3, true)","for ( int i = 7; i <= 77; i += 7 )"};
    String[] option3={"Use of exception handling","Use of pointers","JDK","long","904423","Infinity","20","Javadoc tool","new List(true, 3)","for ( int i = 20; i >= 2; - -i )"};
    String[] option4={"Dynamic binding between objects","Object-oriented","JDB","void","0xnf029L","Run time Exception","25","javah command","new List(3, false)","for ( int i = 2; i <= 20; i = 2* i )"};
    char[] answers = {'a','c','d','b','d','c','d','c','b','a'};
    int index = 0;
    TextView qDisp;
    TextView finalScore;
    int score = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_quiz);
        op1 = findViewById(R.id.optionA);
        op2 = findViewById(R.id.optionB);
        op3 = findViewById(R.id.optionC);
        op4 = findViewById(R.id.optionD);
        qDisp = findViewById(R.id.questionJava);
        qDisp.setText(questions[index]);
        op1.setText(option1[index]);
        op2.setText(option2[index]);
        op3.setText(option3[index]);
        op4.setText(option4[index]);
        finalScore = findViewById(R.id.finalScore);
    }
    @SuppressLint("SetTextI18n")
    public void optionA(View view){
        if(answers.length-1>=index) {
            if (answers[index] == 'a') {
                score++;
            }
            index++;
        }
        if(answers.length-1>=index){
            qDisp.setText(questions[index]);
            op1.setText(option1[index]);
            op2.setText(option2[index]);
            op3.setText(option3[index]);
            op4.setText(option4[index]);
        }
        else{
            finalScore.setText("Your Score is :"+score+"/"+answers.length);
        }
    }
    @SuppressLint("SetTextI18n")
    public void optionB(View view){
        if(answers.length-1>=index) {
            if (answers[index] == 'b') {
                score++;
            }
            index++;
        }
        if(answers.length-1>=index){
            qDisp.setText(questions[index]);
            op1.setText(option1[index]);
            op2.setText(option2[index]);
            op3.setText(option3[index]);
            op4.setText(option4[index]);
        }
        else{
            finalScore.setText("Your Score is :"+score+"/"+answers.length);
        }
    }
    @SuppressLint("SetTextI18n")
    public void optionC(View view){
        if(answers.length-1>=index) {
            if (answers[index] == 'c') {
                score++;
            }
            index++;
        }
        if(answers.length-1>=index){
            qDisp.setText(questions[index]);
            op1.setText(option1[index]);
            op2.setText(option2[index]);
            op3.setText(option3[index]);
            op4.setText(option4[index]);
        }
        else{
            finalScore.setText("Your Score is :"+score+"/"+answers.length);
        }
    }

    @SuppressLint("SetTextI18n")
    public void optionD(View view){
        if(answers.length-1>=index) {
            if (answers[index] == 'd') {
                score++;
            }
            index++;
        }
        if(answers.length-1>=index){
            qDisp.setText(questions[index]);
            op1.setText(option1[index]);
            op2.setText(option2[index]);
            op3.setText(option3[index]);
            op4.setText(option4[index]);
        }
        else{
            finalScore.setText("Your Score is :"+score+"/"+answers.length);
        }
    }

}