package com.company.Jobsheet1.jam;
public class jam {
    private int jam;
    private int menit;
    private int detik;
    private String merek;
    private String bentuk;

    public void SetJam(int hour, int minute, int second) {
        jam = menit = detik = 0;
        if (second > 60) {
            second = second % 60;
            detik = second;
            minute++;
        } else {
            detik = second;
        }

        if (minute>60) {
            minute = minute % 60;
            menit = minute;
            hour++;
        } else {
            menit = minute;
        }

        if (hour>23) {
            hour = hour % 24;
            jam = hour;
        } else {
            jam = hour;
        }
    }

    public void SetMerek (String newValue) {
        merek = newValue;
    }

    public void SetBentuk (String newValue) {
        bentuk = newValue;
    }

    public void cetakInformasi () {
        System.out.println("Merk Jam       : "+merek);
        System.out.println("Bentuk Jam     : "+bentuk);
        System.out.println("Sekarang pukul : " + jam +" : "+menit+" : "+detik);
    }
}
