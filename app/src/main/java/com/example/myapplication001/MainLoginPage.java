package com.example.myapplication001;

import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainLoginPage extends AppCompatActivity {

    EditText mUsername,mPassword;
    Button mLogin,mSignup;
    String user,password;
    SQLiteDatabase sqLiteDatabase;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_login_page);

        //Finding Views by IDs
        mUsername = findViewById(R.id.userName);
        mPassword = findViewById(R.id.password);
        mLogin = findViewById(R.id.logInBtn);
        mSignup = findViewById(R.id.btnSignup);
        sqLiteDatabase = openOrCreateDatabase("MyDb", Context.MODE_PRIVATE, null);

        //OnClick Listeners
        mLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                user = mUsername.getText().toString().trim();
                password = mPassword.getText().toString().trim();

                if (user.equals("") || password.equals(""))
                {
                    Toast.makeText(MainLoginPage.this, "Kindly fill in your login credentials", Toast.LENGTH_SHORT).show();
                }
                else {
                    mUsername.setText("");
                    mPassword.setText("");

                    Intent homepage = new Intent(getApplication(),HomePageActivity.class);
                    startActivity(homepage);
                }
            }
        });

        mSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registrationactivity = new Intent(getApplication(),UserLogin.class);
                startActivity(registrationactivity);

            }
        });
    }
}
