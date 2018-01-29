package com.example.jose.prueba_fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by jose on 29/01/2018.
 */

public class Anadir_comunidad extends AppCompatActivity{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anadircomunidad);
        buscarComunidad();
    }

    public void buscarComunidad() {
        Fragment fragmentoSeleccionado2 = new buscar_comunidad();
        FragmentManager fm2 = getSupportFragmentManager();
        FragmentTransaction t2 = fm2.beginTransaction();
        t2.replace(R.id.contenedor, fragmentoSeleccionado2);
        t2.commit();
    }


}
