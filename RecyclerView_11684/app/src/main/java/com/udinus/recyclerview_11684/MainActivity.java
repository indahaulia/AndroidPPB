package com.udinus.recyclerview_11684;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView daftarTeman = (RecyclerView) findViewById(R.id.daftarTeman);

        daftarTeman.setLayoutManager(new LinearLayoutManager((this)));
        String[] nama = {"Adi","Elya","Cindy","Nisa","Ifa","Uzi","Brian","Ayu","Langit","Fafa"};
        daftarTeman.setAdapter(new AdapterNama(nama));
    }
}