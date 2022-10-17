package com.example.share;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText nameTxtVw,locationTxtVw;
    Button saveBtn, goBtn;
    SharedPreferences sp;
    SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameTxtVw = findViewById(R.id.name);
        locationTxtVw = findViewById(R.id.location);

        saveBtn = findViewById(R.id.save);
        goBtn = findViewById(R.id.go);

        sp=getSharedPreferences("info", MODE_PRIVATE);
        editor = sp.edit();
    }

    public void Save(View view) {
        editor.putString("name", nameTxtVw.getText().toString());
        editor.putString("location", locationTxtVw.getText().toString());
        editor.commit();
    }

    public void Go(View view) {
        startActivity(new Intent(MainActivity.this, InfoActivity.class));
    }
}