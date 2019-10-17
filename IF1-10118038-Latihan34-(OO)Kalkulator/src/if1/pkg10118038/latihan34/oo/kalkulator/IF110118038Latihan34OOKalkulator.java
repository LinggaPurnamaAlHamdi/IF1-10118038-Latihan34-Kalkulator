/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118038.latihan34.oo.kalkulator;
import java.util.Scanner;
/**
 *
 * @author Lingga
 * NAMA : Lingga Purnama Al Hamdi
 * KELAS : IF1
 * NIM : 10118038
 * Deskripsi Program : program ini berisi program yang akan menampilkan Kalkulator
 */
public class IF110118038Latihan34OOKalkulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Kalkulator k = new Kalkulator();
        System.out.println("====Aplikasi Kalkulator Bilangan====");
        System.out.print("Masukkan Angka ke-1 : ");
        k.value1 = sc.nextDouble();
        System.out.print("Masukkan Angka ke-2 : ");
        k.value2 = sc.nextDouble();
        System.out.println("\n" + "Hasil Pertambahan : " + k.tambahBilangan());
        System.out.println("Hasil Pengurangan : " + k.kurangBilangan());
        System.out.println("Hasil Perkalian : " + k.kaliBilangan());
        System.out.println("Hasil Pembagian : " + k.bagiBilangan());
        System.out.println("Hasil Sisa : " + k.sisaBilangan());
    }
    
}
