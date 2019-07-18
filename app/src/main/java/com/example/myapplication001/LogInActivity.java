package com.example.myapplication001;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;



public class LogInActivity extends AppCompatActivity {

    EditText mUsername,mPassword;
    Button mLogin,mSignup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        //Finding Views by IDs
        mUsername = findViewById(R.id.userName);
        mPassword = findViewById(R.id.password);
        mLogin = findViewById(R.id.logInBtn);
        mSignup = findViewById(R.id.btnSignup);

        //OnClick Listeners
        mLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    Intent homepage = new Intent(getApplication(),HomePageActivity.class);
                    startActivity(homepage);
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
