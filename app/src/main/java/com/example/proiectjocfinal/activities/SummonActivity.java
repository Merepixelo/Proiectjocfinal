package com.example.proiectjocfinal.activities;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.proiectjocfinal.R;

import org.w3c.dom.Text;

import java.util.*;
/*
import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;
 */

public class SummonActivity extends AppCompatActivity {
    

    
    private Button arbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summon);


        
        
        arbtn=(Button) findViewById(R.id.accregbtn);

        arbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
/*
 EditText email= (EditText) findViewById(R.id.emailadresstxtbox);

                String from = "random@gmail.com";
                String to =email.getText().toString();
                String host = "localhost";
 */

            }
        });
    }
}