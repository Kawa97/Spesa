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
        String inizio2 ="Pere";
        String inizio3 ="Banane";
        addLista(context, inizio);
        addListaEliminati(context, inizio2);
        addListaCarrello(context, inizio3);
    }


    public static List<String> getLista(Context context) {

        return ListeSingleton.getInstance().getLista();
    }

    public static void addLista(Context context, String itemToAdd) {
        List<String> lista = ListeUtils.getLista(context);
        lista.add(itemToAdd);

        ListeSingleton.getInstance().setLista(lista);
    }

    public static String getListaItem(Context context, int index) {
        List<String> lista = ListeUtils.getLista(context);
        return lista.get(index);
    }

    public static void removeListaItem(Context context, int index) {
        List<String> lista = ListeUtils.getLista(context);
        lista.remove(index);

        ListeSingleton.getInstance().setLista(lista);
    }




    public static List<String> getListaEliminati(Context context) {

        return ListeSingleton.getInstance().getListaEliminati();
    }

    public static void addListaEliminati(Context context, String itemToAdd) {
        List<String> lista = ListeUtils.getListaEliminati(context);
        lista.add(itemToAdd);
        ListeSingleton.getInstance().setListaEliminati(lista);
    }

    public static String getListaEliminatiItem(Context context, int index) {
        List<String> lista = ListeUtils.getListaEliminati(context);
        return lista.get(index);
    }

    public static void removeListaEliminatiItem(Context context, int index) {
        List<String> lista = ListeUtils.getListaEliminati(context);
        lista.remove(index);

        ListeSingleton.getInstance().setListaEliminati(lista);
    }




    public static List<String> getListaCarrello(Context context) {

        return ListeSingleton.getInstance().getListaCarrello();
    }

    public static void addListaCarrello(Context context, String itemToAdd) {
        List<String> lista = ListeUtils.getListaCarrello(context);
        lista.add(itemToAdd);

        ListeSingleton.getInstance().setListaCarrello(lista);
    }

    public static String getListaCarrelloItem(Context context, int index) {
        List<String> lista = ListeUtils.getListaCarrello(context);
        return lista.get(index);
    }

    public static void removeListaCarrelloItem(Context context, int index) {
        List<String> lista = ListeUtils.getListaCarrello(context);
        lista.remove(index);

        ListeSingleton.getInstance().setListaCarrello(lista);
    }






}
