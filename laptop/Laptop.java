package com.company.Jobsheet1.laptop;

public class Laptop {
    private String merek;
    private int ram;
    private String processor;
    private int kecerahan;

    public void setSpesifikasi (String Merek, int Ram, String Processor) {
        merek = Merek;
        ram = Ram;
        processor = Processor;
    }

    public void tambahKecerahan (int newValue){
        if (kecerahan>=0 && kecerahan <=100) {
            kecerahan += newValue;
        }
        if (kecerahan > 100) {
            kecerahan = 100;
        }
    }

    public void kurangiKecerahan (int newValue) {
        if (kecerahan>=0 && kecerahan <=100) {
            kecerahan -= newValue;
        }
        if (kecerahan<0) {
            kecerahan = 0;
        }
    }

    public void cetakInformasi (){
        System.out.println("Merek Laptop : " + merek);
        System.out.println("Processor    : " + processor);
        System.out.println("Ram          : " + ram +" GB");
        System.out.println("Kecerahan    : " + kecerahan+"%");
    }
}
