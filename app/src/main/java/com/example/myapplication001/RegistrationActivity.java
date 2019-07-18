//package com.example.myapplication001;
//
//import android.os.Bundle;
//import android.support.v7.app.AppCompatActivity;
//import android.view.View;
//import android.widget.Button;
//import android.widget.EditText;
//import android.widget.Toast;
//
//public class RegistrationActivity extends AppCompatActivity {
//    EditText mUserNameTxt, mPasswordTxt;
//    Button registerBtn;
//    String mname,mpassword;
//
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_registration);
//
//        mUserNameTxt = findViewById(R.id.editTextUsername);
//        mPasswordTxt = findViewById(R.id.editTextPassword);
//        registerBtn = findViewById(R.id.btnRegister);
//
//
//        registerBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                mname = mUserNameTxt.getText().toString().trim();
//                mpassword = mPasswordTxt.getText().toString().trim();
//
//
//                if (mname.equals("")||mpassword.equals(""))
//                {
//                    Toast.makeText(RegistrationActivity.this, "Kindly fill in all required details...", Toast.LENGTH_SHORT).show();
//                }
//            }
//        });
//
//
//
//
//
//    }
//}
