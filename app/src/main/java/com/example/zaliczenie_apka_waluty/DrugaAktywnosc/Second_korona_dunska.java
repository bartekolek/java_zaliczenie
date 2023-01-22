package com.example.zaliczenie_apka_waluty.DrugaAktywnosc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.zaliczenie_apka_waluty.R;
import com.example.zaliczenie_apka_waluty.TrzeciaAktywnosc.Th_euro;
import com.example.zaliczenie_apka_waluty.TrzeciaAktywnosc.Th_korona_dunska;

public class Second_korona_dunska extends AppCompatActivity {

    Button btn_euro;
    Button btn_lew;
    Button btn_lej;
    Button btn_kuna;
    Button btn_korona_czeska;
    Button btn_korona_dunska;
    Button btn_korona_szwedzka;
    Button btn_froint;
    Button btn_pln;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sec_korona_dunska);

        btn_euro = findViewById(R.id.btn_euro_dwa);
        btn_lew = findViewById(R.id.btn_lew_dwa);
        btn_lej = findViewById(R.id.btn_lej_dwa);
        btn_kuna = findViewById(R.id.btn_kuna_dwa);
        btn_korona_czeska = findViewById(R.id.btn_korona_czeska_dwa);
        btn_korona_dunska = findViewById(R.id.btn_korona_dunska_dwa);
        btn_korona_szwedzka = findViewById(R.id.btn_korona_szwedzka_dwa);
        btn_froint = findViewById(R.id.btn_froint_dwa);
        btn_pln = findViewById(R.id.btn_pln_dwa);

        EditText wartosc = findViewById(R.id.editTextWartosc);

        btn_euro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String wynik = wartosc.getText().toString();
                String waluta = "EUR";

                Intent intent = new Intent(Second_korona_dunska.this, Th_korona_dunska.class);
                intent.putExtra("wynik",wynik);
                intent.putExtra("waluta",waluta);
                startActivity(intent);
            }
        });
        btn_lew.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String wynik = wartosc.getText().toString();
                String waluta = "BGN";

                Intent intent = new Intent(Second_korona_dunska.this, Th_korona_dunska.class);
                intent.putExtra("wynik",wynik);
                intent.putExtra("waluta",waluta);
                startActivity(intent);
            }
        });
        btn_lej.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String wynik = wartosc.getText().toString();
                String waluta = "RON";

                Intent intent = new Intent(Second_korona_dunska.this, Th_korona_dunska.class);
                intent.putExtra("wynik",wynik);
                intent.putExtra("waluta",waluta);
                startActivity(intent);
            }
        });
        btn_kuna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String wynik = wartosc.getText().toString();
                String waluta = "HRK";

                Intent intent = new Intent(Second_korona_dunska.this, Th_korona_dunska.class);
                intent.putExtra("wynik",wynik);
                intent.putExtra("waluta",waluta);
                startActivity(intent);
            }
        });
        btn_korona_czeska.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String wynik = wartosc.getText().toString();
                String waluta = "CZK";

                Intent intent = new Intent(Second_korona_dunska.this, Th_korona_dunska.class);
                intent.putExtra("wynik",wynik);
                intent.putExtra("waluta",waluta);
                startActivity(intent);
            }
        });
        btn_korona_dunska.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String wynik = wartosc.getText().toString();
                String waluta = "DKK";

                Intent intent = new Intent(Second_korona_dunska.this, Th_korona_dunska.class);
                intent.putExtra("wynik",wynik);
                intent.putExtra("waluta",waluta);
                startActivity(intent);
            }
        });
        btn_korona_szwedzka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String wynik = wartosc.getText().toString();
                String waluta = "SEK";

                Intent intent = new Intent(Second_korona_dunska.this, Th_korona_dunska.class);
                intent.putExtra("wynik",wynik);
                intent.putExtra("waluta",waluta);
                startActivity(intent);
            }
        });
        btn_froint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String wynik = wartosc.getText().toString();
                String waluta = "HUF";

                Intent intent = new Intent(Second_korona_dunska.this, Th_korona_dunska.class);
                intent.putExtra("wynik",wynik);
                intent.putExtra("waluta",waluta);
                startActivity(intent);
            }
        });
        btn_pln.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String wynik = wartosc.getText().toString();
                String waluta = "PLN";

                Intent intent = new Intent(Second_korona_dunska.this, Th_korona_dunska.class);
                intent.putExtra("wynik",wynik);
                intent.putExtra("waluta",waluta);
                startActivity(intent);
            }
        });
    }
}