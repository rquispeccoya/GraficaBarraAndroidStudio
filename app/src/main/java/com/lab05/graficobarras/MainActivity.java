package com.lab05.graficobarras;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        int [] cantidad ={5,60,80,10,4,3,8,20,86,91};
        //int [] cantidad ={70};
        String[]tags={"perro","gato","perico","elefante","liebre","pericote","raton","xx","yy","nn"};
        //String []tags={"perro"};
        int color= ContextCompat.getColor(this, R.color.rojo);
        setContentView(new GraficoBarras(this,cantidad,tags,color));

        //GraficoBarras graficoBarras = new GraficoBarras(this,cantidad,tags);
        //setContentView(R.layout.activity_main);
    }
}