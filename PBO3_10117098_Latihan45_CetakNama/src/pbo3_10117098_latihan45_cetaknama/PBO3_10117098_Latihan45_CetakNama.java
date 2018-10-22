/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3_10117098_latihan45_cetaknama;
import java.util.Scanner;
/**
 *
 * @author 
 * NAMA     : Santi Susanti
 * KELAS    : PBO3
 * NIM      : 10117098
 * Deskripsi Program : Mencetak nama Anda sebanyak yang diinginkan
 */
public class PBO3_10117098_Latihan45_CetakNama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scn1 = new Scanner(System.in);
        Scanner scn2 = new Scanner(System.in);
        Printer print = new Printer();

        System.out.println("=====Aplikasi Pencetak Nama=====");
        System.out.print("Masukkan nama Anda : ");
        print.setNama(scn1.nextLine());
        System.out.print("Mau cetak nama berapa kali?  : ");
        print.setJumlahCetak(scn2.nextInt());
        print.cetak("Nama Anda   : "+print.getNama());
        print.cetak(print.getJumlahCetak(), print.getNama());

    }
    
}
