package ödev2;

public class ödev {
    // 1. Soru
    public double kmMilCevirme(double km){
        double mil;
        mil = km*0.621;
        return mil;
    }

    // 2. Soru
    public void  alanHesapla(int uzunKenar, int kısaKenar){
        int alan;
        alan = uzunKenar * kısaKenar;
        System.out.println("2.Soru Cevabı => Alan : " +alan);
    }

    // 3.Soru
    public  int faktörüyelHesapla(int faktörüyel){
        int sonuc = 1;
        for (int i = 1; i<faktörüyel+1; i++){
            sonuc*=i;
        }
        return sonuc;
    }

    // 4. Soru
    public void eHarfiBulma(String kelime){
        int toplam = 0;
        char harf = 'e';
        for (int i =0; i<kelime.length(); i++){
            if (kelime.charAt(i) == harf){
                toplam++;
            }
        }
        System.out.println("4.Soru Cevabı => Girilen Kelimede " +toplam +" adet 'e' harfi bulunmaktadır.");
    }

    // 5.Soru
    public int aciHesapla(int kenarSayisi){
        int icAcilarToplami;
        icAcilarToplami = ((kenarSayisi -2)*180)/kenarSayisi;
        return icAcilarToplami;
    }

    // 6.Soru
    public int maasHesapla(int calisilanSüre){
        int toplamMaas;
        int mesaiSüresi = calisilanSüre-150;
        int ekUcret;
        int maas;
        if (mesaiSüresi>0){
            ekUcret = mesaiSüresi * 80;
            maas = 150 * 40;
            toplamMaas = maas + ekUcret;
        }else {
            toplamMaas = calisilanSüre * 40;
        }
        return toplamMaas;
    }

    // 7. Soru
    public int otoparkUcret(int kalinanSüre){
        int toplamUcret;
        int fazlsüre = kalinanSüre - 1;
        int ekÜcret = fazlsüre * 10;
        toplamUcret = 50 + ekÜcret;
        return toplamUcret;
    }

}
