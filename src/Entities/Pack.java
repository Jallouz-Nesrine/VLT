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
public class Pack {
     private int id_pack;
	private String nom;
	private float prix_pack;
	private String produits;
	private int qt_pack;
	private int nb_participants;
	private int note;
	private String type;
	
	
	
	public int getId_pack() {
		return id_pack;
	}





	public String getNom() {
		return nom;
	}





	public float getPrix_pack() {
		return prix_pack;
	}





	public String getProduits() {
		return produits;
	}





	public int getQt_pack() {
		return qt_pack;
	}





	public int getNb_participants() {
		return nb_participants;
	}





	public int getNote() {
		return note;
	}





	public String getType() {
		return type;
	}





	public void setId_pack(int id_pack) {
		this.id_pack = id_pack;
	}





	public void setNom(String nom) {
		this.nom = nom;
	}





	public void setPrix_pack(float prix_pack) {
		this.prix_pack = prix_pack;
	}





	public void setProduits(String produits) {
		this.produits = produits;
	}





	public void setQt_pack(int qt_pack) {
		this.qt_pack = qt_pack;
	}





	public void setNb_participants(int nb_participants) {
		this.nb_participants = nb_participants;
	}





	public void setNote(int note) {
		this.note = note;
	}





	public void setType(String type) {
		this.type = type;
	}





	public Pack(String nom, float prix_pack, String produits, int qt_pack, int nb_participants, int note, String type) {
		this.nom = nom;
		this.prix_pack = prix_pack;
		this.produits = produits;
		this.qt_pack = qt_pack;
		this.nb_participants = nb_participants;
		this.note = note;
		this.type = type;
	}





	public Pack () {
		
	}

}
