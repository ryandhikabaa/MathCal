package com.example.mathcal.recViewBDatar;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.mathcal.R;


/**
 * Created by RPL2016-11 on 11/1/2018.
 */
public class R_P extends AppCompatActivity {

    TextView tvrumusP, tvhasilP;
    EditText etsisiP;
    Button btnhitungP;
    int sisiP;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.r_persegi);

        tvrumusP = (TextView) findViewById(R.id.rumusP);
        tvhasilP = (TextView) findViewById(R.id.hasilP);
        etsisiP = (EditText) findViewById(R.id.sisiP);
        btnhitungP = (Button) findViewById(R.id.hitungP);

      /*getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("LUAS BANGUN DATAR");*/

        btnhitungP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TextUtils.isEmpty(etsisiP.getText().toString())){
                    etsisiP.setError("masukkan sisi");
                } else {
                String sisipersegi = etsisiP.getText().toString().trim();
                sisiP = Integer.parseInt(sisipersegi);
                OpP prsg = new OpP();
                tvhasilP.setText(String.valueOf(prsg.persegi(sisiP)));
            }}
        });
    }
}
