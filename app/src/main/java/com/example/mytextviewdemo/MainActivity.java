package com.example.mytextviewdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {



    private TextView nameTextView;
    private TextView numberTextView;

    private  Button logInButton, logOutButton;
    private  TextView textViewId;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        nameTextView = (TextView) findViewById(R.id.nameTextView) ;
        nameTextView.setText("Masudur rahman");

        numberTextView = (TextView) findViewById(R.id.numberTextView);
        numberTextView.setText("01777635068");

        logInButton = (Button) findViewById(R.id.logInButtonId);
        logOutButton = (Button) findViewById(R.id.logOutButtonId);

        textViewId = (TextView) findViewById(R.id.textViewId);

        logInButton.setOnClickListener(this);
        logOutButton.setOnClickListener(this);


//        logInButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                textViewId.setText("Login Button is clicked");
//            }
//        });
//
//        logOutButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                textViewId.setText("Logout Button is clicked");
//            }
//        });
    }

    @Override
    public void onClick(View view) {

        if(view.getId()==(R.id.logInButtonId)){
            textViewId.setText("Login Button is clicked");
        }

        if(view.getId()==(R.id.logOutButtonId)){
            textViewId.setText("Logout Button is clicked");
        }



    }
}