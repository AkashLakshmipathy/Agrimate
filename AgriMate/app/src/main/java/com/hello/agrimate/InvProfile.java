package com.hello.agrimate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class InvProfile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inv_profile);

        Button buttonSeven = findViewById(R.id.button11);
        buttonSeven.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                System.out.println("Button Clicked");

                Intent activity2Intent = new Intent(getApplicationContext(), StockHistory.class);
                startActivity(activity2Intent);
            }
        });

        Button buttonSeve = findViewById(R.id.StockHis);
        buttonSeve.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                System.out.println("Button Clicked");

                Intent activity2Intent = new Intent(getApplicationContext(), InvestorStocks.class);
                startActivity(activity2Intent);
            }
        });

    }
}
