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
public class Project02PakBejo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                
        PilihKeramik2 A2 = new PilihKeramik2(900, 10, 54000);
        System.out.println("Jumlah keramik yang dibutuhkan adalah " + A2.jumlahKeramik() + " buah");
        System.out.println("Jumlah box keramik yang dibutuhkan adalah " + A2.jumlahBox() + " box");
        System.out.println("Total biaya untuk pembelian keramik yang dibutuhkan adalah " + A2.jumlahBiaya() + " rupiah");
        System.out.println(" ");
        
        PilihKeramik2 B2 = new PilihKeramik2(1600, 5, 65000);
        System.out.println("Jumlah keramik yang dibutuhkan adalah " + B2.jumlahKeramik() + " buah");
        System.out.println("Jumlah box keramik yang dibutuhkan adalah " + B2.jumlahBox() + " box");
        System.out.println("Total biaya untuk pembelian keramik yang dibutuhkan adalah " + B2.jumlahBiaya() + " rupiah");
        System.out.println(" ");
        
        PilihKeramik2 C2 = new PilihKeramik2(1200, 8, 60000);
        System.out.println("Jumlah keramik yang dibutuhkan adalah " + C2.jumlahKeramik() + " buah");
        System.out.println("Jumlah box keramik yang dibutuhkan adalah " + C2.jumlahBox() + " box");
        System.out.println("Total biaya untuk pembelian keramik yang dibutuhkan adalah " + C2.jumlahBiaya() + " rupiah");
        System.out.println(" ");
    }
    
}
