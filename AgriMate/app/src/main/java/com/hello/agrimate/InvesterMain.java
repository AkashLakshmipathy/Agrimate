package com.hello.agrimate;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class InvesterMain extends AppCompatActivity {
    private long backPressedTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_invmain);
        Button buttonOne = findViewById(R.id.button35);
        buttonOne.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                System.out.println("Button Clicked");

                Intent activity2Intent = new Intent(getApplicationContext(), DetailsPage.class);
                startActivity(activity2Intent);
            }
        });

        Button buttonTwe = findViewById(R.id.button41);
        buttonTwe.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                System.out.println("Button Clicked");

                Intent activity2Intent = new Intent(getApplicationContext(), DetailsPage.class);
                startActivity(activity2Intent);
            }
        });

        Button buttonThree = findViewById(R.id.button34);
        buttonThree.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                System.out.println("Button Clicked");

                Intent activity2Intent = new Intent(getApplicationContext(), BuyerPage.class);
                startActivity(activity2Intent);
            }
        });

        Button buttonFour = findViewById(R.id.button40);
        buttonFour.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                System.out.println("Button Clicked");

                Intent activity2Intent = new Intent(getApplicationContext(), BuyerPage.class);
                startActivity(activity2Intent);
            }
        });


        Button buttonSix = findViewById(R.id.trending);
        buttonSix.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                System.out.println("Button Clicked");

                Intent activity2Intent = new Intent(getApplicationContext(), InvestorTrending.class);
                startActivity(activity2Intent);
            }
        });
        Button buttonSeven = findViewById(R.id.nStocks);
        buttonSeven.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                System.out.println("Button Clicked");

                Intent activity2Intent = new Intent(getApplicationContext(), NewStocks.class);
                startActivity(activity2Intent);
            }
        });

        Button buttonEight = findViewById(R.id.hRated);
        buttonEight.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                System.out.println("Button Clicked");

                Intent activity2Intent = new Intent(getApplicationContext(), HighRated.class);
                startActivity(activity2Intent);
            }
        });

        Button buttonTen = findViewById(R.id.button10);
        buttonTen.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                System.out.println("Button Clicked");

                Intent activity2Intent = new Intent(getApplicationContext(), InvProfile.class);
                startActivity(activity2Intent);
            }
        });



    }
    public void onBackPressed(){
        Intent a = new Intent(Intent.ACTION_MAIN);
        a.addCategory(Intent.CATEGORY_HOME);
        a.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(a);

    }

}
