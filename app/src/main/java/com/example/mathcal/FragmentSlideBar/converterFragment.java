package com.example.mathcal.FragmentSlideBar;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.mathcal.R;


/**
 * Created by RPL2016-11 on 10/24/2018.
 */
public class converterFragment extends android.support.v4.app.Fragment implements  View.OnClickListener {

    EditText rp;
    TextView hasil;
    ImageView yen, euro, pound, dollar;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_converter, container, false);
        init(view);
        return view;
    }

    private void init(View view) {
        rp = (EditText) view.findViewById(R.id.input);
        hasil = (TextView) view.findViewById(R.id.hasil);
        yen = (ImageView) view.findViewById(R.id.toyen);
        euro = (ImageView) view.findViewById(R.id.toeuro);
        pound = (ImageView) view.findViewById(R.id.topound);
        dollar = (ImageView) view.findViewById(R.id.todollar);

        yen.setOnClickListener(this);
        euro.setOnClickListener(this);
        pound.setOnClickListener(this);
        dollar.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        String rupiah = rp.getText().toString().trim();
        if (TextUtils.isEmpty(rupiah)) {
                rp.setError("Nominal kosong");
        } else {
            switch (view.getId()) {
                case R.id.toyen:
                    float yen = Float.parseFloat(rupiah) / 150;
                    hasil.setText("=" + " " + String.valueOf(yen) + " " + "yen");
                    break;
                case R.id.toeuro:
                    float euro = Float.parseFloat(rupiah) / 15625;
                    hasil.setText("=" + " " + String.valueOf(euro) + " " + "euro");
                    break;
                case R.id.topound:
                    float pound = Float.parseFloat(rupiah) / 17000;
                    hasil.setText("=" + " " + String.valueOf(pound) + " " + "pound");
                    break;
                case R.id.todollar:
                    float dollar = Float.parseFloat(rupiah) / 15000;
                    hasil.setText("=" + " " + String.valueOf(dollar) + " " + "dollar");
                    break;
            }
        }

    }
}
