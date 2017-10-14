package com.example.raga.ujianuts;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class menu extends AppCompatActivity {
ImageButton gambar1,gambar2,gambar3,gambar4,gambar5,gambar6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        gambar1=(ImageButton)findViewById(R.id.Image1);
        gambar1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(menu.this,provinsi.class));
                Toast.makeText(menu.this, "macam-macam provinsi diindonesia", Toast.LENGTH_LONG).show();
            }
        });

        gambar2 = (ImageButton)findViewById(R.id.Image2);
        gambar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(menu.this,kota.class));
                Toast.makeText(menu.this, "macam-macam kota diindonesia", Toast.LENGTH_LONG).show();
            }
        });

        gambar3 = (ImageButton)findViewById(R.id.Image3);
        gambar3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(menu.this,makanan.class));
                Toast.makeText(menu.this, "macam-macam kuliner diindonesia", Toast.LENGTH_LONG).show();
            }
        });

        gambar4 = (ImageButton)findViewById(R.id.Image4);
        gambar4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(menu.this,wisata.class));
                Toast.makeText(menu.this, "macam-macam tempat wisata diindonesia", Toast.LENGTH_LONG).show();
            }
        });
        gambar5 = (ImageButton)findViewById(R.id.Image5);
        gambar5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(menu.this,profile.class));
                Toast.makeText(menu.this, "ini adalah profile saya", Toast.LENGTH_LONG).show();
            }
        });

        gambar6 = (ImageButton)findViewById(R.id.Image6);
        gambar6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(menu.this,versi.class));
                Toast.makeText(menu.this, "ini adalah versi aplikasi", Toast.LENGTH_SHORT).show();
            }
        });


    }
}
