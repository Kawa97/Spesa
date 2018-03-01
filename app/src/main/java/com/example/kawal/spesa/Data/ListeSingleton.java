package com.example.kawal.spesa.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by corsista on 01/03/2018.
 */

public class ListeSingleton {
    private static final ListeSingleton ourInstance = new ListeSingleton();

    public static ListeSingleton getInstance() {
        return ourInstance;
    }

    private List<String> listaEliminati;
    private List<String> lista;
    private List<String> listaCarrello;

    private ListeSingleton() {
        this.lista = new ArrayList<String>();
    }




    public List<String> getListaEliminati() {
        return listaEliminati;
    }

    public void setListaEliminati(List<String> listaEliminati) {
        this.listaEliminati = listaEliminati;
    }




    public List<String> getLista() {
        return lista;
    }

    public void setLista(List<String> lista) {
        this.lista = lista;
    }



    public List<String> getListaCarrello() {
        return listaCarrello;
    }

    public void setListaCarrello(List<String> listaCarrello) {
        this.listaCarrello = listaCarrello;
    }


}