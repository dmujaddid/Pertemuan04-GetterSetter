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
public class Persegi {
    
    private double sisi;
    
    public double getSisi() {
        return sisi;
    }
    
    public void setSisi(double sisi) {
        this.sisi = sisi;
    }
    
    // rumus luas persegi
    public double hasilLuas() {
        return sisi*sisi;
    }
    
    // blok program keliling
    // rumus keliling persegi
    public double hasilKeliling() {
        return sisi*4;
    }
}
