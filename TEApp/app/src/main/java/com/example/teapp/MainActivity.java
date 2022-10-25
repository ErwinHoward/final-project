package com.example.teapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Metodo boton colores
    public void Colores(View view)
    {
        Intent colores = new Intent(this,ColorActivity.class);
        startActivity(colores);
    }

    //Metodo boton ABC
    public  void Abc(View view){
        Intent abc = new Intent(this,AbcActivity.class);
        startActivity(abc);
    }
}