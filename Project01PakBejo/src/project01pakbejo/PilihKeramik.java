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
public class PilihKeramik {
    int luasLantai = 1000000;
    int ukuran;
    int isiKotak;
    float harga;
    
     void hitungKeramik() {
        float jmlKeramik;
        float jmlKotak;
        float totalBiaya;
        jmlKeramik = this.luasLantai / this.ukuran;
        jmlKotak = jmlKeramik / this.isiKotak;
        totalBiaya = this.harga * jmlKotak;
        System.out.println("Jumlah kotak keramik yang dibutuhkan : " + Math.ceil(jmlKeramik));
        System.out.println("Jumlah box keramik yang dibuthkan : " + Math.ceil(jmlKotak));
        System.out.println("Total Biaya Yang Dibutuhkan : Rp " + totalBiaya);
        System.out.println("          ");
    }
}
