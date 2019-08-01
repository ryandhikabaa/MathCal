package com.example.mathcal.recViewBDatar;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.mathcal.R;


public class R_LG extends AppCompatActivity {

    TextView tvhasilLG;
    EditText etJarijariLG;
    Button btnHitungLG;
    int jarijariLG;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.r_lingkaran);

        tvhasilLG=(TextView)findViewById(R.id.hasilLG);
        etJarijariLG=(EditText)findViewById(R.id.jarijariLG);
        btnHitungLG=(Button)findViewById(R.id.hitungLG);

       /* getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("LUAS BANGUN DATAR");*/

        btnHitungLG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TextUtils.isEmpty(etJarijariLG.getText().toString())){
                    etJarijariLG.setError("masukkan jari-jari");
                }else{
                String jarijari = etJarijariLG.getText().toString();
                jarijariLG = Integer.parseInt(jarijari);
                OpP lngkrn = new OpP();
                tvhasilLG.setText(String.valueOf(lngkrn.lingkaran(jarijariLG)));
            }}
        });

    }
}
