/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.latihanpbo1;

import java.util.Scanner;

/**
 * nama: yogi alas selian
 * nim: 23176006
 * jurusan: sisteminformasi
 * 
 * @author Thinkpad X270
 */
public class latihan1721176006 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("===========Program Tunjangan=======----");
        System.out.print("Berapa gaji pokok anda perbulan?: Rp. ");
        int gajiPokok = scanner.nextInt();
        System.out.print("Status Anda? (Menikah/Belum) : ");
        String status = scanner.next();

        int tunjangan = 0;
        if (status.equalsIgnoreCase("menikah")) {
            tunjangan = 2100000;
        }

        int totalGaji = gajiPokok + tunjangan;

        System.out.println("===========Hasil Perhitungan Gaji Anda=========----");
        System.out.println("Gaji Pokok\t: Rp " + gajiPokok + ".0");
        System.out.println("Tunjangan\t: Rp " + tunjangan + ".0");
        System.out.println("Total Gaji\t: Rp " + totalGaji + ".0");
        System.out.println("(developed by yogi alas selian)");
        System.out.println("BUILD SUCCESSFUL (total time: 6 seconds)");
    }
}
