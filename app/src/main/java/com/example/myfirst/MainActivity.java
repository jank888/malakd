package com.example.myfirst;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    private TextView szovegmezo;
    private Button nyomogomb;
    private EditText bevitel;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
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
            }
        });

    }
}
