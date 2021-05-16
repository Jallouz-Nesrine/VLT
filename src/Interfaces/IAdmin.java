/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Entities.Offre;
import Entities.Pack;

/**
 *
 * @author Nesrine
 */
public interface IAdmin {
    public void AjouterOffre (Offre o);
	    public void SupprimerOffre ( Offre o, int id_offre);
	    public void ModifierOffre(int t, Offre f);
	    
	    public void AjouterPack ( Pack p);
	    public void SupprimerPack( Pack p, int ID_Pack);
	    public void ModifierPack(int t , Pack p) ;
	    
    
}
