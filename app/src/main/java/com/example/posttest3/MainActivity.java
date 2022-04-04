package com.example.posttest3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.posttest3.adapter.BeritaAdapter;
import com.example.posttest3.model.BeritaModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    RecyclerView rvBerita;
    List<BeritaModel> listBerita= new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvBerita=findViewById(R.id.rvBerita);
        listBerita.add(new BeritaModel("Orang ini mati 3 kali, ini kata resti","Health","https://assets.pikiran-rakyat.com/crop/0x0:0x0/x/photo/2022/03/30/2810251709.jpg", "Ini adalah salah satu manusia yang paling sok tau di dunia"));
        listBerita.add(new BeritaModel("Juara Coding itu mantap, ini kata nining","Lifestyle","https://juaracoding.com/public/dummy/img_pak_paulus.png", "Salah satu Pengajar di JuaraCoding yang teladan dan juga kadang absurd"));
        listBerita.add(new BeritaModel("Banci ini ditangkap warga karna tidak banci","Travel","https://cdn0-production-images-kly.akamaized.net/C78TuqRI6EvujNd5nHZApBQ9apw=/1200x900/smart/filters:quality(75):strip_icc():format(jpeg)/kly-media-production/medias/3951801/original/052272700_1646356554-Tessy_1.jpg", "Artis yang baik hati dan juga humble"));

        BeritaAdapter adapter = new BeritaAdapter(listBerita,this);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this,LinearLayoutManager.VERTICAL,false);
        rvBerita.setLayoutManager(layoutManager);
        rvBerita.setAdapter(adapter);
    }
}