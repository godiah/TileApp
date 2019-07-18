package com.example.myapplication001;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class outdoorTilesPurchase extends AppCompatActivity {

    ImageView out1,out2,out3,out4,out5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_outdoor_tiles_purchase);

        out1 = findViewById(R.id.tile_outdoor6);
        out2 = findViewById(R.id.tile_outdoor7);
        out3 = findViewById(R.id.tile_outdoor8);
        out4 = findViewById(R.id.tile_outdoor9);
        out5 = findViewById(R.id.tile_outdoor10);

        out1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pur = new Intent(getApplication(),PurchaseOutdoorTiles.class);
                startActivity(pur);
            }
        });

        out2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pur = new Intent(getApplication(),PurchaseOutdoorTiles.class);
                startActivity(pur);
            }
        });

        out3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pur = new Intent(getApplication(),PurchaseOutdoorTiles.class);
                startActivity(pur);
            }
        });

        out4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pur = new Intent(getApplication(),PurchaseOutdoorTiles.class);
                startActivity(pur);
            }
        });

        out5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pur = new Intent(getApplication(),PurchaseOutdoorTiles.class);
                startActivity(pur);
            }
        });
    }
}
