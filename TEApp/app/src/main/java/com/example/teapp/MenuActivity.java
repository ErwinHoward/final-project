package com.example.teapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MenuActivity extends AppCompatActivity {
    TextView nombre;
    int id = 0;
    Usuario u;
    daoUsuario dao;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        nombre =(TextView) findViewById(R.id.Nombremenu_text);

        Bundle b = getIntent().getExtras();
        id = b.getInt("Id");
        dao = new daoUsuario(this);
        u = dao.getUsuarioById(id);

        nombre.setText(u.getNombre()+ " " + u.getApellidos());
    }

    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.menu_config:
                menuConfig();
                return true;
            case R.id.menu_salir:
                menuSalir();
                return  true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    private void menuConfig(){
        Intent intent = new Intent(this,CuentaActivity.class);
        intent.putExtra("Id",id);
        startActivity(intent);
    }
    private void menuSalir(){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
        finish();
    }
    //Metodo para mostrar el menu
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }
    //Acciones de los botones del menu
    public void Opciones(View view){
        Intent intent = null;
        switch (view.getId()){
            case R.id.abc_Button: intent = new Intent(this,AbcActivity.class);
                break;
            case R.id.color_Button: intent = new Intent(this, ColorActivity.class);
                break;
            case R.id.senal_Button: intent = new Intent(this, SenalActivity.class);
                break;
            case R.id.cominicacion_Button: intent = new Intent(this, ComunicacionActivity.class);
                break;
        }
        startActivity(intent);
    }
    public void Sonido_opciones(View view){
        switch (view.getId()) {
            case R.id.senales:
                MediaPlayer opc1mp = MediaPlayer.create(this, R.raw.opcion_senales);
                opc1mp.start();
                break;
            case R.id.colores:
                MediaPlayer opc2mp = MediaPlayer.create(this,R.raw.opcion_colores);
                opc2mp.start();
                break;
            case R.id.comunicacion:
                MediaPlayer opc3mp = MediaPlayer.create(this,R.raw.opcion_comunicacion);
                opc3mp.start();
                break;
            case R.id.abc:
                MediaPlayer opc4mp = MediaPlayer.create(this,R.raw.opcion_abecedario);
                opc4mp.start();
                break;
        }
    }
}