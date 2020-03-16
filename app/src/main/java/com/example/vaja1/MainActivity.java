package com.example.vaja1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button logBtn;
    EditText priimek;
    EditText mesto;
    EditText name;
    Button infoBtn;
    Button vnosBtn;
    int deckSize;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        priimek = findViewById(R.id.Priimek);
        mesto = findViewById(R.id.Mesto);
        name = findViewById(R.id.cardName);

        logBtn = (Button) findViewById(R.id.idLog);
        logBtn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                Log.i("MyActivity", "Stevilo kart v decku:" + deckSize);
            }
        });

        infoBtn = (Button) findViewById(R.id.btnInfo);
        infoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, InfoActivity.class);
                startActivityForResult(intent,2);
            }
        });

        vnosBtn = (Button) findViewById(R.id.Vnos);
        vnosBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, VnosActivity.class);
                startActivityForResult(intent,3);
            }
        });

    }

    public void exitApp(View view) {
        moveTaskToBack(true);
        android.os.Process.killProcess(android.os.Process.myPid());
        System.exit(1);
    }

    // Call Back method  to get the Message form other Activity
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data)
    {
        super.onActivityResult(requestCode, resultCode, data);
        //request code 2 je za izpis informacij o sebi
        if(requestCode==2)
        {
            String imeSet = data.getStringExtra("IME");
            String priimekSet = data.getStringExtra("PRIIMEK");
            String mestoSet = data.getStringExtra("MESTO");
            name.setText(imeSet);
            priimek.setText(priimekSet);
            mesto.setText(mestoSet);
        }

        if(requestCode==3){
            int stevilo = data.getIntExtra("STEVILO", 0);
            Toast.makeText(this,String.valueOf(stevilo),Toast.LENGTH_LONG).show();
            deckSize= deckSize+stevilo;
        }
    }

}
