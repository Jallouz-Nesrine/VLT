/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.util.Date;

/**
 *
 * @author Nesrine
 */
public class Podometre {
    private int id_pod;
		private int id_vache;
		private float distance;
		private Date periode;
		
		
		
		public int getId_pod() {
			return id_pod;
		}



		public int getId_vache() {
			return id_vache;
		}



		public float getDistance() {
			return distance;
		}



		public Date getPeriode() {
			return periode;
		}



		public void setId_pod(int id_pod) {
			this.id_pod = id_pod;
		}



		public void setId_vache(int id_vache) {
			this.id_vache = id_vache;
		}



		public void setDistance(float distance) {
			this.distance = distance;
		}



		public void setPeriode(Date periode) {
			this.periode = periode;
		}


		public Podometre(float distance, Date periode) {
			this.distance = distance;
			this.periode = periode;
		}



		public Podometre() {
			
		}
}
