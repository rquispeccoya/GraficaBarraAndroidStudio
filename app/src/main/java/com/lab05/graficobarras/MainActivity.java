package com.lab05.graficobarras;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        int [] cantidad ={5,60,80};

        String[]tags={"perro","gato","perico"};
        int color= ContextCompat.getColor(this, R.color.teal_200);
        setContentView(new GraficoBarras(this,cantidad,tags,color));

        //GraficoBarras graficoBarras = new GraficoBarras(this,cantidad,tags);
        //setContentView(R.layout.activity_main);
    }
}