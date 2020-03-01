package com.hello.agrimate;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Retrieve1 extends AppCompatActivity {
    private static final String TAG = "MainActivity";


    // UI references.
    private EditText mEmail, mPassword;
    private Button btnSignIn,btnSignOut,btnViewDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = new Intent(Retrieve1.this, ViewDatabase.class);
        startActivity(intent);


    }

    private void toastMessage(String message){
        Toast.makeText(this,message,Toast.LENGTH_SHORT).show();
    }
}
