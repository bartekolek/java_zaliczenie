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

public class Th_korona_dunska extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_th_korona_dunska);

        TextView nazwa = findViewById(R.id.textViewNapisKoncowy);
        Button cofanie;


        Intent intent = getIntent();
        String wynik = intent.getStringExtra("wynik");
        String waluta = intent.getStringExtra("waluta");

        try {
            double wynik_double = Double.parseDouble(wynik);

            if (waluta.equals("DKK")) {

                nazwa.setText(wynik + " DKK = " + wynik + " DKK");
            } else if (waluta.equals("BGN")) {
                double wynik_koncowy = wynik_double * 0.26;
                nazwa.setText(wynik + " DKK = " + wynik_koncowy + " BGN");
            } else if (waluta.equals("RON")) {
                double wynik_koncowy = wynik_double * 0.67;
                nazwa.setText(wynik + " DKK = " + wynik_koncowy + " RON");
            } else if (waluta.equals("HRK")) {
                double wynik_koncowy = wynik_double * 1.01;
                nazwa.setText(wynik + " DKK = " + wynik_koncowy + " HRK");
            } else if (waluta.equals("CZK")) {
                double wynik_koncowy = wynik_double * 3.34;
                nazwa.setText(wynik + " DKK = " + wynik_koncowy + " CZK");
            } else if (waluta.equals("EUR")) {
                double wynik_koncowy = wynik_double * 0.13;
                nazwa.setText(wynik + " DKK = " + wynik_koncowy + " EUR");
            } else if (waluta.equals("SEK")) {
                double wynik_koncowy = wynik_double * 1.38;
                nazwa.setText(wynik + " DKK = " + wynik_koncowy + " SEK");
            } else if (waluta.equals("HUF")) {
                double wynik_koncowy = wynik_double * 49.44;
                nazwa.setText(wynik + " DKK = " + wynik_koncowy + " HUF");
            } else if (waluta.equals("PLN")) {
                double wynik_koncowy = wynik_double * 0.62;
                nazwa.setText(wynik + " DKK = " + wynik_koncowy + " PLN");
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
                Intent intent = new Intent(Th_korona_dunska.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}