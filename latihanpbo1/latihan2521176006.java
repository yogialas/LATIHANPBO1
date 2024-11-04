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
public class latihan2521176006 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nama depan anda untuk di eja: ");
        String nama = scanner.nextLine();

        System.out.println("Ejaan untuk \"" + nama + "\" adalah:");
        for (int i = 0; i < nama.length(); i++) {
            System.out.println("Huruf ke-" + (i + 1) + ": " + nama.charAt(i));
        }
    }
}

