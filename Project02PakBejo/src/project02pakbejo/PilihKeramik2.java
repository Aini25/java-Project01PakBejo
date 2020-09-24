/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project02pakbejo;

/**
 *
 * @author ASUS
 */
public class PilihKeramik2 {
    
    //Atribut
    int luasLantai;
    int ukuran;
    int isiKotak;
    int harga;
    
    //Constructor
    PilihKeramik2(int u, int i, int h){
        this.luasLantai = 1000000;
        this.ukuran = u;
        this.isiKotak = i;
        this.harga = h;
    }
    
    //Method
     int jumlahKeramik(){
         int jmlKeramik;
         jmlKeramik = (this.luasLantai / this.ukuran) + 1;
         return jmlKeramik;
     }
     
     int jumlahBox(){
         int jmlBox;
         jmlBox = (jumlahKeramik() / this.isiKotak) + 1;
         return jmlBox;
     }
     
     int jumlahBiaya(){
         int jmlBiaya;
         jmlBiaya = jumlahBox() * this.harga;
         return jmlBiaya;
     }
}
