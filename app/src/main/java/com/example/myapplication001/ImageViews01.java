package com.example.myapplication001;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class ImageViews01 extends AppCompatActivity {

    private ImageView imageView;
    private TextView textView1;
    private TextView textView2;
    private TextView cartbtn;
    private Button buygood;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_views01);

        imageView = findViewById(R.id.imageView2);
        textView1 = findViewById(R.id.good_title);
        textView2 = findViewById(R.id.product_price);
        cartbtn = findViewById(R.id.addtocartBtn);
        buygood = findViewById(R.id.buy_now_btn);

        cartbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ImageViews01.this, "Item Added", Toast.LENGTH_SHORT).show();
            }
        });

        buygood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent buy = new Intent(getApplication(),Success.class);
                startActivity(buy);
            }
        });






    }
}
//    List<Integer> productImages = new ArrayList<>();
//        productImages.add(R.drawable.floor_aletra);
//        productImages.add(R.drawable.floor_capuccinobeigetiles);
//        productImages.add(R.drawable.floor_country_rivertile);
//        productImages.add(R.drawable.floor_evorabeigetiles);
//
//        List<Integer> productTitles = new ArrayList<>();
//        productTitles.add(R.id.f_title1);
//        productTitles.add(R.id.f_title2);
//        productTitles.add(R.id.f_title3);
//        productTitles.add(R.id.f_title4);
//
//
//        List<Integer> productPrices = new ArrayList<>();
//        productPrices.add(R.id.f_price1);
//        productPrices.add(R.id.f_price2);
//        productPrices.add(R.id.f_price3);
//        productPrices.add(R.id.f_price4);
//
//        ProductImagesAdapter01 productImagesAdapter01 = new ProductImagesAdapter01(productImages,productTitles,productPrices);
////        imageView.setAdapter(productImagesAdapter01);
////        textView1.setAdapter(productImagesAdapter01);
////        textView2.setAdapter(productImagesAdapter01);

