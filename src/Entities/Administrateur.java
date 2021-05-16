/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

/**
 *
 * @author Nesrine
 */
public class Administrateur extends Utilisateur {
    private String specialite;
		
	
		
		public String getSpecialite() {
			return specialite;
		}



		public void setSpecialite(String specialite) {
			this.specialite = specialite;
		}

	

		public Administrateur(int id, String nom, String prenom, String dateNaiss, int age, String email, int numTel,
				String mot_de_passe, String specialite) {
			super(id, nom, prenom, dateNaiss, age, email, numTel, mot_de_passe);
			this.specialite = specialite;
		}



		public Administrateur () {
			
		}

    
    
}
