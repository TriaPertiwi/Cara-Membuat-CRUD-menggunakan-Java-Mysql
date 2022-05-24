package latihan.satu;

import java.sql.*;
public class KONEKSI {
    static final String driver = "com.mysql.jdbc.Driver";
    static final String url = "jdbc:mysql://localhost/perpustakaan";
    static final String user = "root";
    static final String upass ="";
    static Connection conn;
    static Statement stat;
    
public static void konek(){
try{
Class.forName(driver);
conn=DriverManager.getConnection(url,user,upass);
System.out.println("Koneksi Berhasil");
} catch(Exception e){
    System.out.println("Koneksi gagal");
}
}
public static void main (String [] args){
    konek();
}
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */

