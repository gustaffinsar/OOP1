/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop1;

import java.util.Scanner;



/**
 *
 * @author asus
 */
public class OOP1 {
    static Scanner sc = new Scanner(System.in);
   

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        kelulusan adi = new kelulusan();
        kelulusan andi = new kelulusan();
        kelulusan budi = new kelulusan();
        kelulusan denny = new kelulusan();

        System.out.print("Masukkan Nomor Absen Anda : ");
        int absensi = sc.nextInt();

        switch (absensi){
            case 1:
                kelulusan.adi();
                break;
            case 2:
                kelulusan.andi.Andi();
                break;
            case 3:
                kelulusan.budi.Budi();
                break;
            case 4:
                kelulusan.denny.Denny();
                break;
        }
     
    }
    
}
