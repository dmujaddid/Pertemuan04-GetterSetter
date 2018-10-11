/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contoh_2;

/**
 *
 * @author eka
 */
public class Main {
    
    public static void main(String[] args) {
        
        // Judul
        System.out.println("Penghitung Persegi");
        Persegi objPersegi = new Persegi();
        
        // Menambahkan nilai
        objPersegi.setSisi(10);
        
        // Menampilkan
        System.out.println("Sisi\t\t: " +objPersegi.getSisi());
        System.out.println("Luas\t\t: " +objPersegi.hasilLuas());
        System.out.println("Keliling\t: " +objPersegi.hasilKeliling());
        System.out.println();
        
        System.out.println("Penghitung Persegi Panjang");
        PPanjang objPPanjang = new PPanjang();
        
        // Menambahkan nilai
        objPPanjang.setPanjang(10);
        objPPanjang.setLebar(2);
        
        // Menampilkan
        System.out.println("Panjang\t\t: " +objPPanjang.getPanjang());
        System.out.println("Lebar\t\t: " +objPPanjang.getLebar());
        System.out.println("Luas\t\t: " +objPPanjang.hasilLuas());
        System.out.println("Keliling\t: " +objPPanjang.hasilKeliling());
         
    }
}
