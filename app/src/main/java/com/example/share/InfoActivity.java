package com.example.share;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class InfoActivity extends AppCompatActivity {

    TextView infoTxtVw;
    Button getBtn;
    SharedPreferences sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        infoTxtVw = findViewById(R.id.info);
        getBtn = findViewById(R.id.get);

        sp=getSharedPreferences("info", MODE_PRIVATE);

    }

    public void Get(View view) {
        infoTxtVw.setText("Name: " + sp.getString("name", "Irina") + "\n Location: " + sp.getString("location","Georgia"));
    }
}