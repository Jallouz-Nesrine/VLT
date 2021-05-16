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
public class Agriculteur extends Utilisateur {
	
	private String adresse;
	private String region;
	private int score;
	private List<Vache> vaches;	

    public Agriculteur(String amin, String amin0, String dat, String amingmailcom, int i, String amin123, String rades, String ben_arous, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
	
	
	public String getAdresse() {
		return adresse;
	}



	public String getRegion() {
		return region;
	}



	public int getScore() {
		return score;
	}



	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}



	public void setRegion(String region) {
		this.region = region;
	}



	public void setScore(int score) {
		this.score = score;
	}

	
	
	
	
	public Agriculteur(int id, String nom, String prenom, String dateNaiss, int age, String email, int numTel,
			String mot_de_passe, String adresse, String region, int score) {
		super(id, nom, prenom, dateNaiss, age, email, numTel, mot_de_passe);
		this.adresse = adresse;
		this.region = region;
		this.score = score;
	}



	public Agriculteur( String nom, String prenom, String dateNaiss, int age, String email, int numTel,
			String mot_de_passe, String adresse, String region, int score) {
		super( nom, prenom, dateNaiss, age, email, numTel, mot_de_passe);
		this.adresse = adresse;
		this.region = region;
		this.score = score;
	}



	public Agriculteur () {
		
	}
    
}
