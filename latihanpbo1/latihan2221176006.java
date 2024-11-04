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
public class latihan2221176006  {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("======Perhitungan Lingkaran=====\n");
        System.out.print("Masukkan nilai diameter lingkaran : ");
        double diameter = input.nextDouble();

        double jariJari = diameter / 2;
        double luas = Math.PI * jariJari * jariJari;
        double keliling = 2 * Math.PI * jariJari;

        System.out.print("======Hasil Perhitungan Lingkaran=====\n");
        System.out.println("Jari-jari Lingkaran = " + jariJari + " cm");
        System.out.println("Luas Lingkaran = " + luas + " cm");
        System.out.println("Keliling Lingkaran = " + keliling + " cm");

        input.close();
    }
}

