package com.example.myapplication001;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class wallTilesPurchase extends AppCompatActivity {

    ImageView wall1,wall2,wall3,wall4,wall5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wall_tiles_purchase);

        wall1 = findViewById(R.id.tile_wall5);
        wall2 = findViewById(R.id.tile_wall6);
        wall3 = findViewById(R.id.tile_wall7);
        wall4 = findViewById(R.id.tile_wall8);
        wall5 = findViewById(R.id.tile_wall9);

        wall1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent purchase = new Intent(getApplication(),PurchaseWallTiles.class);
                startActivity(purchase);
            }
        });

        wall2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent purchase = new Intent(getApplication(),PurchaseWallTiles.class);
                startActivity(purchase);
            }
        });

        wall3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent purchase = new Intent(getApplication(),PurchaseWallTiles.class);
                startActivity(purchase);
            }
        });

        wall4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent purchase = new Intent(getApplication(),PurchaseWallTiles.class);
                startActivity(purchase);
            }
        });

        wall5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent purchase = new Intent(getApplication(),PurchaseWallTiles.class);
                startActivity(purchase);
            }
        });
    }
}
