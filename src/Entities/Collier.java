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
public class Collier {
    private int id_collier;
	private int id_vache;
	private float temperature;
	private float pulsation;
	private Localisation position;
	
	
	public int getId_collier() {
		return id_collier;
	}


	public int getId_vache() {
		return id_vache;
	}


	public float getTemperature() {
		return temperature;
	}


	public float getPulsation() {
		return pulsation;
	}


	public Localisation getPosition() {
		return position;
	}


	public void setId_collier(int id_collier) {
		this.id_collier = id_collier;
	}


	public void setId_vache(int id_vache) {
		this.id_vache = id_vache;
	}


	public void setTemperature(float temperature) {
		this.temperature = temperature;
	}


	public void setPulsation(float pulsation) {
		this.pulsation = pulsation;
	}


	public void setPosition(Localisation position) {
		this.position = position;
	}

	public Collier(float temperature, float pulsation, Localisation position) {
		this.temperature = temperature;
		this.pulsation = pulsation;
		this.position = position;
	}


	public Collier () {
		
	}
    
}
