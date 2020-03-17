package com.example.vaja1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

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
    Button scan;

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

        scan = (Button) findViewById(R.id.scanBtn);
        scan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Intent intent = new Intent(VnosActivity.this,ScanActivity.class);
            startActivityForResult(intent,4);
            }
        });

    }

    // Call Back method  to get the Message form other Activity
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data)
    {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode==4){
            String code = data.getStringExtra("CODE");
            //Toast.makeText(this,code.toString(), 10);
            String[] split = code.split("-");
            String imeString = split[0];
            String attackString = split[1];
            String defenseString = split[2];
            int attackSet =  Integer.parseInt(attackString);
            int defenseSet =  Integer.parseInt(defenseString);
            name.setText(imeString);
            attack.setText(String.valueOf(attackSet));
            defense.setText(String.valueOf(defenseSet));
        }
    }
}
