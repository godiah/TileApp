package com.example.myapplication001;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MyProfileDetailsEditor extends AppCompatActivity {

    EditText firstname, lastname, emailaddress, phone, passwordcurrent,passwordnew;
    Button mSave, mchange;
    SQLiteDatabase sqLiteDatabase;
    String fname, email, tele, lname, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_profile_details_editor);

        firstname = findViewById(R.id.editFirstName);
        lastname = findViewById(R.id.editLastName);
        emailaddress = findViewById(R.id.editEmailAddress);
        phone = findViewById(R.id.editPhone);
        passwordcurrent = findViewById(R.id.editCurrentPassword);
        passwordnew = findViewById(R.id.editNewPassword);
        mSave = findViewById(R.id.btnSave);
        mchange = findViewById(R.id.btnPassword);

        sqLiteDatabase = openOrCreateDatabase("MyDb", Context.MODE_PRIVATE, null);


//        mchange.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                password = mpassword.getText().toString().trim();
//
//
//                Cursor cursorupdate = sqLiteDatabase.rawQuery("select * from students where Password = '" + password + "'",null);
//                if (cursorupdate.moveToFirst())
//                {
//                    sqLiteDatabase.execSQL("Delete from students where Name='"+search+" '");
//                    Toast.makeText(this, "Record Deleted", Toast.LENGTH_SHORT).show();
//
//                }
//                else
//                {
//                    Toast.makeText(this, "Student Not Found", Toast.LENGTH_SHORT).show();
//
//                }
//            }
//        });


//        //display
//        Cursor c = sqLiteDatabase.rawQuery("Select * from users",null);
//
//        StringBuffer buffer = new StringBuffer();
//        while (c.moveToNext())
//        {
//            firstname.setText(buffer.append(c.getString(1)));
//            lastname.setText(buffer.append(c.getString(2)));
//            emailaddress.setText(buffer.append(c.getString(3)));
//            phone.setText(buffer.append(c.getString(4)));
//            passwordcurrent.setText(buffer.append(c.getString(5)));
//
//        }
    }
}
