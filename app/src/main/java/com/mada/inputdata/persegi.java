package com.mada.inputdata;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class persegi extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persegi);

        //initialize and declarate
        Button btn = (Button) findViewById(R.id.hitungpersegi);
        final EditText edit = (EditText) findViewById(R.id.editSisi);
       final TextView txt = (TextView) findViewById(R.id.hasilpersegi);

        //ketika button di klik
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TextUtils.isEmpty(edit.getText().toString())) {
                    Toast.makeText(persegi.this, "Inputan masih kosong", Toast.LENGTH_SHORT).show();
                } else {
                    float a = Float.parseFloat(edit.getText().toString());
                    float hasil = a * a;
                    txt.setText(hasil + "");
                }
            }
        });

    }
}
