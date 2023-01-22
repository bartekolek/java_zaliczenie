package com.example.zaliczenie_apka_waluty;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.zaliczenie_apka_waluty.DrugaAktywnosc.Second_euro;
import com.example.zaliczenie_apka_waluty.DrugaAktywnosc.Second_froint;
import com.example.zaliczenie_apka_waluty.DrugaAktywnosc.Second_korona_czeska;
import com.example.zaliczenie_apka_waluty.DrugaAktywnosc.Second_korona_dunska;
import com.example.zaliczenie_apka_waluty.DrugaAktywnosc.Second_korona_szwedzka;
import com.example.zaliczenie_apka_waluty.DrugaAktywnosc.Second_kuna;
import com.example.zaliczenie_apka_waluty.DrugaAktywnosc.Second_lej;
import com.example.zaliczenie_apka_waluty.DrugaAktywnosc.Second_lew;
import com.example.zaliczenie_apka_waluty.DrugaAktywnosc.Second_pln;

public class MainActivity extends AppCompatActivity {

    Button button_eur;
    Button button_lew;
    Button button_lej;
    Button button_korona_czeska;
    Button button_korona_dunska;
    Button button_korona_szwedzka;
    Button button_froint;
    Button button_pln;
    Button button_kuna;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_eur = findViewById(R.id.btn_euro);
        button_lew = findViewById(R.id.btn_lew);
        button_lej = findViewById(R.id.btn_lej);
        button_korona_czeska = findViewById(R.id.btn_korona_czeska);
        button_korona_dunska = findViewById(R.id.btn_korona_dunska);
        button_korona_szwedzka = findViewById(R.id.btn_korona_szwedzka);
        button_froint = findViewById(R.id.btn_froint);
        button_pln = findViewById(R.id.btn_pln);
        button_kuna = findViewById(R.id.btn_kuna);

        button_eur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Second_euro.class);
                startActivity(intent);
            }
        });
        button_korona_dunska.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Second_korona_dunska.class);
                startActivity(intent);
            }
        });
        button_pln.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Second_pln.class);
                startActivity(intent);
            }
        });
        button_lew.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Second_lew.class);
                startActivity(intent);
            }
        });
        button_lej.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Second_lej.class);
                startActivity(intent);
            }
        });
        button_korona_szwedzka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Second_korona_szwedzka.class);
                startActivity(intent);
            }
        });
        button_froint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Second_froint.class);
                startActivity(intent);
            }
        });
        button_kuna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Second_kuna.class);
                startActivity(intent);
            }
        });
        button_korona_czeska.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Second_kuna.class);
                startActivity(intent);
            }
        });
    }
}