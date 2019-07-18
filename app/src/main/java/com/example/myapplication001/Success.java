package com.example.myapplication001;

import android.annotation.SuppressLint;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Success extends AppCompatActivity {

    Button purchase;
    EditText quantity;
    ImageView image;
    SQLiteDatabase sqLiteDatabase;
    TextView goodprice,goodamount,goodname;
    String mimage,mprice,mquantity,mamount,mtitle,calc;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success);

        purchase = findViewById(R.id.btnpurchase);

        goodprice = findViewById(R.id.itemPrice);
        goodname = findViewById(R.id.good_title);
        image = findViewById(R.id.goodImage);
        goodamount = findViewById(R.id.amount);
        quantity = findViewById(R.id.editTextquantity);

//        //calculation
//        int firstnum = Integer.parseInt(quantity.getText().toString());
//        int secnum = Integer.parseInt(goodprice.getText().toString());
//        int sum = firstnum+secnum;
//        mamount.setText(Integer.toString(sum));

        sqLiteDatabase = openOrCreateDatabase("MyDb", Context.MODE_PRIVATE, null);
        sqLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS purchases(ID INTEGER PRIMARY KEY AUTOINCREMENT,ItemName VARCHAR(255),ItemPrice VARCHAR(255),Quantity VARCHAR(255),Amount VARCHAR(255))");

        purchase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                mimage = image.getDrawable().toString().trim();
                mtitle = goodname.toString().trim();
                mprice = goodprice.toString().trim();
                mquantity = quantity.toString().trim();
                mamount = goodamount.toString().trim();

                if (mquantity.equals("")) {
                    Toast.makeText(Success.this, "Quantity should be more than 1", Toast.LENGTH_SHORT).show();
                } else {
                    sqLiteDatabase.execSQL("Insert into purchases(ItemName,ItemPrice,Quantity,Amount) VALUES('" + mtitle + " ' ,'" + mprice + " ' ,' " + mquantity + " ',' " + mamount + " ' );");
                    Toast.makeText(Success.this, "Item Purchased Successfully", Toast.LENGTH_SHORT).show();
                }
            }

        });
    }
}
