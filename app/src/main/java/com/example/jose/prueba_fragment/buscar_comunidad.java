package com.example.jose.prueba_fragment;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.FloatRange;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.transition.Transition;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class buscar_comunidad extends Fragment {
    Button buscar2,continuar;
    public buscar_comunidad() {
        // Required empty public constructor
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        continuar=(Button)getView().findViewById(R.id.bt_buscar_midomicilio);
        buscar2 = (Button)getView().findViewById(R.id.bt2);

        buscar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment crear = new crear_comunidad();
                FragmentTransaction ft = getFragmentManager().beginTransaction();
                ft.replace(R.id.contenedor,crear);
                ft.addToBackStack(null);
                ft.commit();
            }
        });

        continuar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment crear = new MiDomicilio();
                FragmentTransaction ft = getFragmentManager().beginTransaction();
                ft.replace(R.id.contenedor,crear);
                ft.addToBackStack(null);
                ft.commit();
            }
        });

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment


        return inflater.inflate(R.layout.fragment_buscar_comunidad, container, false);
    }


}
