package ödev2;

import java.util.Arrays;

public class ödev2Main {
    public static void main(String[] args) {
        // 1. Sorunun Cevabı
        ödev ö = new ödev();
        System.out.println("1.Soru Cevabı => Girilen km mil cinsinden değeri : " +ö.kmMilCevirme(5));
        // 2. Sorunun Cevabı
        ö.alanHesapla(5,4);
        // 3. Sorunun Cevabı
        System.out.println("3.Soru Cevabı => Faktörüyel Sonuç : " +ö.faktörüyelHesapla(4));
        // 4.Sorunun Cevabı
        ö.eHarfiBulma("eren");
        // 5.Soru Cevabı
        System.out.println("5.Soru Cevabı => İç Açı : "+ö.aciHesapla(3));
        // 6.Soru Cevabı
        System.out.println("6.Soru Cevabı => Alınacak Olan Maaş : " +ö.maasHesapla(200));
        // 7.Soru Cevabı
        System.out.println("7.Soru Cevabı => Otopark Ücreti : " + ö.otoparkUcret(4));
    }
}
