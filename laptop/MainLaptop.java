package com.company.Jobsheet1.laptop;

public class MainLaptop {
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop();

        laptop1.setSpesifikasi("MSI",8,"Intel Core i7-10750H CPU");
        laptop1.tambahKecerahan(90);
        laptop1.kurangiKecerahan(30);
        laptop1.tambahKecerahan(10);
        laptop1.cetakInformasi();
    }
}
