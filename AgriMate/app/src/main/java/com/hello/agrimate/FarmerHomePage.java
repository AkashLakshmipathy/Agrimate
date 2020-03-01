package com.hello.agrimate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FarmerHomePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_farmer_home_page);
        Button buttonThreeo = findViewById(R.id.profilebtn);
        buttonThreeo.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                System.out.println("Button Clicked");

                Intent activity2Intent = new Intent(getApplicationContext(), FarmerProfile.class);
                startActivity(activity2Intent);
            }
        });

        Button buttonOne = findViewById(R.id.buttonreq);
        buttonOne.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                System.out.println("Button Clicked");

                Intent activity2Intent = new Intent(getApplicationContext(), AddNewField.class);
                startActivity(activity2Intent);
            }
        });


        Button buttonTwo = findViewById(R.id.button3);
        buttonTwo.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                System.out.println("Button Clicked");

                Intent activity2Intent = new Intent(getApplicationContext(), HistoryStock.class);
                startActivity(activity2Intent);
            }
        });

        Button buttonFour = findViewById(R.id.button8);
        buttonFour.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                System.out.println("Button Clicked");

                Intent activity2Intent = new Intent(getApplicationContext(), AboutApp.class);
                startActivity(activity2Intent);
            }
        });

        Button buttonFive = findViewById(R.id.button7);
        buttonFive.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                System.out.println("Button Clicked");

                Intent activity2Intent = new Intent(getApplicationContext(), HelpSupport.class);
                startActivity(activity2Intent);
            }
        });

        Button buttonF = findViewById(R.id.button4);
        buttonF.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                System.out.println("Button Clicked");

                Intent activity2Intent = new Intent(getApplicationContext(), UpdateVerification.class);
                startActivity(activity2Intent);
            }
        });


    }
}
