package com.gdgminna.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button showToast = findViewById(R.id.clickme);
        ImageView showImageToast = findViewById(R.id.welcomemessage);

        showImageToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //commented
                Toast.makeText(MainActivity.this, "Image has been clicked", Toast.LENGTH_SHORT).show();
            }
        });
        showToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Welcome User", Toast.LENGTH_SHORT).show();
            }
        });

    }
    }
