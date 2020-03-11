package com.example.vaja1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.vaja1lib.Card;
import com.example.vaja1lib.Deck;


public class MainActivity extends AppCompatActivity {

    Button logbtn;
    Button create;
    EditText attack;
    EditText defense;
    EditText name;
    private Deck deck1;
    //private Card addCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        deck1 = new Deck("prvi");
        attack = findViewById(R.id.attack);
        defense = findViewById(R.id.defense);
        name = findViewById(R.id.name);

        logbtn = (Button) findViewById(R.id.idLog);
        logbtn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                Log.i("MyActivity", "Stevilo kart v decku:" + deck1.toString());
            }
        });

        create = (Button) findViewById(R.id.idDodaj);
        create.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                deck1.add(new Card(name.toString(),Integer.parseInt(attack.getText().toString()),Integer.parseInt(defense.getText().toString()),1));
                name.getText().clear();
                attack.getText().clear();
                defense.getText().clear();
            }
        });

    }

    public void exitApp(View view) {
        moveTaskToBack(true);
        android.os.Process.killProcess(android.os.Process.myPid());
        System.exit(1);
    }
}
