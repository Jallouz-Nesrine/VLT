/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import DB.MyConnexion;
import java.sql.Connection;
import java.util.Date;
import java.util.Locale;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import Entities.Offre;
import Entities.Pack;
import Entities.Vache;
import Entities.Agriculteur;
import Entities.Utilisateur;
/**
 *
 * @author Nesrine
 */
public class TestServices {
     private static Object date1;
	private static Object date2;
    private static Object dat;
	
	private float ts;
    public static void main(String[] args) {
    
    
         Connection db = MyConnexion.Get_Instance().getCon();
    
        // TODO code application logic here
        ServicesAdmin AdS = new ServicesAdmin();
        ServicesAgriculteur AgS = new ServicesAgriculteur();
        ServiceUtilisateur UtS = new ServiceUtilisateur();
        
       /*String dat= "12/03/1956";
        //Inscription d'un utilisateur
       Entities.Agriculteur ag = new Entities.Agriculteur( "amin", "amin", dat,  "amin@gmail.com", 54178965, "amin123", "rades", "ben arous",0 );
       UtS.signIn(ag);*/
       
       
       /* String date1 = "12/05/2021";
        String date2 = "17/05/2021";
        float k=(float) 1525.25;
       Entities.Offre o1  = new Entities.Offre("abs" , date1 , date2 ,k , "collier", 15 ,20,0);
       AdS.AjouterOffre(o1);*/
        
        //Ajout d'une vache
      Entities.Vache v = new Entities.Vache(2,1,1,3,"r1", 3, "male", "fait","dossier2" , 0);
       AgS.AjouterVache(v);
        
        //Suppression d'une vache
        /*Entities.Vache v1 = new Entities.Vache();
        AgS.SupprimerVache(v1, 1);*/
        
        
        //Entities.Pack p = new Entities.Pack();
        
       // String sDate1="31/03/2021"; 
        //String sDate2="31/04/2021";  
        
       
        //Date date1=(Date) new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);
        //Date date2=(Date) new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);
        //AdS.AjouterOffre (f);
      
        /*String str="2015-03-31";
        Date date=Date.valueOf(str);//converting string into sql date
        System.out.println(date);*/
        
		//Entities.Offre f = new Entities.Offre("offre1", date3, date4, 580,"colliers", 5,0,0);
    }
}
