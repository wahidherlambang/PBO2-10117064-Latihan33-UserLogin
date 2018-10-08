/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117064.latihan33.userlogin;

/**
 *
 * @author WAHID HERLAMBANG
 * NAMA     : Wahid Herlambang Suroso
 * KELAS    : PBO2
 * NIM      : 10117064
 * Deskripsi Program : Program ini berisi program untuk login user.
 */
public class User {
    
    public boolean status;
    private static String db_user = "WahidHerlambang";
    private static String db_pass = "Alhamdulillah";
    
    public void cekAkun(String username, String password) {
        if(username.equals(db_user) && password.equals(db_pass)) {
            status = true;
        } else {
            status = false;
        }

    }
    public void hasilLogin(boolean status, String username) {
        if(status) {
            System.out.println("****** HALLO " + username.toUpperCase() + " ******");
            System.out.println("Selamat Datang di Aplikasi ini.");
        } else {
            System.out.println("Ooops, Username atau Password anda salah");
        }
    }
    public void pengecekanLogin(String username, String password) {
        cekAkun(username,password);
        hasilLogin(status,username);
    }
}