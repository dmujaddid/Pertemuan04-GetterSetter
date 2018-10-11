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
public class PPanjang {
    
    private double panjang;
    private double lebar;
    
    public double getPanjang() {
        return panjang;
    }
    
    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }
    
    public double getLebar() {
        return lebar;
    }
    
    public void setLebar(double lebar) {
        this.lebar = lebar;
    }
    
    // rumus luas
    public double hasilLuas() {
        return panjang*lebar;
    }
    
    // rumus keliling
    public double hasilKeliling() {
        return (panjang+lebar)*2;
    }
    
}
