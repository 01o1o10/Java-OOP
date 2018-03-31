/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prolab;

import java.util.Scanner;

/**
 *
 * @author ilyas
 */
public class VeriGirisi {
    Scanner input = new Scanner(System.in);
    protected Otomobil otomobilEkle(){
        Otomobil arac = new Otomobil();
        
        System.out.println("*****Araç Bilgileri Girişi*****");
        System.out.print("Markası: ");
        arac.setMarka(input.next());
        System.out.print("Yakıt Türü: ");
        arac.setYakitTuru(input.next());
        System.out.print("Hızı: ");
        arac.setHiz(input.nextInt());
        System.out.print("Yolcu Sayısı: ");
        arac.setYolcuSayisi(input.nextInt());
        System.out.print("Tekerlek Sayısı: ");
        arac.setTekerlekSayisi(input.nextInt());
        System.out.print("Fiyatı: ");
        arac.setFiyat(input.nextInt());
        System.out.print("Üretim Yılı: ");
        arac.setUretimYili(input.nextInt());
        System.out.print("Rengi: ");
        arac.setRenk(input.next());
        
        return arac;
    }
    
    protected Bisiklet bisikletEkle(){
        Bisiklet arac = new Bisiklet();
        
        System.out.println("*****Araç Bilgileri Girişi*****");
        System.out.print("Markası: ");
        arac.setMarka(input.next());
        System.out.print("Hızı: ");
        arac.setHiz(input.nextInt());
        System.out.print("Yolcu Sayısı: ");
        arac.setYolcuSayisi(input.nextInt());
        System.out.print("Tekerlek Sayısı: ");
        arac.setTekerlekSayisi(input.nextInt());
        System.out.print("Fiyatı: ");
        arac.setFiyat(input.nextInt());
        System.out.print("Üretim Yılı: ");
        arac.setUretimYili(input.nextInt());
        System.out.print("Rengi: ");
        arac.setRenk(input.next());
        
        return arac;
    }
    
    protected Gemi gemiEkle(){
        Gemi arac = new Gemi();
        
        System.out.println("*****Araç Bilgileri Girişi*****");
        System.out.print("Markası: ");
        arac.setMarka(input.next());
        System.out.print("Yakıt Türü: ");
        arac.setYakitTuru(input.next());
        System.out.print("Hızı: ");
        arac.setHiz(input.nextInt());
        System.out.print("Yolcu Sayısı: ");
        arac.setYolcuSayisi(input.nextInt());
        System.out.print("Fiyatı: ");
        arac.setFiyat(input.nextInt());
        System.out.print("Üretim Yılı: ");
        arac.setUretimYili(input.nextInt());
        System.out.print("Rengi: ");
        arac.setRenk(input.next());
        
        return arac;
    }
    
    protected Ucak ucakEkle(){
        Ucak arac = new Ucak();
        
        System.out.println("*****Araç Bilgileri Girişi*****");
        System.out.print("Markası: ");
        arac.setMarka(input.next());
        System.out.print("Yakıt Türü: ");
        arac.setYakitTuru(input.next());
        System.out.print("Hızı: ");
        arac.setHiz(input.nextInt());
        System.out.print("Yolcu Sayısı: ");
        arac.setYolcuSayisi(input.nextInt());
        System.out.print("Tekerlek Sayısı: ");
        arac.setTekerlekSayisi(input.nextInt());
        System.out.print("Fiyatı: ");
        arac.setFiyat(input.nextInt());
        System.out.print("Üretim Yılı: ");
        arac.setUretimYili(input.nextInt());
        System.out.print("Rengi: ");
        arac.setRenk(input.next());
        
        return arac;
    }
    
    /*protected UcanGemi ucangemiEkle(){
        UcanGemi arac = new UcanGemi();
        
        System.out.println("*****Araç Bilgileri Girişi*****");
        System.out.print("Markası: ");
        arac.setMarka(input.next());
        System.out.print("Yakıt Türü: ");
        arac.setYakitTuru(input.next());
        System.out.print("Hızı: ");
        arac.setHiz(input.nextInt());
        System.out.print("Yolcu Sayısı: ");
        arac.setYolcuSayisi(input.nextInt());
        System.out.print("Tekerlek Sayısı: ");
        arac.setTekerlekSayisi(input.nextInt());
        System.out.print("Fiyatı: ");
        arac.setFiyat(input.nextInt());
        System.out.print("Üretim Yılı: ");
        arac.setUretimYili(input.nextInt());
        System.out.print("Rengi: ");
        arac.setRenk(input.next());
        
        return arac;
    }*/
}
