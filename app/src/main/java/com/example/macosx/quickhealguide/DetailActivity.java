package com.example.macosx.quickhealguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    TextView txtdetailjudul,txtdetailgejala,txtdetailpenanganan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        txtdetailjudul = findViewById(R.id.detailjudul);
        txtdetailgejala = findViewById(R.id.detailgejala);
        txtdetailpenanganan = findViewById(R.id.detailpenanganan);

        String judul = getIntent().getStringExtra("judul");
        int gejala = getIntent().getIntExtra("gejala",0);
        int penanganan = getIntent().getIntExtra("penanganan",0);

        txtdetailjudul.setText(judul);
        txtdetailgejala.setText(gejala);
        txtdetailpenanganan.setText(penanganan);
    }
}
