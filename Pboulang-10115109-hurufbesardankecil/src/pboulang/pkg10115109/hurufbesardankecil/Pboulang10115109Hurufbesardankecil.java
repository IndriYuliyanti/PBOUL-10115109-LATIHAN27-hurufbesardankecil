/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboulang.pkg10115109.hurufbesardankecil;
import java.util.Scanner;


/**
 *
 * @author User
 */
public class Pboulang10115109Hurufbesardankecil {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
    
        String nama;
         System.out.print("masukan kalimat:");
        nama = in.nextLine();
        
        String hurufBesar = nama.toUpperCase();
        String hurufKecil = nama.toLowerCase();
                
                System.out.println("====== Hasil Formating=====");
                System.out.println("HURUF BESAR :"+ hurufBesar);
                System.out.println("Huruf kecil :"+ hurufKecil);
        
        
    }
    
}
