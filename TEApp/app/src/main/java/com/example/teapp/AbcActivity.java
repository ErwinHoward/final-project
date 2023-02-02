package com.example.teapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AbcActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abc);
    }

    //Acciones de los botones del Abc
    public void Botonabc(View view) {
        Intent intent = null;
        switch (view.getId()){
            case R.id.A_Button: intent = new Intent(this,AletraActivity.class);
                break;
            case R.id.B_Button: intent = new Intent(this,BletraActivity.class);
                break;
            case R.id.C_Button: intent = new Intent(this, CletraActivity.class);
                break;
            case R.id.D_Button: intent = new Intent(this, DletraActivity.class);
                break;
            case R.id.E_Button: intent = new Intent(this, EletraActivity.class);
                break;
            case R.id.F_Button: intent = new Intent(this, FletraActivity.class);
                break;
            case R.id.G_Button: intent = new Intent(this, GletraActivity.class);
            break;
            case R.id.H_Button: intent = new Intent(this, HletraActivity.class);
                break;
            case R.id.I_Button: intent = new Intent(this, IletraActivity.class);
                break;
            case R.id.J_Button: intent = new Intent(this, JletraActivity.class);
                break;
            case R.id.K_Button: intent = new Intent(this, KletraActivity.class);
                break;
            case R.id.L_Button: intent = new Intent(this, LletraActivity.class);
                break;
            case R.id.M_Button: intent = new Intent(this, MletraActivity.class);
                break;
            case R.id.N_Button: intent = new Intent(this, NletraActivity.class);
                break;
                //NN = Ñ
            case R.id.NN_Button: intent = new Intent(this, NNletraActivity.class);
                break;
            case R.id.O_Button: intent = new Intent(this, RletraActivity.class);
                break;
            case R.id.P_Button: intent = new Intent(this, PletraActivity.class);
                break;
            case R.id.Q_Button: intent = new Intent(this, QletraActivity.class);
                break;
            case R.id.R_Button: intent = new Intent(this, RletraActivity.class);
                break;
            case R.id.S_Button: intent = new Intent(this, SletraActivity.class);
                break;
            case R.id.T_Button: intent = new Intent(this, TletraActivity.class);
                break;
            case R.id.U_Button: intent = new Intent(this, UletraActivity.class);
                break;
            case R.id.V_Button: intent = new Intent(this, VletraActivity.class);
                break;
            case R.id.W_Button: intent = new Intent(this, WletraActivity.class);
                break;
            case R.id.X_Button: intent = new Intent(this, XletraActivity.class);
                break;
            case R.id.Y_Button: intent = new Intent(this, YletraActivity.class);
                break;
            case R.id.Z_Button: intent = new Intent(this, ZletraActivity.class);
                break;
        }
        startActivity(intent);
        finish();
    }
}