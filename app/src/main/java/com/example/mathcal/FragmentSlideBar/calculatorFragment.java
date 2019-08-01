package com.example.mathcal.FragmentSlideBar;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.mathcal.R;


/**
 * Created by RPL2016-11 on 10/24/2018.
 */
public class calculatorFragment extends android.support.v4.app.Fragment {

    Button btnhitung;
    EditText txtangka1, txtangka2;
    TextView txthasil;
    Spinner spoperator;
    String operasi[] = {"+", "-", "*", "/"};
    ArrayAdapter<String> adapter;
    Context context;

    public calculatorFragment() {
    }

    public calculatorFragment(Context context) {
        this.context = context;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_calculator, container, false);
        txtangka1 = view.findViewById(R.id.angka1);
        txtangka2 = view.findViewById(R.id.angka2);
        btnhitung = view.findViewById(R.id.submit);
        txthasil = view.findViewById(R.id.hasil);
        spoperator = view.findViewById(R.id.spinner);
        adapter = new ArrayAdapter<>(context, android.R.layout.simple_list_item_1, operasi);
        spoperator.setAdapter(adapter);
        spoperator.getSelectedItemPosition();

        btnhitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String angka1 = txtangka1.getText().toString().trim();
                String angka2 = txtangka2.getText().toString().trim();
                if(TextUtils.isEmpty(angka1) && TextUtils.isEmpty(angka2)){
                    txtangka1.setError("Angka kosong");
                    txtangka2.setError("Angka kosong");
                }else if(TextUtils.isEmpty(angka1)){
                    txtangka1.setError("Angka kosong");
                }else if(TextUtils.isEmpty(angka2)){
                    txtangka2.setError("Angka kosong");
                }else{
                    int pilihan = spoperator.getSelectedItemPosition();
                    switch (pilihan) {
                        case 0:
                            int tambah = Integer.parseInt(angka1) + Integer.parseInt(angka2);
                            txthasil.setText(String.valueOf(tambah));
                            break;
                        case 1:
                            int kurang = Integer.parseInt(angka1) - Integer.parseInt(angka2);
                            txthasil.setText(String.valueOf(kurang));
                            break;
                        case 2:
                            int kali = Integer.parseInt(angka1) * Integer.parseInt(angka2);
                            txthasil.setText(String.valueOf(kali));
                            break;
                        case 3:
                            float bagi = Float.parseFloat(angka1) / Float.parseFloat(angka2);
                            txthasil.setText(String.valueOf(bagi));
                            break;
                    }
                }
            }
        });

        return view;

    }
}

/*String num1 = txtangka1.getText().toString();
                    String num2 = txtangka2.getText().toString();*/

