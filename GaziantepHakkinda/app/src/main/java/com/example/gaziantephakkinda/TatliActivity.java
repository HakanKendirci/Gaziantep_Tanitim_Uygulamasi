package com.example.gaziantephakkinda;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class TatliActivity extends AppCompatActivity {

    private ListView tatlilarListView_hk;
    private ArrayAdapter<String> adaptertatli_hk;
    private String[] tatlilar = {"Baklava" , "Şöbiyet" , "Kadayıf" , "Künefe", "Leblebili Helva"};

    private Intent baklavaı ,söbiyetı,kadayıfı,künefeı,leblebiı;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tatli);
        tatlilarListView_hk = (ListView) findViewById(R.id.tatlilar_activity_hk);
        adaptertatli_hk = new ArrayAdapter<>(TatliActivity.this, android.R.layout.simple_list_item_1, tatlilar);
        tatlilarListView_hk.setAdapter(adaptertatli_hk);
        tatlilarListView_hk.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                if(i==0)
                {
                    baklavaı=new Intent(TatliActivity.this,baklava.class);
                    startActivity(baklavaı);
                }
                else if (i==1)
                {
                    söbiyetı=new Intent(TatliActivity.this,sobiyet.class);
                    startActivity(söbiyetı);
                }
                else if (i==2)
                {
                    kadayıfı=new Intent(TatliActivity.this, kadayif.class);
                    startActivity(kadayıfı);
                }
                else if (i==3)
                {
                    künefeı=new Intent(TatliActivity.this,kunefe.class);
                    startActivity(künefeı);
                }
                else
                {
                    leblebiı=new Intent(TatliActivity.this, leblebilihelva.class);
                    startActivity(leblebiı);
                }

            }
        });


    }
}