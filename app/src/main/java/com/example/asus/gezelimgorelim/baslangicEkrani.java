package com.example.asus.gezelimgorelim;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class baslangicEkrani extends AppCompatActivity {


    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hosgeldin);

        Thread zamanlayici = new Thread(){

        public void run(){

            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            finally {
                Intent intent  = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);

            }
        }


        };
        zamanlayici.start();





    }
}
