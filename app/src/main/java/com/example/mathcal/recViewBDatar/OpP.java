package com.example.mathcal.recViewBDatar;


public class OpP extends OpHitung {

    @Override
    int persegi(int sisi) {
        int luas = sisi*sisi;
        return luas;
    }

    @Override
    int persegipanjang(int panjang, int lebar) {
        int luas = panjang*lebar;
        return luas;
    }

    @Override
    double segitiga(int alas, int tinggi) {
        double luas = alas * tinggi / 2;
        return luas;
    }

    @Override
    double lingkaran(int jarijari) {
        double luas = (jarijari * jarijari) * 3.14;
        return luas;
    }

    @Override
    int jajargenjang(int sisi, int tinggi) {
        int luas = sisi*tinggi;
        return luas;
    }

    @Override
    double trapesium(int sisi1, int sisi2, int tinggi) {
        double luas = (sisi1 + sisi2) * tinggi / 2;
        return luas;
    }
}

