package com.mada.inputdata;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button bpersegi = (Button) findViewById(R.id.btnpersegi);

        bpersegi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // move to  other activity
                Intent a = new Intent(getApplicationContext(),persegi.class);
                startActivity(a);



            }
        });
        final Button persegipanjang = (Button) findViewById(R.id.btnpersegipanjang);

        persegipanjang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(getApplicationContext(),persegipanjang.class);
                startActivity(a);
            }
        });

        final Button lingkaran = (Button) findViewById(R.id.btnlingkaran);

        lingkaran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(getApplicationContext(),lingkaran.class);
                startActivity(a);
            }
        });

        final Button segitiga = (Button) findViewById(R.id.btnsegitiga);

        segitiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(getApplicationContext(),segitiga.class);
                startActivity(a);
            }
        });
    }
}
