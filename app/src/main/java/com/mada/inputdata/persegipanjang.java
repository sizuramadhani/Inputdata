package com.mada.inputdata;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class persegipanjang extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persegipanjang);

        //initialize and declarate
        Button btn1 = (Button) findViewById(R.id.hitungpersegi);
        final EditText edit1 = (EditText) findViewById(R.id.editpanjang);
        final EditText edit2 = (EditText) findViewById(R.id.editlebar);
        final TextView txt1 = (TextView) findViewById(R.id.hasilpersegi);

        //ketika button di klik
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TextUtils.isEmpty(edit1.getText().toString()) && TextUtils.isEmpty(edit2.getText().toString())) {
                    Toast.makeText(persegipanjang.this, "Inputan masih kosong", Toast.LENGTH_SHORT).show();
                } else {
                    float a = Float.parseFloat(edit1.getText().toString());
                    float b = Float.parseFloat(edit2.getText().toString());
                    float hasil = a * b;
                    txt1.setText(hasil + "");
                }

            }
        });
    }
}



