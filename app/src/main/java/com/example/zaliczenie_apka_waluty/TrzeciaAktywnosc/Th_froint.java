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

public class Th_froint extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_th_froint);
        setContentView(R.layout.activity_th_euro);
        TextView nazwa = findViewById(R.id.textViewNapisKoncowy);
        Button cofanie;

        Intent intent = getIntent();
        String wynik = intent.getStringExtra("wynik");
        String waluta = intent.getStringExtra("waluta");

        try{

        double wynik_double = Double.parseDouble(wynik);

        if(waluta.equals("HUF")) {

            nazwa.setText(wynik + " HUF = " + wynik + " HUF");
        }
        else if(waluta.equals("BGN")){
            double wynik_koncowy = wynik_double*0.01;
            nazwa.setText(wynik + " HUF = " + wynik_koncowy + " BGN");
        }
        else if(waluta.equals("RON")){
            double wynik_koncowy = wynik_double*0.03;
            nazwa.setText(wynik + " HUF = " + wynik_koncowy + " RON");
        }
        else if(waluta.equals("HRK")){
            double wynik_koncowy = wynik_double*0.02;
            nazwa.setText(wynik + " HUF = " + wynik_koncowy + " HRK");
        }
        else if(waluta.equals("CZK")){
            double wynik_koncowy = wynik_double*0.14;
            nazwa.setText(wynik + " HUF = " + wynik_koncowy + " CZK");
        }
        else if(waluta.equals("DKK")){
            double wynik_koncowy = wynik_double*0.04;
            nazwa.setText(wynik + " HUF = " + wynik_koncowy + " DKK");
        }
        else if(waluta.equals("SEK")){
            double wynik_koncowy = wynik_double*0.06;
            nazwa.setText(wynik + " HUF = " + wynik_koncowy + " SEK");
        }
        else if(waluta.equals("EUR")){
            double wynik_koncowy = wynik_double*0.05;
            nazwa.setText(wynik + " HUF = " + wynik_koncowy + " EUR");
        }
        else if(waluta.equals("PLN")){
            double wynik_koncowy = wynik_double*0.01;
            nazwa.setText(wynik + " HUF = " + wynik_koncowy + " PLN");
        }
        }catch(NumberFormatException e){
            if(Locale.getDefault().getDisplayLanguage().equals("English")){
                nazwa.setText("Invalid data");
            }
            else if(Locale.getDefault().getDisplayLanguage().equals("polski")){
                nazwa.setText("Nieprawid??owe dane");
            }
            else if(Locale.getDefault().getDisplayLanguage().equals("fran??ais")){
                nazwa.setText("Donn??es non valides");
            }
        }

        cofanie = findViewById(R.id.btn_cofanie);
        cofanie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Th_froint.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}