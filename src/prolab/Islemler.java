/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prolab;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author ilyas
 */
public class Islemler {
    protected void veriGirisi(){
        
        int secim;
        
        Scanner input = new Scanner(System.in);
        VeriGirisi vg = new VeriGirisi();
        File file = new File("AracKayit.txt");
        try{
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file, false);
            BufferedWriter bw = new BufferedWriter(fw);
            
            
            while(true){
                System.out.println("*****Araç Türü Seçimi*****");
                System.out.println("[1] - Otomobil");
                System.out.println("[2] - Bisiklet");
                System.out.println("[3] - Gemi");
                System.out.println("[4] - Uçak");
                System.out.println("[5] - Uçan Gemi");
                System.out.println("[9] - Bir Önceki Menü");
                System.out.println("[0] - Çıkış\n");
                System.out.print("Seçimi giriniz: ");
                secim = input.nextInt();

                switch(secim){
                    case 1 : {
                        Otomobil arac = vg.otomobilEkle();
                        String veri = "Otomobil" + "," + arac.getMarka() + "," + arac.getYakitTuru() + "," + arac.getHiz() + "," + arac.getYolcuSayisi() + "," + arac.getTekerlekSayisi() + "," + arac.getFiyat() + "," + arac.getUretimYili() + "," + arac.getRenk();
                        bw.append(veri);
                        break;
                    }
                    case 2 : {
                        Bisiklet arac = vg.bisikletEkle();
                        String veri = "Bisiklet" + "," + arac.getMarka() + "," + "-"  + "," + arac.getHiz() + "," + arac.getYolcuSayisi() + "," + arac.getTekerlekSayisi() + "," + arac.getFiyat() + "," + arac.getUretimYili() + "," + arac.getRenk();
                        bw.append(veri);
                        break;
                    }
                    case 3 : {
                        Gemi arac = vg.gemiEkle();
                        String veri = "Gemi" + "," + arac.getMarka() + "," + arac.getYakitTuru() + "," + arac.getHiz() + "," + arac.getYolcuSayisi() + "," + "-" + "," + arac.getFiyat() + "," + arac.getUretimYili() + "," + arac.getRenk();
                        bw.append(veri);
                        break;
                    }
                    case 4 : {
                        Ucak arac = vg.ucakEkle();
                        String veri = "Uçak" + "," + arac.getMarka() + "," + arac.getYakitTuru() + "," + arac.getHiz() + "," + arac.getYolcuSayisi() + "," + arac.getTekerlekSayisi() + "," + arac.getFiyat() + "," + arac.getUretimYili() + "," + arac.getRenk();
                        bw.append(veri);
                        break;
                    }
                    case 5 : {
                        /*UcanGemi arac = vg.ucakEkle();
                        String veri = "UçanGemi" + "," + arac.getMarka() + "," + arac.getYakitTuru() + "," + arac.getHiz() + "," + arac.getYolcuSayisi() + "," + arac.getTekerlekSayisi() + "," + arac.getFiyat() + "," + arac.getUretimYili() + "," + arac.getRenk();
                        bw.append(veri);
                        break;
                        break;*/
                    }
                    case 9 : {
                        return;
                    }
                    case 0 : {
                        System.exit(0);
                        break;
                    }
                    default : System.out.println("\nLütfen geçerli bir seçim yapınız!\n");
                }
                bw.close();
            }
        }catch(IOException e){
            System.out.println("Dosya Oluşturulamadı!!!");
        }
    }
    
    protected void veriListele(){
        Scanner input = new Scanner(System.in);
        int secim;
        
        while(true){
            System.out.println("*****Araç Türü Seçimi*****");
            System.out.println("[1] - Kara Taşıtları");
            System.out.println("[2] - Deniz Taşıtları");
            System.out.println("[3] - Hava Taşıtları");
            System.out.println("[9] - Bir Önceki Menü");
            System.out.println("[0] - Çıkış\n");
            System.out.print("Seçimi giriniz: ");
            secim = input.nextInt();


            File file = new File("AracKayit.txt");
            try{
                if (!file.exists()) {
                    file.createNewFile();
                }
                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);
                
                String satir;
                
                switch(secim){
                    case 1 : {
                        System.out.println("Tip, Marka, Yakıt Türü, Hızı, Yolcu Sayısı, Tekerlek Sayısı, Fiyat, Üretim Yılı, Renk");
                        while ((satir = br.readLine()) != null) {
                            String[] ozellikler = satir.split(",");
                            if(ozellikler[0].equals("Otomobil") || ozellikler[0].equals("Bisiklet")){
                                System.out.println(satir);
                            }
                        }
                        break;
                    }
                    case 2 : {
                        System.out.println("Tip, Marka, Yakıt Türü, Hızı, Yolcu Sayısı, Tekerlek Sayısı, Fiyat, Üretim Yılı, Renk");
                        while ((satir = br.readLine()) != null) {
                            String[] ozellikler = satir.split(",");
                            if(ozellikler[0].equals("Gemi") || ozellikler[0].equals("UçanGemi")){
                                System.out.println(satir);
                            }
                        }
                        break;
                    }
                    case 3 : {
                        System.out.println("Tip, Marka, Yakıt Türü, Hızı, Yolcu Sayısı, Tekerlek Sayısı, Fiyat, Üretim Yılı, Renk");
                        while ((satir = br.readLine()) != null) {
                            String[] ozellikler = satir.split(",");
                            if(ozellikler[0].equals("Uçak") || ozellikler[0].equals("UçanGemi")){
                                System.out.println(satir);
                            }
                        }
                        break;
                    }
                    case 9 : {
                        return;
                    }
                    case 0 : {
                        System.exit(0);
                        break;
                    }
                    default : System.out.println("\nLütfen geçerli bir seçim yapınız!\n");
                }
            }catch(IOException e){
                System.out.println("Dosya Okunamadı!!!");
            }
        }
    }
    
    protected void veriGuncelle(){
        Scanner input = new Scanner(System.in);
        VeriGirisi vg = new VeriGirisi();
        
        String id;
        System.out.print("Araç ID'si giriniz: ");
        id = input.next();
        
        
        File file = new File("AracKayit.txt");
        try{
            if (!file.exists()) {
                file.createNewFile();
            }
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            FileWriter fw = new FileWriter(file, false);
            BufferedWriter bw = new BufferedWriter(fw);

            String satir;
            String veri = "";
            
            while ((satir = br.readLine()) != null) {
                String[] ozellikler = satir.split(",");
                if(ozellikler[0].equals(id)){
                    switch(ozellikler[1]){
                    case "Otomobil" : {
                        Otomobil arac = vg.otomobilEkle();
                        veri = "Otomobil" + "," + arac.getMarka() + "," + arac.getYakitTuru() + "," + arac.getHiz() + "," + arac.getYolcuSayisi() + "," + arac.getTekerlekSayisi() + "," + arac.getFiyat() + "," + arac.getUretimYili() + "," + arac.getRenk();
                        break;
                    }
                    case "Bisiklet" : {
                        Bisiklet arac = vg.bisikletEkle();
                        veri = "Bisiklet" + "," + arac.getMarka() + "," + "-"  + "," + arac.getHiz() + "," + arac.getYolcuSayisi() + "," + arac.getTekerlekSayisi() + "," + arac.getFiyat() + "," + arac.getUretimYili() + "," + arac.getRenk();
                        break;
                    }
                    case "Gemi" : {
                        Gemi arac = vg.gemiEkle();
                        veri = "Gemi" + "," + arac.getMarka() + "," + arac.getYakitTuru() + "," + arac.getHiz() + "," + arac.getYolcuSayisi() + "," + "-" + "," + arac.getFiyat() + "," + arac.getUretimYili() + "," + arac.getRenk();
                        break;
                    }
                    case "Uçak" : {
                        Ucak arac = vg.ucakEkle();
                        veri = "Uçak" + "," + arac.getMarka() + "," + arac.getYakitTuru() + "," + arac.getHiz() + "," + arac.getYolcuSayisi() + "," + arac.getTekerlekSayisi() + "," + arac.getFiyat() + "," + arac.getUretimYili() + "," + arac.getRenk();
                        break;
                    }
                    case "UçanGemi" : {
                        /*UcanGemi arac = vg.ucakEkle();
                        veri = "UçanGemi" + "," + arac.getMarka() + "," + arac.getYakitTuru() + "," + arac.getHiz() + "," + arac.getYolcuSayisi() + "," + arac.getTekerlekSayisi() + "," + arac.getFiyat() + "," + arac.getUretimYili() + "," + arac.getRenk();
                        break;*/
                    }
                    }
                    
                    String dosya = br.toString();
                    dosya = dosya.replace(satir, veri);
                    bw.write(dosya);
                }
            }
            br.close();
            bw.close();
        }catch(IOException e){
            System.out.println("Dosya Okunamadı!!!");
        }
        
    }
}
