package com.example.callhelper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;

public class Dash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_dash);

        ImageButton pf2 = (ImageButton)findViewById(R.id.pf2);
        ImageButton pf3 = (ImageButton)findViewById(R.id.pf3);
        ImageButton pf4 = (ImageButton)findViewById(R.id.pf4);
        ImageButton pf5 = (ImageButton)findViewById(R.id.pf5);

        pf2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Dash.this, callemergency.class);
                startActivity(intent);
            }
        });

        pf3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Dash.this, medemergency.class);
                startActivity(intent);
            }
        });

        pf4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Dash.this, policeemergency.class);
                startActivity(intent);
            }
        });

        pf5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Dash.this, fireemergency.class);
                startActivity(intent);
            }
        });
    }
}