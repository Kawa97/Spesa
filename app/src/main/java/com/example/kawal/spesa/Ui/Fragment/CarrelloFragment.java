package com.example.kawal.spesa.Ui.Fragment;

import android.app.AlertDialog;
import android.app.Fragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.kawal.spesa.Logic.ListeUtils;
import com.example.kawal.spesa.Ui.Adapter.CustomArrayAdapter;
import com.example.kawal.spesa.Data.ListeSingleton;
import com.example.kawal.spesa.R;

import java.util.List;

/**
 * Created by kawal on 28/02/2018.
 */

public class CarrelloFragment extends Fragment {

    static final String[] Carrell = new String[] {"Arance","Pere"};

    final List<String> Carrello = ListeSingleton.getInstance().getListaCarrello();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View view  = inflater.inflate(R.layout.lista_layout,container, false);
        return view;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {

        final CustomArrayAdapter adapter = new CustomArrayAdapter(getActivity(),ListeSingleton.getInstance().getListaCarrello());
        final ListView listView = (ListView) view.findViewById(R.id.listView);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, final View view, final int position, long id) {
                AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                builder.setTitle("Sei sicuro di voler rimuovere sto coso?");
                builder.setPositiveButton("Conferma", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        ListeUtils.removeListaCarrelloItem(getActivity(),position);
                        adapter.notifyDataSetChanged();
                    }
                });

                builder.show();
            }

        });
    }
}
