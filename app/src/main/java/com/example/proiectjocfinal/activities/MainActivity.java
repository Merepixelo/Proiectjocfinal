package com.example.proiectjocfinal.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.*;
/*
import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;
 */


import com.example.proiectjocfinal.R;

public class MainActivity extends AppCompatActivity {
    private Button summonbnt;
    private Button heroinvbnt;
    private Button battlebtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        summonbnt=(Button) findViewById(R.id.button3);
        heroinvbnt=(Button) findViewById(R.id.button4);
        battlebtn=(Button) findViewById(R.id.button2);


        summonbnt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSummonActivity();
            }
        });

        heroinvbnt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openInventoryActivity();
            }
        });

        battlebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBattleActivity();
            }
        });


    }
    public void openSummonActivity(){
        Intent intent =new Intent(this, SummonActivity.class);
            startActivity(intent);
    }

    public void openInventoryActivity(){
        Intent intent =new Intent(this, InventoryActivity.class);
        startActivity(intent);
    }

    public void openBattleActivity(){
        Intent intent =new Intent(this, BattleActivity.class);
        startActivity(intent);
    }

}