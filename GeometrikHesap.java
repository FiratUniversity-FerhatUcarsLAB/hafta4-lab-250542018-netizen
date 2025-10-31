/*
 * Ad Soyad: [Akın Ağaçbacak]
 * Ogrenci No: [250542018]
 * Tarih: [31/10/2025]
 * Aciklama: Gorev 1 - Ogrenci Bilgi Sistemi
 * 
 * Bu program kullanicidan ogrenci bilgilerini alir ve
 * duzenli bir formatta ekrana yazdirir.
 */

import java.util.Scanner;

public class GeometrikHesap {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Değikenler
        final double PI = 3.14159;
        double r, daireAlani,daireCevre, daireCapi, kureHacmi, kureyuzeyAlani;

        //Kullanıcıdan alınan Bilgiler
        System.out.print("=== GEOMETRIK HESAPLAYICI ===\n");
        System.out.print("Dairenin yaricapini girin (cm): ");
        r= input.nextDouble();

        //Hesaplamalar
        daireAlani = PI*Math.pow(r,2);
        daireCapi = 2*r;
        daireCevre = 2*PI*r;
        kureHacmi = 4.0/3.0*PI*Math.pow(r,3);
        kureyuzeyAlani = 4.0*PI*Math.pow(r,2);

        //Çıktılar
        System.out.print("SONUCLAR:\n");
        System.out.print("----------\n");
        System.out.printf("Daire Alani : %.2f cm^2\n", daireAlani);
        System.out.printf("Daire Cevresi : %.2f cm\n", daireCevre);
        System.out.printf("Daire Capi : %.2f cm\n", daireCapi);
        System.out.printf("Kure Hacmi : %.2f cm^3\n", kureHacmi);
        System.out.printf("Kure Yuzey Alani : %.2f cm^2\n", kureyuzeyAlani);

        input.close();


    }
}

