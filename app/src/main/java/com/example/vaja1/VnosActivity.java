package com.example.vaja1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.vaja1lib.Card;
import com.example.vaja1lib.Deck;

public class VnosActivity extends AppCompatActivity {

    Button vnesi;
    EditText name;
    EditText attack;
    EditText defense;
    private Deck deck1;
    Button izhod;
    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vnos);

        setContentView(R.layout.activity_vnos);
        deck1 = new Deck("prvi");
        name = findViewById(R.id.cardName);
        attack = findViewById(R.id.attack);
        defense = findViewById(R.id.defense);


        vnesi = (Button) findViewById(R.id.vnesi);
        vnesi.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                deck1.add(new Card(name.toString(),Integer.parseInt(attack.getText().toString()),Integer.parseInt(defense.getText().toString()),1));
                name.getText().clear();
                attack.getText().clear();
                defense.getText().clear();
                counter++;
            }
        });

        izhod = (Button) findViewById(R.id.exitVnos);
        izhod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.putExtra("STEVILO", counter);
                setResult(3,intent);
                finish();
            }
        });

    }
}
