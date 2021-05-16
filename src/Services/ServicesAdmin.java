/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import DB.MyConnexion;
import Entities.Offre;
import Entities.Pack;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Nesrine
 */
public class ServicesAdmin {
    Connection db = MyConnexion.Get_Instance().getCon();


public void AjouterOffre (Offre o) {
        
	    
        try {
            
                  Statement ste = db.createStatement();
              String req1 = "INSERT INTO `offre` (`id_offre`,`nom`, `dateDebut`, `dateFin` , `prix_offre`, `produits`,`nb_participants`,`qt_offre`,`note`) VALUES ('"+o.getId_offre()+"','"+o.getNom()+"','"+o.getDateDebut()+"','"+o.getDateFin()+"','"+o.getPrix_offre()+"','"+o.getProduits()+"','"+o.getNb_participants()+"','"+o.getQt_offre()+"','"+o.getNote()+"','"+0+"');";
                         
              ste.executeUpdate(req1);
       
             System.out.println("AjoutÃ© !!");
              }
      catch (SQLException ex) {
           
            System.out.println("\n Erreur lors de l'ajout d'un offre \n"+ex);
       }
}



public void SupprimerOffre( Offre o, int id_offre) {
    
    try{
        String sql = "select * from `offre` where id_offre ='"+o.getId_offre()+"'";
        ResultSet result ;
         Statement ste = db.createStatement();
     result = ste.executeQuery(sql);
while(result.next()){
       
        o.setId_offre(result.getInt(1));
        System.out.println("id_offre = "+o.getId_offre());//retourne l'id user qui est auto incrÃ©mentÃ© dans la base 
        PreparedStatement prep = db.prepareStatement("delete  from `offre` where id_offre='"+id_offre+"'");
    
        prep.executeUpdate();
       System.out.println("SupprimerOffre done 2 \n");
       
    }
       
} catch (SQLException ex) {
      System.out.println("SupprimerOffre failed \n"+ex);
}


}

public void ModifierOffre(int t, Offre f) {
    try {   
       
  String sql1 = "UPDATE `offre`  SET `Nom`='" + f.getNom() + "',`DateDébut`='" + f.getDateDebut() +"',`DateFin`='"+f.getDateFin()+"',`prix_offre`= '"+f.getPrix_offre()+"' ,`produits`= '"+f.getProduits()+"' ,`nb_participants` ='"+f.getNb_participants()+"',`qt_offre` ='"+f.getQt_offre()+"',`note` ='"+f.getNote()+"' WHERE id_offre ='" +t+ "';";

   PreparedStatement ste1 = db.prepareStatement(sql1);
   ste1.executeUpdate();
   System.out.println("L'offre : "+f.getId_offre()+" is updated");
  }
  catch(SQLException ex){
      
      System.out.println("Update failed "+ex);
      System.out.println("\n or ID doesn't exist ");
  }
    


}



public void AjouterPack ( Pack p) {
    
    
    try {
        
              Statement ste = db.createStatement();
          String req1 = "INSERT INTO `pack` (`id_pack`, `nom`, `prix_pack`,`produits`,`nb_participants`,`qt_pack`,`note`,`type`) VALUES ('"+p.getId_pack()+"','"+p.getNom()+"','"+p.getPrix_pack()+"','"+p.getProduits()+"','"+p.getNb_participants()+"','"+p.getQt_pack()+"','"+p.getNote()+"','"+p.getType()+"','"+0+"');";
                     
          ste.executeUpdate(req1);
   
         System.out.println("AjoutÃ© !!");
          }
  catch (SQLException ex) {
       
        System.out.println("\n Error lors de l'ajout d'un pack \n"+ex);
   }
}



public void SupprimerPack( Pack p, int ID_Pack) {

try{
    String sql = "select * from `pack` where id ='"+p.getId_pack()+"'";
    ResultSet result ;
     Statement ste = db.createStatement();
 result = ste.executeQuery(sql);
while(result.next()){
   
    p.setId_pack(result.getInt(1));
    System.out.println("id = "+p.getId_pack());//Retourne l'id user qui est auto incrÃ©mentÃ© dans la base 
    PreparedStatement prep = db.prepareStatement("delete  from `pack` where id='"+ID_Pack+"'");

    prep.executeUpdate();
   System.out.println("SupprimerPack done 2 \n");
   
}
   
} catch (SQLException ex) {
  System.out.println("SupprimerOffre failed \n"+ex);
}


}

public void ModifierPack(int t , Pack p) {
try {   
   
String sql1 = "UPDATE `pack`  SET `Nom`='" + p.getNom() + "',`Prix_Pack`= '"+p.getPrix_pack()+"' ,`produits`= '"+p.getProduits()+"' ,`Nb_Participants` ='"+p.getNb_participants()+"',`Qt_pack` ='"+p.getQt_pack()+"',`Note` ='"+p.getNote()+"',`Type` ='"+p.getType()+"' WHERE id ='" +t+ "';";

PreparedStatement ste1 = db.prepareStatement(sql1);
ste1.executeUpdate();
System.out.println("Le pack : "+p.getId_pack()+" is updated");
}
catch(SQLException ex){
  
  System.out.println("Update failed "+ex);
  System.out.println("\n or ID doesn't exist ");
}



}


    
}
