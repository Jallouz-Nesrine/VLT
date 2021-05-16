/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Entities.Vache;

/**
 *
 * @author Nesrine
 */
public interface IAgriculteur {
    public void AjouterVache ( Vache v) ;
    public void SupprimerVache ( Vache v, int id_vache);
    public void ModifierVache (int t , Vache v);
}
