package com.example.teapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegistroActivity extends AppCompatActivity implements View.OnClickListener {

    EditText us, pass, nom, ap;
    Button btncrear, btncancelar;
    daoUsuario dao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
        us = (EditText)findViewById(R.id.RegUser);
        pass = (EditText)findViewById(R.id.RegPassword);
        nom = (EditText)findViewById(R.id.RegUsername);
        ap = (EditText)findViewById(R.id.RegUserApe);
        btncrear = (Button) findViewById(R.id.Crear_button);
        btncancelar = (Button) findViewById(R.id.Cancelar_button);
        btncrear.setOnClickListener(this);
        btncancelar.setOnClickListener(this);
        dao = new daoUsuario(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.Crear_button:
                Usuario u = new Usuario();
                u.setUsuario(us.getText().toString());
                u.setPassword(pass.getText().toString());
                u.setNombre(nom.getText().toString());
                u.setApellidos(ap.getText().toString());
                if (!u.isNull()){
                    Toast.makeText(this, "ERROR: Campos vacios", Toast.LENGTH_SHORT).show();
                }else if (dao.insertUsuario(u)){
                    Toast.makeText(this, "Registro Exitoso", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(this,MainActivity.class);
                    startActivity(intent);
                    finish();
                }else{
                    Toast.makeText(this, "Usuario ya registrado", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.Cancelar_button:
                Intent intent = new Intent(this,MainActivity.class);
                startActivity(intent);
                finish();
                break;
        }
    }
}