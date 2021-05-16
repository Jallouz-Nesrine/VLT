/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import java.sql.Connection;

/**
 *
 * @author Nesrine
 */
public class testConnexion {
     public static void main(String[] args) {
        // TODO code application logic here
        try {
            Connection sn = MyConnexion.Get_Instance().getCon();
           
            
        } catch (Exception e) {
        }
        
    }
    
}
