package com.example.kawal.spesa.Logic;

import android.content.Context;

import com.example.kawal.spesa.Data.ListeSingleton;

import java.util.List;

/**
 * Created by corsista on 01/03/2018.
 */

public class ListeUtils {


    public static void inizio(Context context) {
        String inizio ="Mele";
        String inizio2 ="Mele";
        String inizio3 ="Mele";
        addLista(context, inizio);
        addListaEliminati(context, inizio2);
        addListaCarrello(context, inizio3);
    }


    public static List<String> getLista(Context context) {

        return ListeSingleton.getInstance().getLista();
    }

    public static List<String> addLista(Context context, String itemToAdd) {
        List<String> lista = ListeUtils.getLista(context);
        lista.add(itemToAdd);

        ListeSingleton.getInstance().setLista(lista);
        return lista;
    }

    public static String getListaItem(Context context, int index) {
        List<String> lista = ListeUtils.getLista(context);
        return lista.get(index);
    }

    public static List<String> removeItemAtIndex(Context context, int index) {
        List<String> lista = ListeUtils.getLista(context);
        lista.remove(index);

        ListeSingleton.getInstance().setLista(lista);
        return lista;
    }




    public static List<String> getListaEliminati(Context context) {

        return ListeSingleton.getInstance().getListaEliminati();
    }

    public static List<String> addListaEliminati(Context context, String itemToAdd) {
        List<String> lista = ListeUtils.getListaEliminati(context);
        lista.add(itemToAdd);
        ListeSingleton.getInstance().setListaEliminati(lista);
        return lista;
    }

    public static String getListaEliminatiItem(Context context, int index) {
        List<String> lista = ListeUtils.getListaEliminati(context);
        return lista.get(index);
    }

    public static List<String> removeListaEliminatiItem(Context context, int index) {
        List<String> lista = ListeUtils.getListaEliminati(context);
        lista.remove(index);

        ListeSingleton.getInstance().setListaEliminati(lista);
        return lista;
    }




    public static List<String> getListaCarrello(Context context) {

        return ListeSingleton.getInstance().getListaCarrello();
    }

    public static List<String> addListaCarrello(Context context, String itemToAdd) {
        List<String> lista = ListeUtils.getListaCarrello(context);
        lista.add(itemToAdd);

        ListeSingleton.getInstance().setListaCarrello(lista);
        return lista;
    }

    public static String getListaCarrelloItem(Context context, int index) {
        List<String> lista = ListeUtils.getListaCarrello(context);
        return lista.get(index);
    }

    public static List<String> removeListaCarrelloItem(Context context, int index) {
        List<String> lista = ListeUtils.getListaCarrello(context);
        lista.remove(index);

        ListeSingleton.getInstance().setListaCarrello(lista);
        return lista;
    }






}
