package com.example.mathcal.recViewBDatar;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.mathcal.R;


public class R_TP extends AppCompatActivity {
    TextView tvHasilTP;
    EditText etSisihadap1TP, etSisihadap2TP, tvTinggiTP;
    Button btnHitungTP;
    int sisihadap1, sisihadap2, tinggi;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.r_trapesium);

        tvHasilTP = (TextView)findViewById(R.id.hasilTP);
        etSisihadap1TP = (EditText) findViewById(R.id.sisi1TP);
        etSisihadap2TP = (EditText)findViewById(R.id.sisi2TP);
        tvTinggiTP=(EditText)findViewById(R.id.tinggiTP);
        btnHitungTP=(Button)findViewById(R.id.hitungTP);


       /* getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("LUAS BANGUN DATAR");*/

        btnHitungTP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String sisihadapa = etSisihadap1TP.getText().toString();
                String sisihadapb = etSisihadap2TP.getText().toString();
                String tinggii=  tvTinggiTP.getText().toString();
                if (TextUtils.isEmpty(sisihadapa) && TextUtils.isEmpty(sisihadapb) && TextUtils.isEmpty(tinggii)){
                    etSisihadap1TP.setError("masukkan sisi hadap");
                    etSisihadap2TP.setError("masukkan sisi hadap");
                    tvTinggiTP.setError("masukkan tinggi");

                }else if (TextUtils.isEmpty(sisihadapa)){etSisihadap1TP.setError("masukkan sisi hadap");
                }else if (TextUtils.isEmpty(sisihadapb)){etSisihadap2TP.setError("masukkan sisi hadap");
                }else if (TextUtils.isEmpty(tinggii)){tvTinggiTP.setError("masukkan tinggi");}

                else{
                sisihadap1= Integer.parseInt(sisihadapa);
                sisihadap2= Integer.parseInt(sisihadapb);
                tinggi = Integer.parseInt(tinggii);
                OpP trpsm = new OpP();
                tvHasilTP.setText(String.valueOf(trpsm.trapesium(sisihadap1, sisihadap2, tinggi)));
            }}
        });

    }
}
