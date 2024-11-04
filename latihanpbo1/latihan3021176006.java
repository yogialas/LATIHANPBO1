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
public class latihan3021176006 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kamu ngerjain sendiri latihan 17 sampe latihan 30 ini?");
        System.out.print("Jawab (Yoi/Enggak): ");
        String jawaban = scanner.nextLine();

        if (jawaban.equalsIgnoreCase("Yoi")) {
            System.out.println("Tetep cakep sih.");
            System.out.println("Sing penting paham konsep nya yee.");
            System.out.println("Keep the code works dude");
        } else if (jawaban.equalsIgnoreCase("Enggak")) {
            System.out.println("Kalo gak ngerjain latihan 17-30, gimana mau jadi developer?");
            System.out.println("Latihan itu penting buat nguatin kemampuanmu.");
            System.out.println("Semangat terus ya!");
        } else {
            System.out.println("Jawaban yang valid adalah Yoi atau Enggak.");
        }
    }
}

