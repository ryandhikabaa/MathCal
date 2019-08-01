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
public class R_JJ extends AppCompatActivity {
    TextView tvrumusJJ, tvhasilJJ;
    EditText etsisiJJ, ettinggiJJ;
    Button btnhitungJJ;
    int sisiJJ,tinggiJJ;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.r_jajargenjang);

        tvrumusJJ = (TextView) findViewById(R.id.rumusJJ);
        tvhasilJJ = (TextView) findViewById(R.id.hasilJJ);
        etsisiJJ = (EditText) findViewById(R.id.sisiJJ);
        ettinggiJJ = (EditText) findViewById(R.id.tinggiJJ);
        btnhitungJJ = (Button) findViewById(R.id.hitungJJ);

        btnhitungJJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String sisijajargenjang = etsisiJJ.getText().toString().trim();
                String tinggijajargenjang = ettinggiJJ.getText().toString().trim();
                if (TextUtils.isEmpty(sisijajargenjang) && TextUtils.isEmpty(tinggijajargenjang)){
                    etsisiJJ.setError("masukkan sisi");
                    ettinggiJJ.setError("masukkan tinggi");
                }else if (TextUtils.isEmpty(sisijajargenjang)){
                    etsisiJJ.setError("masukkan sisi");

                }else if (TextUtils.isEmpty(tinggijajargenjang)){
                    ettinggiJJ.setError("masukkan tinggi");
                }
                else {
                sisiJJ = Integer.parseInt(sisijajargenjang);
                tinggiJJ = Integer.parseInt(tinggijajargenjang);
                OpP jjrgnjg = new OpP();
                tvhasilJJ.setText(String.valueOf(jjrgnjg.jajargenjang(sisiJJ,tinggiJJ)));
            }
            }
        });
    }
}
