package com.example.myapplication001;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    protected boolean _active=true;
    protected int _spalshtime=3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Thread abel = new Thread(){
            public void run() {
                try {
                    int wait = 0;
                    while (_active && (wait < _spalshtime)) {
                        sleep(100);
                        if (_active) {
                            wait += 100;
                        }
                    }
                }
                catch (Exception e) {

                } finally {

//                startActivity(new Intent(MainActivity.this,nextPage.class));

                    Intent loginpage = new Intent(getApplication(), MainLoginPage.class);
                    startActivity(loginpage);
                    finish();
                }
            }

        };
        abel.start();
    }
}
