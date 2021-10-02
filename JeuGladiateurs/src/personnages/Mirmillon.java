/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personnages;

import java.util.Random;

/**
 *
 * @author ETI
 */
public class Mirmillon extends Personnage {

    //TODO Changer Personnage par Mirmillion pour la création du personnage
    public Mirmillon(String nom, int pointsDeVie, int valeurMaxAttaque, int valeurDefense, int initiative){
        super(nom, pointsDeVie, valeurMaxAttaque, valeurDefense, initiative);
    }
    
    @Override
    public void setNewInitiativeRandom() {
        Random rand = new Random();
        initiative = (rand.nextInt(30));
    }
    
    @Override
    public void frapperPersonnage(Personnage personnageCible) {
        super.frapperPersonnage(personnageCible); //To change body of generated methods, choose Tools | Templates.
        
        if (personnageCible.pointsDeVie == 0) {
            System.out.println(personnageCible.nom + " se fait décapité par " + nom + " !");
        }
        else{
            System.out.println(nom + " effectue une second frappe");
           super.frapperPersonnage(personnageCible); 
        }
    }
}
