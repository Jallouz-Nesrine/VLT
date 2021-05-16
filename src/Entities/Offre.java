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
public class Offre {
    private int id_offre;
	private String nom;
	private String dateDebut;
	private String dateFin;
	private float prix_offre;
	private String produits;
	private int qt_offre;
	private int nb_participants;
	private int note;

    public Offre(String abs, String date1, String date2, float k, String collier, int i, int i0, int i1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
	
	
	public int getId_offre() {
		return id_offre;
	}


	public String getNom() {
		return nom;
	}


	

	public String getDateDebut() {
		return dateDebut;
	}


	public String getDateFin() {
		return dateFin;
	}


	public void setDateDebut(String dateDebut) {
		this.dateDebut = dateDebut;
	}


	public void setDateFin(String dateFin) {
		this.dateFin = dateFin;
	}


	public float getPrix_offre() {
		return prix_offre;
	}


	public String getProduits() {
		return produits;
	}


	public int getQt_offre() {
		return qt_offre;
	}


	public int getNb_participants() {
		return nb_participants;
	}


	public int getNote() {
		return note;
	}


	public void setId_offre(int id_offre) {
		this.id_offre = id_offre;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	


	public void setPrix_offre(float prix_offre) {
		this.prix_offre = prix_offre;
	}


	public void setProduits(String produits) {
		this.produits = produits;
	}


	public void setQt_offre(int qt_offre) {
		this.qt_offre = qt_offre;
	}


	public void setNb_participants(int nb_participants) {
		this.nb_participants = nb_participants;
	}


	public void setNote(int note) {
		this.note = note;
	}


	

	public Offre(int id_offre, String nom, String dateDebut, String dateFin, float prix_offre, String produits,
			int qt_offre, int nb_participants, int note) {
		super();
		this.id_offre = id_offre;
		this.nom = nom;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.prix_offre = prix_offre;
		this.produits = produits;
		this.qt_offre = qt_offre;
		this.nb_participants = nb_participants;
		this.note = note;
	}


	public Offre () {
		
	}


	
    
}
