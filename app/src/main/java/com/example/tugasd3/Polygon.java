package com.example.tugasd3;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Polygon extends AppCompatActivity {
    Button btnback, btnshare;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_polygon);
        btnback = findViewById(R.id.btnback);
        btnshare = findViewById(R.id.btnshare);
        klik();
    }
    void klik(){
        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentback = new Intent(Polygon.this, Sepeda.class);
                startActivity(intentback);
            }
        });
        btnshare.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("QueryPermissionsNeeded")
            @Override
            public void onClick(View v) {
                Intent intentshare = new Intent();
                intentshare.setAction(Intent.ACTION_SEND);
                intentshare.putExtra(Intent.EXTRA_TEXT, "Nama Barang : Sepeda Polygon, Harga Barang 2jt, Warna : Hijau");

                intentshare.setType("text/plain");

                if (intentshare.resolveActivity(getPackageManager()) != null){
                    startActivity(intentshare);
                }
            }
        });
    }
}