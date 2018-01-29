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

public class Anadir_comunidad extends AppCompatActivity implements View.OnClickListener {
    Button bt_anadir_buscar, bt_anadir_crear;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anadircomunidad);
        bt_anadir_buscar = (Button) findViewById(R.id.bt_anadir_buscar);
        bt_anadir_crear = (Button) findViewById(R.id.bt_anadir_crear);

        bt_anadir_buscar.setOnClickListener(this);
        bt_anadir_crear.setOnClickListener(this);

        buscarComunidad();


    }

    @Override
    public void onClick(View v) {
        if (v == bt_anadir_buscar) {
            buscarComunidad();
        }
        if (v == bt_anadir_crear) {
            crearComunidad();
        }

    }

    public void buscarComunidad() {
        Fragment fragmentoSeleccionado2 = new buscar_comunidad();
        FragmentManager fm2 = getSupportFragmentManager();
        FragmentTransaction t2 = fm2.beginTransaction();
        t2.replace(R.id.contenedor, fragmentoSeleccionado2);
        t2.commit();
    }

    public void crearComunidad() {
        Fragment fragmentoSeleccionado1 = new crear_comunidad();
        FragmentManager fm1 = getSupportFragmentManager();
        FragmentTransaction t1 = fm1.beginTransaction();
        t1.replace(R.id.contenedor, fragmentoSeleccionado1);
        t1.commit();
    }


}
