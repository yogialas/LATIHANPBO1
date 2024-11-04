/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.latihanpbo1;

/**
 * nama: yogi alas selian
 * nim: 23176006
 * jurusan: sistem informasi
 * 
 */
public class latihan2021176006  {

    public static void main(String[] args) {
        // Simulasi saldo awal
        double saldoAwal = 3_780_000;

        // Simulasi bunga per bulan
        double bunga = 0.08; // 8%

        // Menghitung dan menampilkan saldo untuk 8 bulan
        for (int bulan = 1; bulan <= 8; bulan++) {
            // Menghitung bunga
            double bungaBulanan = saldoAwal * bunga;

            // Menambahkan bunga ke saldo
            saldoAwal += bungaBulanan;

            // Menampilkan saldo
            System.out.println("Saldo di bulan ke-" + bulan + " Rp. " + String.format("%.3f", saldoAwal));
        }}}
        
        
    

