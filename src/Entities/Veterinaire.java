/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.util.List;

/**
 *
 * @author Nesrine
 */
public class Veterinaire extends Utilisateur {
     private String adresse;
    private int note;
    private List<Vache> vaches;
	
	
	
	public String getAdresse() {
		return adresse;
	}



	public int getNote() {
		return note;
	}



	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}



	public void setNote(int note) {
		this.note = note;
	}

    

	public Veterinaire(int id, String nom, String prenom, String dateNaiss, int age, String email, int numTel,
			String mot_de_passe, String adresse, int note) {
		super(id, nom, prenom, dateNaiss, age, email, numTel, mot_de_passe);
		this.adresse = adresse;
		this.note = note;
	}



	public Veterinaire () {
		
	}
    
    
}
