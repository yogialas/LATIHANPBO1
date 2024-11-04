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
public class latihan2921176006 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("run:");
        System.out.println("YUK CEK KEPRIBADIANMU DARI WARNA FAVORITMU");
        System.out.println("MERAH");
        System.out.println("HIJAU");
        System.out.println("KUNING");
        System.out.println("BIRU");
        System.out.println("UNGU");

        System.out.print("PILIH WARNA FAVORITMU: ");
        String warnaFavorit = scanner.nextLine().toUpperCase();
        System.out.print("NAMA KAMU: ");
        String nama = scanner.nextLine();

        System.out.println("===HASIL TEST KEPRIBADIAN " + nama.toUpperCase() + "===");
        System.out.println("Warna Favoritmu adalah " + warnaFavorit);

        switch (warnaFavorit) {
            case "MERAH":
                System.out.println("1. Berani dan penuh semangat");
                System.out.println("2. Memiliki jiwa kepemimpinan yang kuat");
                System.out.println("3. Memiliki energi yang tinggi");
                System.out.println("4. Cenderung impulsif");
                System.out.println("5. Mudah tersinggung");
                break;
            case "HIJAU":
                System.out.println("1. Romantis,");
                System.out.println("2. Menyukai hal yang berbau alami dan keindahan,");
                System.out.println("3. Teguh pada prinsip,");
                System.out.println("4. Menginginkan kesempurnaan,");
                System.out.println("5. Mudah cemburu");
                System.out.println("6. Mudah merasa iri");
                System.out.println("7. Menjunjung tinggi suatu nilai toleransi dan kepercayaan.");
                break;
            case "KUNING":
                System.out.println("1. Cerdas dan kreatif");
                System.out.println("2. Memiliki daya imajinasi yang tinggi");
                System.out.println("3. Suka sama coding");
}}}
