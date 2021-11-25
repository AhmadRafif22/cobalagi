package com.company.Jobsheet1.buku;

public class Buku {
    private int jumlahHalaman;
    private String warna;

    public void setJumlahHalaman (int newValue) {
        jumlahHalaman = newValue;
    }

    public void setWarna (String newValue){
        warna = newValue;
    }

    public void cetakInformasi() {
        System.out.println("Warna       : "+warna);
        System.out.println("Jml Halaman : "+ jumlahHalaman + " halaman");
    }
}