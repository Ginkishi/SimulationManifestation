/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package systemeavance;

/**
 *
 * @author e1603982
 */
public abstract class CelluleActive extends Cellule{
    public Groupe GroupeReferent;//Reference vers le groupe dont elle fait partie, Null si elle ne fait partie d'aucun groupe
    public abstract Point Deplacement();
    public CelluleActive(Point centre,Groupe referent){
        super(centre);
        this.GroupeReferent=referent;
    }
}
