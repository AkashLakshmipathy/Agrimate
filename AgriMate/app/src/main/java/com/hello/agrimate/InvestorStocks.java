package com.hello.agrimate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class InvestorStocks  extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_invstocks);

        Button buttonSeve = findViewById(R.id.button152);
        buttonSeve.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                System.out.println("Button Clicked");

                Intent activity2Intent = new Intent(getApplicationContext(), BuyerPage.class);
                startActivity(activity2Intent);
            }
        });

        Button buttonSev = findViewById(R.id.button162);
        buttonSev.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                System.out.println("Button Clicked");

                Intent activity2Intent = new Intent(getApplicationContext(), ReportPage.class);
                startActivity(activity2Intent);
            }
        });

    }
}
