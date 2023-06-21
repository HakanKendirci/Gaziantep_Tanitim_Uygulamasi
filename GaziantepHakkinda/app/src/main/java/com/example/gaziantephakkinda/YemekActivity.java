package com.example.gaziantephakkinda;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class YemekActivity extends AppCompatActivity {

    private ListView yemekListView_hk;

    private ArrayAdapter<String> adapteryemek_hk;
    private String[] yemekler = {"Lahmacun", "Nohut Dürüm", "Firik Pilavı", "İçli Köfte", "Pirpirim Aşı", };

    private Intent lahmacunIntent,nohutIntent, firikIntent, icliIntent, pirpirimIntent;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yemek);
        yemekListView_hk = (ListView) findViewById(R.id.yemek_activity_hk);
        adapteryemek_hk = new ArrayAdapter<>(YemekActivity.this, android.R.layout.simple_list_item_1, yemekler);
        yemekListView_hk.setAdapter(adapteryemek_hk);
        yemekListView_hk.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                if(i==0)
                {
                    lahmacunIntent=new Intent(YemekActivity.this, lahmacun.class);
                    startActivity(lahmacunIntent);
                }
                else if (i==1)
                {
                    nohutIntent=new Intent(YemekActivity.this, nohutdurum.class);
                    startActivity(nohutIntent);
                }
                else if (i==2)
                {
                    firikIntent=new Intent(YemekActivity.this, firik.class);
                    startActivity(firikIntent);
                }
                else if (i==3)
                {
                    icliIntent=new Intent(YemekActivity.this, iclikofte.class);
                    startActivity(icliIntent);
                }
                else
                {
                    pirpirimIntent=new Intent(YemekActivity.this, pirpirimasi.class);
                    startActivity(pirpirimIntent);
                }

            }
        });


    }
}