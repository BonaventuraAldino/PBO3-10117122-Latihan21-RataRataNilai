/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117122.latihan21.rataratanilai;
import java.util.Scanner;
/**
 *
 * @author lenovo
 * 
 * NAMA  : BONAVENTURA ALDINO SENDA SENI
 * KELAS : PBO-3
 * NIM   : 10117122
 * Deskripsi Program : User memasukkan jumlah mahasiswa, menampilkan rata-rata
 *                     dari nilai mahasiswa
 * 
 */
public class PBO310117122Latihan21RataRataNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int n, jml, nilai[];
        float rataRata, jumlah = 0;

        System.out.print("Masukkan Banyaknya Mahasiswa : ");
        n = input.nextInt();

        nilai = new int[n];
        for(int i = 0; i <= n-1; i++){
            System.out.print("Nilai Mahasiswa ke-" + (i+1) + " : ");
            nilai[i] = input.nextInt();
        }
        
        for(int j = 0; j <= n-1; j++){
            jumlah = jumlah + nilai[j];
        }

        rataRata = jumlah/n;
        System.out.println();
        System.out.println("Maka, Rata-rata Nilainya adalah "+ rataRata);
        System.out.println("(Developed by : Bonaventura Aldino Senda Seni)");
    }
    
}
