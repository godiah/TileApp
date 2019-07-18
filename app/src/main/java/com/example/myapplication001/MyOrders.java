package com.example.myapplication001;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MyOrders extends AppCompatActivity {
    TextView name,price,amount;
    SQLiteDatabase sqLiteDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_orders);

//        name = findViewById(R.id.textView1);
//        price = findViewById(R.id.textView2);
//        amount = findViewById(R.id.textView3);
//
//        sqLiteDatabase = openOrCreateDatabase("MyDb", Context.MODE_PRIVATE, null);
//        Cursor c = sqLiteDatabase.rawQuery("Select * from purchases",null);
//
//        StringBuffer buffer = new StringBuffer();
//        while (c.moveToNext())
//        {
//            name.setText(buffer.append(c.getString(1)));
//            price.setText(buffer.append(c.getString(2)));
//            amount.setText(buffer.append(c.getString(3)));
//        }

    }
}
