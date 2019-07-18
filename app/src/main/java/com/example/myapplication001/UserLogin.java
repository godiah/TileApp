package com.example.myapplication001;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;

public class UserLogin extends AppCompatActivity {

    EditText mfirstname, mlastname, memailaddress, mphone, mpassword;
    Button mSave, mLogin,del;
    SQLiteDatabase sqLiteDatabase;
    String fname, email, phone, lname, password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        //Finding Views by IDs
        mfirstname = findViewById(R.id.editFirstName);
        mlastname = findViewById(R.id.editLastName);
        memailaddress = findViewById(R.id.editEmailAddress);
        mphone = findViewById(R.id.editPhone);
        mSave = findViewById(R.id.btnSave);
        mpassword = findViewById(R.id.editCurrentPassword);
        mLogin = findViewById(R.id.btnLogin);
        del = findViewById(R.id.btndel);



        //DataBase
        //1.Create Database
        sqLiteDatabase = openOrCreateDatabase("MyDb", Context.MODE_PRIVATE, null);
        sqLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS users(ID INTEGER PRIMARY KEY AUTOINCREMENT,FName VARCHAR(255),LName VARCHAR(255),Email VARCHAR(255),Phone VARCHAR(255),Password VARCHAR(255))");


        mSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fname = mfirstname.getText().toString().trim();
                lname = mlastname.getText().toString().trim();
                email = memailaddress.getText().toString().trim();
                phone = mphone.getText().toString().trim();
                password = mpassword.getText().toString().trim();

                    if (fname.equals("") || lname.equals("") || email.equals("") || phone.equals("") || password.equals("")) {
                        Toast.makeText(UserLogin.this, "Kindly Fill In All Details", Toast.LENGTH_SHORT).show();
                        return;
                    } else {
                        sqLiteDatabase.execSQL("Insert into users(FName,LName,Email,Phone,Password) VALUES('" + fname + " ' ,'" + lname + " ' ,' " + email + " ',' " + phone + " ','" + password + " ' );");
                        Toast.makeText(UserLogin.this, "Record Saved Successfully", Toast.LENGTH_SHORT).show();
                    }
                    mfirstname.setText("");
                    mlastname.setText("");
                    memailaddress.setText("");
                    mphone.setText("");
                    mpassword.setText("");
                }

        });
//        del.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Cursor cdelete = sqLiteDatabase.rawQuery("Select * from users where FName ='" +Richardson + " '",null);
//                if (cdelete.moveToFirst())
//                {
//                    sqLiteDatabase.execSQL("Delete from users where FName='"+Richardson+" '");
//                    Toast.makeText(UserLogin.this, "Record Deleted", Toast.LENGTH_SHORT).show();
//
//                }
//            }
//        });
//

        mLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent log = new Intent(UserLogin.this,HomePageActivity.class);
                startActivity(log);
            }
        });
    }
}


