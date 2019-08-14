package com.example.helperproject;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;

public class AddContact extends AppCompatActivity {
    private EditText Name;
    private EditText phoneNumber;


    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        Name = findViewById(R.id.EtAddContactName);

    }

}
