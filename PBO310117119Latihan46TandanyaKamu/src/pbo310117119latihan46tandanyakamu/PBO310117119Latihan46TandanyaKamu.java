/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo310117119latihan46tandanyakamu;

import java.util.Scanner;

/**
 *
 * @author Yogaputra
 * Nama : Arditya Yogaputra S
 * NIM : 10117119
 * Kelas : PBO 3
 * Deskripsi Program : Program ini dapat menampilkan umur dan keterangan yang 
 * unik
 */
public class PBO310117119Latihan46TandanyaKamu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Age age = new Age(2018);

        Scanner sca = new Scanner(System.in);
        System.out.print("Masukkan Tahun lahir anda : ");
        age.setYearBirth(sca.nextInt());

        System.out.println("======Hasil Perhiyungan Umur======");
        System.out.println("Tahun Lahir Anda : " + age.getYearBirth(0));
        System.out.println("Hari ini Tahun : " + age.getYearNow());
        System.out.println("Umur kamu sampai hari ini adalah "
                + age.hitungUmur() + " tahun");
        System.out.println("Tandanya Kamu : " + age.tandanyaKamu(age.hitungUmur()));
    }

}
