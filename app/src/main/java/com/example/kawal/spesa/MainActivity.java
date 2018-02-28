package com.example.kawal.spesa;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fragmentManager= getFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        ListaFragment listaFragment=new ListaFragment();
        fragmentTransaction.replace(R.id.container,listaFragment).commit();

        TextView textView1= (TextView) findViewById(R.id.eliminati);
        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager= getFragmentManager();
                FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
                EliminatiFragment eliminatiFragment= new EliminatiFragment();
                fragmentTransaction.replace(R.id.container,eliminatiFragment).commit();
            }
        });

        TextView textView2= (TextView) findViewById(R.id.lista);
        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager= getFragmentManager();
                FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
                ListaFragment listaFragment=new ListaFragment();
                fragmentTransaction.replace(R.id.container,listaFragment).commit();
            }
        });

        TextView textView3= (TextView) findViewById(R.id.carrello);
        textView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager= getFragmentManager();
                FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
                CarrelloFragment carrelloFragment= new CarrelloFragment();
                fragmentTransaction.replace(R.id.container,carrelloFragment).commit();
            }
        });
}
}