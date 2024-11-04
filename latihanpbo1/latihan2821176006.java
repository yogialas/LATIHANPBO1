/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.latihanpbo1;

import java.util.Scanner;

/**
 * nama: yogi alas selian
 * nim: 23176006
 * jurusan: sistem informasi
 * 
 */
public class latihan2821176006 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Kalimat: ");
        String kalimat = scanner.nextLine();

        System.out.print("Ganti Kata: ");
        String kataGanti = scanner.nextLine();

        System.out.print("Menjadi Kata: ");
        String kataJadi = scanner.nextLine();

        String kalimatBaru = kalimat.replaceAll(kataGanti, kataJadi);

        System.out.println("\n====Hasil Formatting====\n");
        System.out.println("Kalimat awal: " + kalimat);
        System.out.println("Kalimat baru: " + kalimatBaru);
    }
}

