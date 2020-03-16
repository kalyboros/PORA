package com.example.vaja1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class InfoActivity extends AppCompatActivity {

    EditText imeInfo;
    EditText priimekInfo;
    EditText mestoInfo;
    Button btnInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        imeInfo = (EditText)findViewById(R.id.imeInfo);
        priimekInfo = (EditText)findViewById(R.id.priimekInfo);
        mestoInfo = (EditText)findViewById(R.id.mestoInfo);
        btnInfo=(Button)findViewById(R.id.btnInfo);
        btnInfo.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String ime = imeInfo.getText().toString();
                String priimek = priimekInfo.getText().toString();
                String mesto = mestoInfo.getText().toString();
                Intent intent = new Intent();
                intent.putExtra("IME", ime);
                intent.putExtra("PRIIMEK", priimek);
                intent.putExtra("MESTO", mesto);
                setResult(2,intent);
                finish();
            }
        });

    }
}
