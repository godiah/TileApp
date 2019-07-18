package com.example.myapplication001;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class floorTilesPurchase extends AppCompatActivity {

    private ImageView floor1,floor2,floor3,floor4,floor5,floor6,floor7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_floor_tiles_purchase);

        floor1 = findViewById(R.id.tile_floor5);
        floor2 = findViewById(R.id.tile_floor6);
        floor3 = findViewById(R.id.tile_floor7);
        floor4 = findViewById(R.id.tile_floor8);
        floor5 = findViewById(R.id.tile_floor9);
        floor6 = findViewById(R.id.tile_floor10);
        floor7 = findViewById(R.id.tile_floor11);

        floor1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent purchase = new Intent(getApplication(),PurchaseFloorTiles.class);
                startActivity(purchase);
            }
        });

        floor2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent purchase = new Intent(getApplication(),PurchaseFloorTiles.class);
                startActivity(purchase);
            }
        });

        floor3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent purchase = new Intent(getApplication(),PurchaseFloorTiles.class);
                startActivity(purchase);
            }
        });

        floor4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent purchase = new Intent(getApplication(),PurchaseFloorTiles.class);
                startActivity(purchase);
            }
        });

        floor5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent purchase = new Intent(getApplication(),PurchaseFloorTiles.class);
                startActivity(purchase);
            }
        });

        floor6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent purchase = new Intent(getApplication(),PurchaseFloorTiles.class);
                startActivity(purchase);
            }
        });

        floor7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent purchase = new Intent(getApplication(),PurchaseFloorTiles.class);
                startActivity(purchase);
            }
        });

    }
}
