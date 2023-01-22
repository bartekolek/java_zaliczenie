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

public class Th_pln extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_th_pln);
        TextView nazwa = findViewById(R.id.textViewNapisKoncowy);
        Button cofanie;
        cofanie = findViewById(R.id.btn_cofanie);






        Intent intent = getIntent();
        String wynik = intent.getStringExtra("wynik");
        String waluta = intent.getStringExtra("waluta");

        try {
            double wynik_double = Double.parseDouble(wynik);

            if (waluta.equals("PLN")) {

                nazwa.setText(wynik + " PLN = " + wynik + " PLN");
            } else if (waluta.equals("BGN")) {
                double wynik_koncowy = wynik_double * 0.43;
                nazwa.setText(wynik + " PLN = " + wynik_koncowy + " BGN");
            } else if (waluta.equals("RON")) {
                double wynik_koncowy = wynik_double * 1.08;
                nazwa.setText(wynik + " PLN = " + wynik_koncowy + " RON");
            } else if (waluta.equals("HRK")) {
                double wynik_koncowy = wynik_double * 1.64;
                nazwa.setText(wynik + " PLN = " + wynik_koncowy + " HRK");
            } else if (waluta.equals("CZK")) {
                double wynik_koncowy = wynik_double * 5.42;
                nazwa.setText(wynik + " PLN = " + wynik_koncowy + " CZK");
            } else if (waluta.equals("DKK")) {
                double wynik_koncowy = wynik_double * 1.62;
                nazwa.setText(wynik + " PLN = " + wynik_koncowy + " DKK");
            } else if (waluta.equals("SEK")) {
                double wynik_koncowy = wynik_double * 2.24;
                nazwa.setText(wynik + " PLN = " + wynik_koncowy + " SEK");
            } else if (waluta.equals("HUF")) {
                double wynik_koncowy = wynik_double * 80.12;
                nazwa.setText(wynik + " PLN = " + wynik_koncowy + " HUF");
            } else if (waluta.equals("EUR")) {
                double wynik_koncowy = wynik_double * 0.22;
                nazwa.setText(wynik + " PLN = " + wynik_koncowy + " EUR");
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


        cofanie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Th_pln.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}