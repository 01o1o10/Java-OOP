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
public class Prolab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        ///Eksikler....
        ///* Seri numarası ekleme.
        ///* Çoklu kalıtım.
        ///* Abstract kullanımı.
        ///* 
        
        int secim;
        Islemler islem = new Islemler();
        
        while(true){
            System.out.println("*****İşlem Seçimi*****");
            System.out.println("[1] - Veri Girişi");
            System.out.println("[2] - Veri Listele");
            System.out.println("[3] - Veri Güncelle");
            System.out.println("[0] - Çıkış\n");
            System.out.print("Seçimi giriniz: ");
            secim = input.nextInt();
            
            switch(secim){
                case 1 : {
                    islem.veriGirisi();
                    break;
                }
                case 2 : {
                    islem.veriListele();
                    break;
                }
                case 3 : {
                    islem.veriGuncelle();
                    break;
                }
                case 0 : {
                    System.exit(0);
                    break;
                }
                default : System.out.println("\nLütfen geçerli bir seçim yapınız!\n");
            }
        }
    }
    
}
