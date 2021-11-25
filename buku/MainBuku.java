package com.company.Jobsheet1.buku;

public class MainBuku {
    public static void main(String[] args) {
        Buku buku1 = new Buku();
        BukuTulis bukuTulis1 = new BukuTulis();
        BukuBacaan bukuBacaan1 = new BukuBacaan();

        //buku
        System.out.println("OBJEK BUKU");
        buku1.setJumlahHalaman(30);
        buku1.setWarna("putih");
        buku1.cetakInformasi();
        System.out.println("");

        //bukutulis
        System.out.println("OBJEK BUKU TULIS");
        bukuTulis1.setMerek("Sinar Dunia");
        bukuTulis1.setJumlahHalaman(50);
        bukuTulis1.setWarna("Biru");
        bukuTulis1.tambahCatatan(" Halo Nama Saya Ahmad Rafif Alaudin");
        bukuTulis1.CetakInformasi();
        System.out.println("");

        //bukubacaan
        System.out.println("OBJEK BUKU BACAAN");
        bukuBacaan1.setJudul("Seni untuk Bersikap Bodo Amat");
        bukuBacaan1.setPengarang("Mark Manson");
        bukuBacaan1.setWarna("Orange");
        bukuBacaan1.setJumlahHalaman(81);
        bukuBacaan1.CetakInformasi();

    }
}
