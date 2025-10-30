/*
 * Ad Soyad: [Akın Ağaçbacak]
 * Ogrenci No: [250542018]
 * Tarih: [30/10/2025]
 * Aciklama: Gorev 1 - Ogrenci Bilgi Sistemi
 * 
 * Bu program kullanicidan ogrenci bilgilerini alir ve
 * duzenli bir formatta ekrana yazdirir.
 */

import java.util.Scanner;

public class OgrenciBilgiSistemi {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Değişkenler
        String ad , soyad;
        int yas, ogrenciNo;
        double gpa;

        System.out.println("=== OGRENCI BILGI SISTEMI ===");
        System.out.println();

        //Kullanıcı Bilgileri
        System.out.print("Adınız :");
        ad = input.nextLine();
        System.out.print("Soyadınız :");
        soyad = input.nextLine();
        System.out.print("yaşınız:");
        yas = input.nextInt();
        System.out.print("ogrenciNo:");
        ogrenciNo = input.nextInt();
        System.out.print("GPA:");
        gpa = input.nextDouble();

        System.out.println("=== OGRENCI BILGI SISTEMI ===");
        System.out.println();

        //Çıktılar
        System.out.printf("Ad Soyad: %s %s\n", ad, soyad);
        System.out.printf("Ogrenci No: %d\n", ogrenciNo);
        System.out.printf("Yaş: %d\n", yas);
        System.out.printf("GPA: %.2f\n", gpa);
        System.out.println("Durum: İyi Ogrenci");


    }
}
