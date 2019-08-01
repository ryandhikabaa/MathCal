package com.example.mathcal.recViewBDatar;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.mathcal.R;


public class R_ST extends AppCompatActivity {
    TextView tvrumusST, tvhasilST;
    EditText etalasST, ettinggiST;
    Button btnhitungST;
    int alasST,tinggiST;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.r_segitiga);

        tvrumusST = (TextView) findViewById(R.id.rumusST);
        tvhasilST = (TextView) findViewById(R.id.hasilST);
        etalasST = (EditText) findViewById(R.id.alasST);
        ettinggiST = (EditText) findViewById(R.id.tinggiST);
        btnhitungST = (Button) findViewById(R.id.hitungST);

       /* getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("LUAS BANGUN DATAR"); */

        btnhitungST.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String alassegitiga = etalasST.getText().toString().trim();
                String tinggisegitiga = ettinggiST.getText().toString().trim();

                if (TextUtils.isEmpty(alassegitiga) && TextUtils.isEmpty(tinggisegitiga)){
                    etalasST.setError("masukkan alas");
                    ettinggiST.setError("masukkan tinggi");
                }else if (TextUtils.isEmpty(alassegitiga)){
                    etalasST.setError("masukkan alas");
                }else if (TextUtils.isEmpty(tinggisegitiga)){
                    ettinggiST.setError("masukkan tinggi");
                }
                else{

                alasST =  Integer.parseInt(alassegitiga);
                tinggiST= Integer.parseInt(tinggisegitiga);
                OpP sgtg = new OpP();
               tvhasilST.setText(String.valueOf(sgtg.segitiga(alasST,tinggiST)));
            }}
        });
    }
}
