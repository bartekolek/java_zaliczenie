package com.example.zaliczenie_apka_waluty.TrzeciaAktywnosc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.zaliczenie_apka_waluty.DrugaAktywnosc.Second_euro;
import com.example.zaliczenie_apka_waluty.MainActivity;
import com.example.zaliczenie_apka_waluty.R;

import java.util.Locale;

public class Th_euro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_th_euro);

        TextView nazwa = findViewById(R.id.textViewNapisKoncowy);
        Button cofanie;
        cofanie = findViewById(R.id.btn_cofanie);

        Intent intent = getIntent();
        String wynik = intent.getStringExtra("wynik");
        String waluta = intent.getStringExtra("waluta");

        try {
            double wynik_double = Double.parseDouble(wynik);

            if (waluta.equals("EUR")) {

                nazwa.setText(wynik + " EUR = " + wynik + " EUR");
            } else if (waluta.equals("BGN")) {
                double wynik_koncowy = wynik_double * 1.96;
                nazwa.setText(wynik + " EUR = " + wynik_koncowy + " BGN");
            } else if (waluta.equals("RON")) {
                double wynik_koncowy = wynik_double * 4.95;
                nazwa.setText(wynik + " EUR = " + wynik_koncowy + " RON");
            } else if (waluta.equals("HRK")) {
                double wynik_koncowy = wynik_double * 7.52;
                nazwa.setText(wynik + " EUR = " + wynik_koncowy + " HRK");
            } else if (waluta.equals("CZK")) {
                double wynik_koncowy = wynik_double * 24.86;
                nazwa.setText(wynik + " EUR = " + wynik_koncowy + " CZK");
            } else if (waluta.equals("DKK")) {
                double wynik_koncowy = wynik_double * 7.44;
                nazwa.setText(wynik + " EUR = " + wynik_koncowy + " DKK");
            } else if (waluta.equals("SEK")) {
                double wynik_koncowy = wynik_double * 10.28;
                nazwa.setText(wynik + " EUR = " + wynik_koncowy + " SEK");
            } else if (waluta.equals("HUF")) {
                double wynik_koncowy = wynik_double * 367.64;
                nazwa.setText(wynik + " EUR = " + wynik_koncowy + " HUF");
            } else if (waluta.equals("PLN")) {
                double wynik_koncowy = wynik_double * 4.59;
                nazwa.setText(wynik + " EUR = " + wynik_koncowy + " PLN");
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
                Intent intent = new Intent(Th_euro.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}