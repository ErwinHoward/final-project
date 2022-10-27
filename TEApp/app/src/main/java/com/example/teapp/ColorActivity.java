package com.example.teapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.service.autofill.OnClickAction;
import android.view.Menu;
import android.view.View;

public class ColorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color);
    }

    //Metodo para botones Colores
    public void Colores(View view){
        Intent intent = null;
        switch (view.getId()){
            case R.id.button_rojo: intent = new Intent(this,RojoActivity.class);
            break;
            case R.id.button_naranja: intent = new Intent(this, NaranjaActivity.class);
            break;
            case R.id.button_amarillo: intent = new Intent(this, AmarilloActivity.class);
            break;
            case R.id.button_verde: intent = new Intent(this, VerdeActivity.class);
            break;
            case R.id.button_azul: intent = new Intent(this, AzulActivity.class);
            break;
            case R.id.button_morado: intent = new Intent(this,MoradoActivity.class);
            break;
        }
        startActivity(intent);
    }

}