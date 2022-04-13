package com.example.proiectjocfinal.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.proiectjocfinal.fragments.InvGearFragment;
import com.example.proiectjocfinal.fragments.InvHeroFragment;
import com.example.proiectjocfinal.fragments.InvUpgrdItemFragment;
import com.example.proiectjocfinal.R;

public class InventoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inventory);

        Button herofragmenttbn=findViewById(R.id.invherobtn);
        herofragmenttbn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager=getSupportFragmentManager();

                fragmentManager.beginTransaction()
                        .replace(R.id.fragmentcontainer, InvHeroFragment.class,null)
                        .setReorderingAllowed(true)
                        .addToBackStack("Hero")
                        .commit();
            }
        });


        Button gearfragmentbtn=findViewById(R.id.invgearbtn);
        gearfragmentbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager=getSupportFragmentManager();

                fragmentManager.beginTransaction()
                        .replace(R.id.fragmentcontainer, InvGearFragment.class,null)
                        .setReorderingAllowed(true)
                        .addToBackStack("Gear")
                        .commit();
            }
        });


        Button upgitemfragmentbtn=findViewById(R.id.invmatsbtn);
        upgitemfragmentbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager=getSupportFragmentManager();

                fragmentManager.beginTransaction()
                        .replace(R.id.fragmentcontainer, InvUpgrdItemFragment.class,null)
                        .setReorderingAllowed(true)
                        .addToBackStack("Upgrades")
                        .commit();
            }
        });


    }
}