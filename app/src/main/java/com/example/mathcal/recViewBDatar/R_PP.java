package com.example.mathcal.recViewBDatar;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.mathcal.R;


public class R_PP extends AppCompatActivity {

    TextView tvrumusPP, tvhasilPP;
    EditText etpanjangPP, etlebarPP;
    Button btnhitungPP;
    int panjangPP,lebarPP;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.r_persegipanjang);

        tvrumusPP = (TextView) findViewById(R.id.rumusPP);
        tvhasilPP = (TextView) findViewById(R.id.hasilPP);
        etpanjangPP = (EditText) findViewById(R.id.panjangPP);
        etlebarPP = (EditText) findViewById(R.id.lebarPP);
        btnhitungPP = (Button) findViewById(R.id.hitungPP);
        /*getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("LUAS BANGUN DATAR");*/

        btnhitungPP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String panjangpersegipanjang = etpanjangPP.getText().toString();
                String lebarpersegipanjang= etlebarPP.getText().toString();

                if (TextUtils.isEmpty(panjangpersegipanjang) && TextUtils.isEmpty(lebarpersegipanjang)){
                    etpanjangPP.setError("masukkan panjang");
                    etlebarPP.setError("masukkan lebar");
                }else if (TextUtils.isEmpty(panjangpersegipanjang)){
                    etpanjangPP.setError("masukkan panjang");
                }else if (TextUtils.isEmpty(lebarpersegipanjang)){
                    etlebarPP.setError("masukkan lebar");
                }
                else{
                panjangPP= Integer.parseInt(panjangpersegipanjang);
                lebarPP= Integer.parseInt(lebarpersegipanjang);
                OpP prsgpnjg = new OpP();
                tvhasilPP.setText(String.valueOf(prsgpnjg.persegipanjang(panjangPP,lebarPP)));
            }}
        });
    }
}
