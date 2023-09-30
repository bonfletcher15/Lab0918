package com.example.lab0918;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView tvMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.tvMain = findViewById(R.id.tvMain);
    }

    public void onBtnChangeTextClick(View view) {
        this.tvMain.setText("Changed text");
    }

    public void button2Click(View view) {
        this.tvMain.setTextColor(Color.rgb(200,0,0));
    }
}