/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Nesrine
 */
public class MyConnexion {
      private String url="jdbc:mysql://localhost:3306/vdb";
    private String login="root";
    private String passwd="" ;
    private Connection conn ;
    private static MyConnexion instance  ;
     
    private MyConnexion () {
        try {
            conn =  DriverManager.getConnection(url,login, passwd);
            
             System.out.println("connexionn done !");
             
        } catch (SQLException ex) {
            System.out.println("connexion failed ??!!\n"+ex);
        }
        
    }
    
   public static MyConnexion Get_Instance () {
       if (instance == null){
           instance = new  MyConnexion();
       }
        return instance ;
       
       
   }
   public Connection getCon() {
       
       return conn ;
       
   }
   
    
}
