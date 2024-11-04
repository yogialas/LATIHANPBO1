/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.latihanpbo1;

import java.util.Scanner;

/**
 *
 * @author Thinkpad X270
 */
public class latihan2121176006 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Banyaknya Mahasiswa : ");
        int jumlahMahasiswa = scanner.nextInt();

        int totalNilai = 0;

        for (int i = 1; i <= jumlahMahasiswa; i++) {
            System.out.print("Nilai Mahasiswa ke-" + i + ": ");
            int nilai = scanner.nextInt();
            totalNilai += nilai;
        }

        double rataRata = (double) totalNilai / jumlahMahasiswa;

        System.out.println("Maka, Rata-rata Nilainya adalah " + rataRata);

        scanner.close();
    }
}

