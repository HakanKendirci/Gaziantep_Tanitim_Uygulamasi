package com.example.gaziantephakkinda;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

public class TarihiYerlerActivity extends AppCompatActivity {


    private ListView tarihiyerlerListView_hk;
    private ArrayAdapter<String> adaptertarihi_hk;
    private String[] tarihiyerlermenü = {"Gaziantep Kalesi", "Rumkale", "Karkamış Antik Kenti", "Zeugma Antik Kenti", "Tarihi Millet Hanı" };


    private Intent kaleIntent,rumkaleIntent,karkamisIntent, zeugmaIntent,millethanıIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tarihi_yerler);
        tarihiyerlerListView_hk = (ListView) findViewById(R.id.tarihi_yerler_activity_hk);
        adaptertarihi_hk = new ArrayAdapter<>(TarihiYerlerActivity.this, android.R.layout.simple_list_item_1, tarihiyerlermenü);
        tarihiyerlerListView_hk.setAdapter(adaptertarihi_hk);
        tarihiyerlerListView_hk.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i==0)
                {
                kaleIntent=new Intent(TarihiYerlerActivity.this, kale.class);
                startActivity(kaleIntent);  }
                else if (i==1)
                {
                rumkaleIntent=new Intent(TarihiYerlerActivity.this,rumkale.class);
                startActivity(rumkaleIntent);
                }

                else if (i==2)
                {
                karkamisIntent=new Intent(TarihiYerlerActivity.this,karkamis.class);
                startActivity(karkamisIntent);
                }
                else if (i==3)
                {
                zeugmaIntent=new Intent(TarihiYerlerActivity.this, zeugma.class);
                startActivity(zeugmaIntent);
                }
                else
                {
                    millethanıIntent=new Intent(TarihiYerlerActivity.this, millethani.class);
                    startActivity(millethanıIntent);
                }


            }
        });


    }
}