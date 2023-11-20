/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class KoneksiDatabase {
    private static Connection KoneksiDatabase;
     public static Connection getKoneksi() {
         if (KoneksiDatabase==null){
             try {
                  String url;
                  url= "jdbc:mysql://localhost:3306/petshop";
                  String ussername ="root";
                  String password = "";
                  DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                  KoneksiDatabase =  DriverManager.getConnection(url,ussername,password);
                   
             } catch (SQLException t) {
                 JOptionPane.showMessageDialog(null, "error koneksi");
             }
            
         }return KoneksiDatabase;
     }static Object getConnection(){
         throw new UnsupportedOperationException("Not Yet implemented");
         
         }
             
        
    }
    

