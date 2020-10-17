/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119076.latihan2.deklarasi.variabel;

/**
 *
 * @author ACER
 * NAMA     : Sulthon Naufal Akmal
 * KELAS    : IF2
 * NIM      : 10119082
 * Deskripsi Program : Deklarasi & Pengaksesan
 */
public class PBOIF210119076Latihan2DeklarasiVariabel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // Deklarasi variabel
        int nilaiInt;
        final double PHI = 3.14; //konstanta uppercase
        boolean nilaiLogika;
        char nilaiKarakter;

        // Memberi nilai ke variabel
        nilaiInt = 78;
        nilaiLogika = false;
        nilaiKarakter = 'D';

        //Menampilkan hasil
        System.out.println();
        System.out.println("Isi variabel nilai=" + nilaiInt);
        System.out.println("Isi variabel PHI=" + PHI);
        System.out.println("Isi variabel logika=" + nilaiLogika);
        System.out.println("Isi variabel karakter=" + nilaiKarakter);
    }
    
}
