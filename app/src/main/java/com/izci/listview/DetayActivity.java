package com.izci.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class DetayActivity extends AppCompatActivity {

    private TextView detayText;

    private String[] detayListe;

    private String pozisyonAnahtari = "pozisyonAnahtari";

    private int detayPozisyon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detay);

        detayText = (TextView) findViewById(R.id.detayTextView);

        detayListe = new String[] { "Detay 1", "Detay 2", "Detay 3", "Detay 4", "Detay 5"};


        detayPozisyon = getIntent().getIntExtra(pozisyonAnahtari, -1);


        if (detayPozisyon == -1) {
            Toast.makeText(DetayActivity.this, "Hata Var!", Toast.LENGTH_LONG).show();
        } else {
            detayText.setText(detayListe[detayPozisyon]);
        }

    }
}