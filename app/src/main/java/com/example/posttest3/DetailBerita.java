package com.example.posttest3;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.example.posttest3.model.BeritaModel;

public class DetailBerita extends AppCompatActivity {

    ImageView imageBerita;
    TextView txtDetailKategori, txtTitle, txtDeskripsi;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_berita);

        imageBerita = findViewById(R.id.imageBerita);
        txtDetailKategori = findViewById(R.id.txtDetailKategori);
        txtTitle = findViewById(R.id.txtTitle);
        txtDeskripsi = findViewById(R.id.txtDeskripsi);


        BeritaModel berita = getIntent().getExtras().getParcelable("beritaModel");

        Glide.with(this).load(berita.getImages()).into(imageBerita);
        txtDetailKategori.setText(berita.getKategori());
        txtTitle.setText(berita.getJudul());
        txtDeskripsi.setText(berita.getDeskripsi());
    }
}
