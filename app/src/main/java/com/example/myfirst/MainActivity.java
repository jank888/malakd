package com.example.myfirst;

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;

import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    private TextView szovegmezo;
    private Button nyomogomb;
    private EditText bevitel;
    private ListView listadoboz;
    private ArrayAdapter<String> adapter;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        final ArrayList<String> sztringlista = new ArrayList<String>();
        sztringlista.add("Anonymus");

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        bevitel = (EditText) findViewById(R.id.névcella);
        szovegmezo = (TextView) findViewById(R.id.szoveg);
        szovegmezo.setText("Az alkalmazás sikeresen elindult!");
        nyomogomb = (Button) findViewById(R.id.gomb);
        nyomogomb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                szovegmezo.setText("Helló " + bevitel.getText() + "!");
                adapter.add(bevitel.getText().toString());
            }
        });


        listadoboz = (ListView) findViewById(R.id.lista);
        adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,sztringlista);
        listadoboz.setAdapter(adapter);
        adapter.clear();
        listadoboz.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String kivalasztott_elem = (String)adapter.getItem(position);
                szovegmezo.setText("Helló " + kivalasztott_elem + "!");
            }
        });


    }
}
