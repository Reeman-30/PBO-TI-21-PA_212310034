package com.praktikum;

import java.util.Scanner;

public class Latihan08 {

    public static void main(String[] args) {
        int NPM, semester;
        String namaLengkap, namaKelas;
        double IPK;

        Scanner inputData = new Scanner(System.in);

        System.out.print("Masukkan NPM            : ");
        NPM = inputData.nextInt();

        inputData.nextLine();
        
        System.out.print("Masukkan nama lengkap   : ");
        namaLengkap = inputData.nextLine();

        System.out.print("Masukkan nama kelas     : ");
        namaKelas = inputData.nextLine();

        System.out.print("Masukkan semester       : ");
        semester = inputData.nextInt();

        System.out.print("Masukkan IPK            : ");
        IPK = inputData.nextDouble();
        
        System.out.print("\n");

        System.out.println("NPM           	: " + NPM);
        System.out.println("Nama Lengkap    : " + namaLengkap);
        System.out.println("Nama Kelas      : " + namaKelas);
        System.out.println("Semester        : " + semester);
        System.out.println("IPK             : " + IPK);

        inputData.close();
    }
    
}
