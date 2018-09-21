package com.mada.inputdata;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class lingkaran extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lingkaran);

        Button btn2 = (Button) findViewById(R.id.hitungjarijari);
        final EditText edit2 = (EditText) findViewById(R.id.editjarijari);
        final TextView txt2 = (TextView) findViewById(R.id.hasiljarijari);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TextUtils.isEmpty(edit2.getText().toString())) {
                    Toast.makeText(lingkaran.this, "Inputan masih kosong", Toast.LENGTH_SHORT).show();
                } else {
                    double a = Float.parseFloat(edit2.getText().toString());
                    double hasil =  3.14*a * a;
                    txt2.setText(hasil + "");
                }
            }
        });
    }
}
