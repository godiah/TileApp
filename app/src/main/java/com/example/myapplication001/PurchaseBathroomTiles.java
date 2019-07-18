package com.example.myapplication001;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class PurchaseBathroomTiles extends AppCompatActivity {

    TextView addtocart;
    Button buynow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_purchase_bathroom_tiles);

        addtocart = findViewById(R.id.tv_addToCart);
        buynow = findViewById(R.id.buy_now_btn);
//         addtocart.setOnClickListener(new View.OnClickListener() {
//             @Override
//             public void onClick(View v) {
//                 Intent cart = new Intent(getApplication(),ShoppingFragment.class);
//                 startActivity(cart);
//             }
//         });
    }
}
