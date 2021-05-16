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
public class Utilisateur {
     private int id;
	private String nom;
	private String prenom;
	private String dateNaiss;
	private int age;
	private String email;
	private int numTel;
	private String mot_de_passe;
	
	
	
	public int getId() {
		return id;
	}
	
	public String getNom() {
		return nom;
	}

	public String getPrenom() {
		return prenom;
	}

	
	

	public int getAge() {
		return age;
	}

	public String getEmail() {
		return email;
	}

	public int getNumTel() {
		return numTel;
	}

	public String getMot_de_passe() {
		return mot_de_passe;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	

	public String getDateNaiss() {
		return dateNaiss;
	}

	public void setDateNaiss(String dateNaiss) {
		this.dateNaiss = dateNaiss;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setNumTel(int numTel) {
		this.numTel = numTel;
	}
	
	public void setMot_de_passe(String mot_de_passe) {
		this.mot_de_passe = mot_de_passe;
	}

	
	

	public Utilisateur(int id, String nom, String prenom, String dateNaiss, int age, String email, int numTel,
			String mot_de_passe) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaiss = dateNaiss;
		this.age = age;
		this.email = email;
		this.numTel = numTel;
		this.mot_de_passe = mot_de_passe;
	}

	public Utilisateur(String nom, String prenom, String dateNaiss, int age, String email, int numTel,
			String mot_de_passe) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaiss = dateNaiss;
		this.age = age;
		this.email = email;
		this.numTel = numTel;
		this.mot_de_passe = mot_de_passe;
	}

	@Override
	public String toString() {
		return "Utilisateur [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", dateNaiss=" + dateNaiss + ", age="
				+ age + ", email=" + email + ", numTel=" + numTel + ", mot_de_passe=" + mot_de_passe + "]";
	}

	public Utilisateur() {
		
	}
	
    
    
}
