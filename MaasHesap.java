/*
 * Ad Soyad: [Akın Ağaçbacak]
 * Ogrenci No: [250542018]
 * Tarih: [31/10/2025]
 * Aciklama: Gorev 3 -  Maaş Hesaplama Sistemi
 * 
 * Bu Java programı, kullanıcıdan alınan brüt maaş, haftalık çalışma ve mesai saati bilgilerine dayanarak bir çalışanın detaylı maaş bordrosunu hesaplar.
 * Program, toplam geliri, SGK, gelir vergisi gibi yasal kesintileri ve mesai ücretini hesaplayıp, en sonunda çalışanın net maaşını formatlanmış bir çıktı olarak ekrana yazdırır.
 */

import java.util.Scanner;

public class MaasHesap {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Sabit Değerler
        final double SGK_ORANI = 0.14;
        final double GELIR_VERGISI_ORANI = 0.15;
        final double DAMGA_VERGISI_ORANI = 0.00759;


        //Değişkenler
        String ad, soyad;
        double brutMaas, sgk,gelirVergisi,damgaVergisi,toplamKesinti, netMaas;
        int haftalikCalismaSaati, mesaiSaati;


        //Kullanıcıdan Alınan Bilgiler

        System.out.print("Adınız: ");
        ad = input.nextLine();
        System.out.print("Soyadınız: ");
        soyad = input.nextLine();

        System.out.print("Brüt Maaş:");
        brutMaas = input.nextDouble();
        System.out.print("Haftelık Çalışma Saatiniz: ");
        haftalikCalismaSaati = input.nextInt();
        System.out.print("Mesai Saatiniz: ");
        mesaiSaati = input.nextInt();


        //HESAPLAMALAR

        //Gelirler
        double mesaiUcreti = (brutMaas/160)*mesaiSaati*1.5;
        double toplamGelir=brutMaas+mesaiUcreti;


        //Kesintiler
        sgk=toplamGelir*SGK_ORANI;
        gelirVergisi=toplamGelir*GELIR_VERGISI_ORANI;
        damgaVergisi=toplamGelir*DAMGA_VERGISI_ORANI;
        toplamKesinti=sgk+gelirVergisi+damgaVergisi;


        //Net Maaş
        netMaas=toplamGelir-toplamKesinti;

        // İstatistikler
        double kesintiOrani = (toplamKesinti / toplamGelir) * 100;
        double saatlikNetKazanc = netMaas / (haftalikCalismaSaati*4);
        double gunlukNetKazanc = saatlikNetKazanc / 22;

        //ÇIKTILAR
        System.out.print("====================================\n");
        System.out.print("          MAAS BORDROSU\n");
        System.out.print("====================================\n");

        System.out.printf("Çalışan: %s %s",ad,soyad);
        System.out.print("\n\nGELİRLER:");
        System.out.printf("\n      Brut Maaş             : %.2f TL",brutMaas);
        System.out.printf("\n      Mesai Ücreti(%d saat) : %.2f  TL",mesaiSaati ,mesaiUcreti);
        System.out.print("\n       -----------------");
        System.out.printf("\n      Toplam Gelir          : %.2f  TL",toplamGelir);

        System.out.print("\n\n KESİNTİLER:");
        System.out.printf("\n      SGK Kesintisi (14.0)  : %.2f TL",sgk);
        System.out.printf("\n      Gelir Vergisi (15.0)  : %.2f TL",gelirVergisi);
        System.out.printf("\n      Damga Vergisi (0.8)   : %.2f TL",damgaVergisi);
        System.out.print("\n       -----------------------");
        System.out.printf("\n      TOPLAM KESINTI        : %.2f TL",toplamKesinti);
        System.out.printf("\nNET MAAS                    : %.2f TL",netMaas);

        System.out.print("\n=====================================");

        input.close();

    }
}

