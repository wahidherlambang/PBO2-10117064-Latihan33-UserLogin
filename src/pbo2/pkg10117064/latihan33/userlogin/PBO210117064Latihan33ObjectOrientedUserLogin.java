/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117064.latihan33.userlogin;

import java.util.Scanner;

/**
 *
 * @author WAHID HERLAMBANG
 */
public class PBO210117064Latihan33ObjectOrientedUserLogin {

    /**
 * @param args the command line arguments
 * NAMA     : Wahid Herlambang Suroso
 * KELAS    : PBO2
 * NIM      : 10117064
 * Deskripsi Program : Program ini berisi program untuk login user.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        User signin = new User();
        Scanner scnr = new Scanner(System.in);
        
        System.out.print("Masukkan Username = ");
        String user = scnr.next();
        System.out.print("Masukkan Password = ");
        String pass = scnr.next();
        System.out.println();
        
        signin.pengecekanLogin(user,pass);
    }
    
}