package com.hello.agrimate;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class AddNewField extends AppCompatActivity {
    EditText Name,Phno,Adress,Acn,Area,Amount,Choice,Des;
    Button btnSave;
    DatabaseReference reff;
    NewFarm NewM;
    int a=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_field);
        Name=(EditText)findViewById(R.id.Name);
        Phno=(EditText)findViewById(R.id.Phno);
        Adress=(EditText)findViewById(R.id.Adress);
        Acn=(EditText)findViewById(R.id.Acn);
        Area=(EditText)findViewById(R.id.Area);
        Amount=(EditText)findViewById(R.id.Amount);
        Choice=(EditText)findViewById(R.id.Choice);
        Des=(EditText)findViewById(R.id.Des);
        btnSave=(Button)findViewById(R.id.btnSave);
        NewM= new NewFarm();

        reff= FirebaseDatabase.getInstance().getReference().child("NewFarm");
        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Long Phno1=Long.parseLong(Phno.getText().toString().trim());
                Long Acn1=Long.parseLong(Acn.getText().toString().trim());
                Long Amount1=Long.parseLong(Amount.getText().toString().trim());
                Long Area1=Long.parseLong(Area.getText().toString().trim());

                NewM.setAcn(Acn1);
                NewM.setAmount(Amount1);
                NewM.setArea(Area1);
                NewM.setPhno(Phno1);
                NewM.setDes(Des.getText().toString().trim());
                NewM.setName(Name.getText().toString().trim());
                NewM.setAdress(Adress.getText().toString().trim());
                NewM.setChoice(Choice.getText().toString().trim());

                reff.child("Member"+Integer.toString(a)).setValue(NewM);
                a=a+1;
                Toast.makeText(AddNewField.this,"WoW, Successful",Toast.LENGTH_LONG).show();

            }
        });

    }
}
