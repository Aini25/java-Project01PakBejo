/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project01pakbejo;

/**
 *
 * @author ASUS
 */
public class Project01PakBejo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PilihKeramik A = new PilihKeramik();
        A.ukuran = 900;
        A.isiKotak = 10;
        A.harga = 54000;
        A.hitungKeramik();
        
        PilihKeramik B = new PilihKeramik();
        B.ukuran = 1600;
        B.isiKotak = 5;
        B.harga = 65000;
        B.hitungKeramik();
        
        PilihKeramik C = new PilihKeramik();
        C.ukuran = 1200;
        C.isiKotak = 8;
        C.harga = 60000;
        C.hitungKeramik();
    }
    
}
