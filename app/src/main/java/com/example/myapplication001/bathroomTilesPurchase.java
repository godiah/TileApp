package com.example.myapplication001;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class bathroomTilesPurchase extends AppCompatActivity {

    ImageView bath1,bath2,bath3,bath4,bath5,bath6,bath7;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bathroom_tiles_purchase);

        bath1 = findViewById(R.id.tile_bathroom5);
        bath2 = findViewById(R.id.tile_bathroom6);
        bath3 = findViewById(R.id.tile_bathroom7);
        bath4 = findViewById(R.id.tile_bathroom8);
        bath5 = findViewById(R.id.tile_bathroom9);
        bath6 = findViewById(R.id.tile_bathroom10);
        bath7 = findViewById(R.id.tile_bathroom11);

        bath1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Purchase = new Intent(getApplication(),PurchaseBathroomTiles.class);
                startActivity(Purchase);
            }
        });
        bath2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Purchase = new Intent(getApplication(),PurchaseBathroomTiles.class);
                startActivity(Purchase);
            }
        });

        bath3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Purchase = new Intent(getApplication(),PurchaseBathroomTiles.class);
                startActivity(Purchase);
            }
        });

        bath4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Purchase = new Intent(getApplication(),PurchaseBathroomTiles.class);
                startActivity(Purchase);
            }
        });

        bath5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Purchase = new Intent(getApplication(),PurchaseBathroomTiles.class);
                startActivity(Purchase);
            }
        });

        bath6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Purchase = new Intent(getApplication(),PurchaseBathroomTiles.class);
                startActivity(Purchase);
            }
        });

        bath7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Purchase = new Intent(getApplication(),PurchaseBathroomTiles.class);
                startActivity(Purchase);
            }
        });
        
    }
}
