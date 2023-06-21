package com.example.gaziantephakkinda;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private ListView listView_hk;
    private ArrayAdapter<String> adapteranamenu_hk;
    private String[] anamenu = {"Gaziantep Tarihçesi", "Gaziantep'deki Tarihi Yerler", "Gaziantep Yöresel Yemekleri", "Gaziantep Yöresel Tatlıları"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView_hk = (ListView) findViewById(R.id.ana_sayfa_activity_hk);
        adapteranamenu_hk = new ArrayAdapter<>( MainActivity.this, android.R.layout.simple_list_item_1, anamenu);
        listView_hk.setAdapter(adapteranamenu_hk);
        listView_hk.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i==0) {

                    startActivity(new Intent(MainActivity.this, TarihceActivity.class));
                }
                else if (i==1) {

                    startActivity(new Intent(MainActivity.this, TarihiYerlerActivity.class));
                    
                } else if (i==2) {

                    startActivity(new Intent(MainActivity.this, YemekActivity.class));

                }
                else {

                    startActivity(new Intent(MainActivity.this, TatliActivity.class));
                }
            }
        });


    }}