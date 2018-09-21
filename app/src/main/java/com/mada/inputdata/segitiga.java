package com.mada.inputdata;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class segitiga extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitiga);

        Button btn2 = (Button) findViewById(R.id.hitung);
        final EditText edit1 = (EditText) findViewById(R.id.editalas);
        final EditText edit2 = (EditText) findViewById(R.id.editTinggi);
        final TextView txt2 = (TextView) findViewById(R.id.hasilalas);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TextUtils.isEmpty(edit1.getText().toString())&&TextUtils.isEmpty(edit2.getText().toString())) {
                    Toast.makeText(segitiga.this, "Inputan masih kosong", Toast.LENGTH_SHORT).show();
                } else {
                    double a = Float.parseFloat(edit2.getText().toString());
                    double b = Float.parseFloat(edit1.getText().toString());
                    double hasil =  (a * b)/2;
                    txt2.setText(hasil + "");
                }
            }
        });

    }
}
