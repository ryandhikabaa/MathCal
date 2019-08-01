package com.example.mathcal.recViewBDatar;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;


import com.example.mathcal.R;

import java.util.ArrayList;


public class Frag1 extends android.support.v4.app.Fragment implements ItemClick {
    RecyclerView recyclerView;
    RecyclerView.Adapter mAdapter;
    RecyclerView.LayoutManager layoutManager;

    java.util.List<kumpulanData> dataa;

    public Frag1() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = LayoutInflater.from(getContext()).inflate(R.layout.frag1_layout, container, false);

        recyclerView = view.findViewById(R.id.recView1);
        recyclerView.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);

        dataa = new ArrayList<kumpulanData>();

        dataa.add(new kumpulanData("PERSEGI", "https://upload.wikimedia.org/wikipedia/commons/thumb/f/f7/Regular_quadrilateral.svg/250px-Regular_quadrilateral.svg.png"));
        dataa.add(new kumpulanData("PERSEGI PANJANG", "https://pngimage.net/wp-content/uploads/2018/06/persegi-panjang-png-4.png"));
        dataa.add(new kumpulanData("SEGITIGA", "https://4.bp.blogspot.com/-sGtRbqvg46s/WXBHfd5CmcI/AAAAAAAAVYY/Bj8X2xgu5W0bbsUziUS-I23dT-zwwn-nACLcBGAs/s1600/sifat-bangun-datar-segitiga.png"));
        dataa.add(new kumpulanData("LINGKARAN", "http://www.tanyadokter.com/wp-content/uploads/2018/11/2013-s3-05-maths-blog-september-2013-koleksi-gambar-lingkaran-png-of-gambar-lingkaran-png.jpg"));
        dataa.add(new kumpulanData("JAJAR GENJANG", "http://2.bp.blogspot.com/-NQG-zLq66Vg/Ua1GZ4t2phI/AAAAAAAAAC0/Ll0vBMHs-Q8/s1600/Jajar+Genjang.jpg"));
        dataa.add(new kumpulanData("TRAPESIUM", "https://ya-webdesign.com/images/trapezoid-black-png-6.png"));

        mAdapter = new Adapter(getContext(),dataa, this);
        recyclerView.setAdapter(mAdapter);
        recyclerView.addItemDecoration(new DividerItemDecoration(getContext(), LinearLayout.VERTICAL));
        return view;
    }


    @Override
    public void onClick(View view, int position) {
        switch (position){
            case 0:
                Intent in0 =  new Intent(getContext(), R_P.class);
                startActivity(in0);
                break;
            case 1:
                Intent in1 =  new Intent(getContext(), R_PP.class);
                startActivity(in1);
                break;
            case 2:
                Intent in2 =  new Intent(getContext(), R_ST.class);
                startActivity(in2);
                break;
            case 3:
                Intent in3 =  new Intent(getContext(), R_LG.class);
                startActivity(in3);
                break;
            case 4:
                Intent in4 =  new Intent(getContext(), R_JJ.class);
                startActivity(in4);
                break;
            case 5:
                Intent in5 =  new Intent(getContext(), R_TP.class);
                startActivity(in5);
                break;



        }

    }
}