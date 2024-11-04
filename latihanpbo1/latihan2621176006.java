/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.latihanpbo1;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

/**
 * nama: yogi alas selian
 * nim: 23176006
 * jurusan: sistem informasi
 * 
 */
public class latihan2621176006 {

    public static void main(String[] args) {
        // Mendapatkan waktu saat ini
        Calendar calendar = new GregorianCalendar();

        // Mendapatkan hari dalam minggu dalam bahasa Indonesia
        String hariIni = new GregorianCalendar().getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, new Locale("id"));

        // Mendapatkan tanggal dalam format dd MMM yyyy
        String tanggal = String.format("%d %s %d", calendar.get(Calendar.DAY_OF_MONTH), calendar.getDisplayName(Calendar.MONTH, Calendar.SHORT, new Locale("id")), calendar.get(Calendar.YEAR));

        // Mendapatkan waktu dalam format HH:mm:ss
        String waktu = String.format("%02d:%02d:%02d", calendar.get(Calendar.HOUR_OF_DAY), calendar.get(Calendar.MINUTE), calendar.get(Calendar.SECOND));

        // Menampilkan output
        System.out.println("Hari ini adalah hari: " + hariIni + ", " + tanggal + " " + waktu);
    }
}

