package com.example.zaliczenie_apka_waluty.TrzeciaAktywnosc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.zaliczenie_apka_waluty.MainActivity;
import com.example.zaliczenie_apka_waluty.R;

import java.util.Locale;

public class Th_lew extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_th_lew);

        TextView nazwa = findViewById(R.id.textViewNapisKoncowy);
        Button cofanie;

        Intent intent = getIntent();
        String wynik = intent.getStringExtra("wynik");
        String waluta = intent.getStringExtra("waluta");
        try {
            double wynik_double = Double.parseDouble(wynik);

            if (waluta.equals("BGN")) {

                nazwa.setText(wynik + " BGN = " + wynik + " BGN");
            } else if (waluta.equals("EUR")) {
                double wynik_koncowy = wynik_double * 0.51;
                nazwa.setText(wynik + " BGN = " + wynik_koncowy + " EUR");
            } else if (waluta.equals("RON")) {
                double wynik_koncowy = wynik_double * 2.53;
                nazwa.setText(wynik + " BGN = " + wynik_koncowy + " RON");
            } else if (waluta.equals("HRK")) {
                double wynik_koncowy = wynik_double * 3.84;
                nazwa.setText(wynik + " BGN = " + wynik_koncowy + " HRK");
            } else if (waluta.equals("CZK")) {
                double wynik_koncowy = wynik_double * 12.71;
                nazwa.setText(wynik + " BGN = " + wynik_koncowy + " CZK");
            } else if (waluta.equals("DKK")) {
                double wynik_koncowy = wynik_double * 3.80;
                nazwa.setText(wynik + " BGN = " + wynik_koncowy + " DKK");
            } else if (waluta.equals("SEK")) {
                double wynik_koncowy = wynik_double * 5.26;
                nazwa.setText(wynik + " BGN = " + wynik_koncowy + " SEK");
            } else if (waluta.equals("HUF")) {
                double wynik_koncowy = wynik_double * 187.97;
                nazwa.setText(wynik + " BGN = " + wynik_koncowy + " HUF");
            } else if (waluta.equals("PLN")) {
                double wynik_koncowy = wynik_double * 2.35;
                nazwa.setText(wynik + " BGN = " + wynik_koncowy + " PLN");
            }
        }catch(NumberFormatException e){
            if(Locale.getDefault().getDisplayLanguage().equals("English")){
                nazwa.setText("Invalid data");
            }
            else if(Locale.getDefault().getDisplayLanguage().equals("polski")){
                nazwa.setText("Nieprawidłowe dane");
            }
            else if(Locale.getDefault().getDisplayLanguage().equals("français")){
                nazwa.setText("Données non valides");
            }
        }

        cofanie = findViewById(R.id.btn_cofanie);
        cofanie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Th_lew.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}