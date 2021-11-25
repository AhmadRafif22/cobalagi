package com.company.Jobsheet1.buku;

public class BukuBacaan extends Buku {
    private String judul;
    private String pengarang;

    public void setJudul (String newValue) {
        judul = judul;
    }

    public void setPengarang (String newValue) {
        pengarang = newValue;
    }

    public void CetakInformasi() {
        System.out.println("Judul       : "+judul);
        System.out.println("Pengarang   : "+pengarang);
        super.cetakInformasi();
    }
}