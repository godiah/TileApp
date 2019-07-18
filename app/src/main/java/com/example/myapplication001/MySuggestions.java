package com.example.myapplication001;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MySuggestions extends AppCompatActivity {

    TextView suggest;
    Button submit;
    SQLiteDatabase sqLiteDatabase;
    String msuggest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_suggestions);

        suggest = findViewById(R.id.editTextsuggest);
        submit = findViewById(R.id.btnSubmitComments);

        sqLiteDatabase = openOrCreateDatabase("MyDb", Context.MODE_PRIVATE, null);
        sqLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS suggestions(ID INTEGER PRIMARY KEY AUTOINCREMENT,Suggestions VARCHAR(255))");

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                msuggest = suggest.getText().toString().trim();
                if (msuggest.equals("")) {
                    Toast.makeText(MySuggestions.this, "Kindly Suggest Before Submitting", Toast.LENGTH_SHORT).show();
                    return;
                } else {
                    sqLiteDatabase.execSQL("Insert into suggestions(Suggestions) VALUES('" + msuggest + " '  );");
                    Toast.makeText(MySuggestions.this, "Suggestion Submitted Successfully", Toast.LENGTH_SHORT).show();
                }
                suggest.setText("");
            }
        });


    }
}
