/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ti_regpagi.pkg22205043.latihan19.saldotabungan;

import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.NumberFormat;
/*
 *  Nama      : Danish Fadlan Azam
 *  NIM       : 22205043
 *  Prodi     : Teknik Informatika
 *  Deskripsi : program ini untuk menghitung saldo tabungan dalam waktu tertentu 
 */

public class TI_RegPagi22205043Latihan19SaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Deklarasi variabel
        int saldoAwal, bungaPerBulan, lamaBulan;

        // Membaca input dari pengguna
        Scanner inputan = new Scanner(System.in);
        System.out.print("Saldo awal: Rp. ");
        saldoAwal = inputan.nextInt();
        System.out.print("Bunga per bulan (%): ");
        bungaPerBulan = inputan.nextInt();  
        System.out.print("Lama (bulan): ");
        lamaBulan = inputan.nextInt();
        
        NumberFormat formatter = new DecimalFormat("###,###");
        
        // Menghitung saldo tabungan
        for (int i = 1; i <= lamaBulan; i++) {
            saldoAwal = saldoAwal + (saldoAwal * bungaPerBulan / 100);
            String formatSaldo = formatter.format(saldoAwal).replace(",", ".");
            System.out.println("Saldo di bulan ke-" + i + " Rp. " +formatSaldo);
        }
    }
    
}
