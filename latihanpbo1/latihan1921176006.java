/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.latihanpbo1;

/**
 *
 * @author Thinkpad X270
 */
public class latihan1921176006 {
    public static void main(String[] args) {
        // Saldo awal
        double saldoAwal = 2875000;

        // Bunga per bulan
        double bungaPerBulan = 0.15;

        // Hitung saldo setiap bulan
        for (int bulan = 1; bulan <= 6; bulan++) {
            // Hitung bunga
            double bunga = saldoAwal * bungaPerBulan;

            // Tambahkan bunga ke saldo
            saldoAwal += bunga;

            // Tampilkan saldo di bulan ke-i
            System.out.println("Saldo di bulan ke-" + bulan + " Rp." + saldoAwal);
        }

        System.out.println("developed by yogi alas selian)");
    }
}
    

