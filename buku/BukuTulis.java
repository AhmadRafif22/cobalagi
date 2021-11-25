package com.company.Jobsheet1.buku;

public class BukuTulis extends Buku{
    private String merek;
    private String catatan;

    public void setMerek (String newValue) {
        merek = merek;
    }

    public void tambahCatatan (String newValue) {
        catatan = newValue;
    }

    public void CetakInformasi (){
        System.out.println("Merek       : "+merek);
        super.cetakInformasi();
        System.out.println("catatan     :"+catatan);
    }
}
