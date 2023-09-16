/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tipedata;

/**
 *
 * @author jason
 */
public class LuasLingkaran {
    public static void main(String[] args){
        final double PI = 3.141592;
        double r = 11.78;
        
        double luas = PI*r*r;
        
        /* cara pembulatan adalah Math.round (nama variable/angka)
        type casting atau pindah tipe dilakukan dengan cara: (tipe data) nama variable
        final double digunakan agar nilai yang dimasukkan tidak berubah lagi
        */
        
        System.out.println("Luas Lingkaran = " + luas + " cm"); // menghitung luas biasa pakai rumus yang ada
        System.out.println("Luas Lingkaran Pindah Tipe = " + (int) luas + " cm"); // ini adalah type casting
        System.out.println("Luas Lingkaran Pembulatan = " + Math.round (luas) + " cm"); // ini adalah pembulatan
        
    }
}
