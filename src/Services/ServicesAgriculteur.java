/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import DB.MyConnexion;
import Entities.Vache;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
/**
 *
 * @author Nesrine
 */
public class ServicesAgriculteur {
    Connection db = MyConnexion.Get_Instance().getCon();
	
public void AjouterVache ( Vache v) {
        
	    
        try {
            
                  Statement ste = db.createStatement();
              String req1 = "INSERT INTO `vache` (`id_vache`, `id_agri`, `id_vet`, `numero`, `race`, `age`, `sexe`, `vaccin`, `dossier_medical`, `periode_chaleur`) VALUES ('"+v.getId_vache()+"','"+v.getId_vache()+"','"+v.getId_vet()+"','"+v.getNumero()+"','"+v.getRace()+"','"+v.getAge()+"','"+v.getSexe()+"','"+v.getVaccin()+"','"+v.getDossier_medical()+"','"+v.getPeriode_chaleur()+"');";
                         
              ste.executeUpdate(req1);
       
             System.out.println("Ajouté avec succès!!");
              }
      catch (SQLException ex) {
           
            System.out.println("\n Erreur lors de l'ajout d'une vache \n"+ex);
       }
}



public void SupprimerVache ( Vache v, int id_vache) {
    
    try{
  
        PreparedStatement prep = db.prepareStatement("delete  from `vache` where id_vache='"+id_vache+"'");
    
        prep.executeUpdate();
       System.out.println("SupprimerVache done \n");
       
    
       
} catch (SQLException ex) {
      System.out.println("SupprimerVache failed \n"+ex);
}


}

public void ModifierVache (int t , Vache v) {
    try {   
       
  String sql1 = "UPDATE `vache`  SET `race`='" + v.getRace() + "',`age`='" + v.getAge() +"',`sexe`='"+v.getSexe()+"',`vaccin`= '"+v.getVaccin()+"' ,`dossier_medical` ='"+v.getDossier_medical()+"',`periode_chaleur` ='"+v.getPeriode_chaleur()+"' WHERE id ='" +t+ "';";

   PreparedStatement ste1 = db.prepareStatement(sql1);
   ste1.executeUpdate();
   System.out.println("La vache : "+v.getId_vache()+" is updated");
  }
  catch(SQLException ex){
      
      System.out.println("Update failed "+ex);
      System.out.println("\n or ID doesn't exist ");
  }
    


}

	
public ArrayList<Vache> AfficherVache() {
    ArrayList<Vache> Va = new ArrayList<>();

  try {
         String sql = " SELECT * from vache where 1;";
   ResultSet result ;
   Statement ste = db.createStatement();
result = ste.executeQuery(sql);
while(result.next()){
Vache v2 = new Vache();
v2.setRace(result.getString("race"));
v2.setAge(result.getInt("age"));
v2.setSexe(result.getString("sexe"));
v2.setVaccin(result.getString("vaccin"));
v2.setDossier_medical(result.getString("Dossier_medical"));
v2.setPeriode_chaleur(result.getInt("periode_chaleur"));


Va.add(v2);
System.out.println("Liste remplie ");
}
} catch (SQLException e) {
   System.out.println("Error is \n"+e);
}

return Va ;


}	
}
