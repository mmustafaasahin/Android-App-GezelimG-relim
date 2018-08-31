package com.example.asus.gezelimgorelim;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private String[] iller = {"01 Adana","02 Adıyaman","03 Afyon","04 Ağrı","05 Amasya","06 Ankara","07 Antalya","08 Artvin",
            "09 Aydın","10 Balıkesir","11 Bilecik","12 Bingöl","13 Bitlis","14 Bolu","15 Burdur","16 Bursa","17 Çanakkale",
            "18 Çankırı","19 Çorum","20 Denizli","21 Diyarbakır","22 Edirne","23 Elazığ","24 Erzincan","25 Erzurum","26 Eskişehir",
            "27 Gaziantep","28 Giresun","29 Gümüşhane","30 Hakkari","31 Hatay","32 Isparta","33 İçel","34 İstanbul","35 İzmir",
            "36 Kars","37 Kastamonu","38 Kayseri","39 Kırklareli","40 Kırşehir","41 Kocaeli","42 Konya","43 Kütahya","44 Malatya",
            "45 Manisa","46 K.maraş","47 Mardin","48 Muğla","49 Muş","50 Nevşehir","51 Niğde","52 Ordu","53 Rize","54 Sakarya",
            "55 Samsun","56 Siirt","57 Sinop","58 Sivas","59 Tekirdağ","60 Tokat","61 Trabzon","62 Tunceli","63 Şanlıurfa","64 Uşak",
            "65 Van","66 Yozgat","67 Zonguldak","68 Aksaray","69 Bayburt","70 Karaman","71 Kırıkkale","72 Batman","73 Şırnak",
            "74 Bartın","75 Ardahan","76 Iğdır","77 Yalova","78 Karabük","79 Kilis","80 Osmaniye","81 Düzce"};


    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.listView);


        final ArrayAdapter<String> adapter = new  ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, iller);


        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent = new Intent(getApplicationContext(),Main2Activity.class);
                intent.putExtra("il",iller[position]);
                startActivity(intent);

            }
        });


    }
    @Override
    public void onBackPressed(){
        super.onBackPressed();
        finish();
        ActivityCompat.finishAffinity(this);

    }


}
