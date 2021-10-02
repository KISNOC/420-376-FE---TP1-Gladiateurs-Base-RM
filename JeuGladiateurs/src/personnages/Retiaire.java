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
public class Retiaire extends Personnage{
    boolean filet = true; 
    int reussiteLancer;
    public Retiaire(String nom, int pointsDeVie, int valeurMaxAttaque, int valeurDefense, int initiative){
        super(nom, pointsDeVie, valeurMaxAttaque, valeurDefense, initiative);
    }
    
    @Override
    public void frapperPersonnage(Personnage personnageCible) {
        if (filet) {
            System.out.println("\n" + nom + " lance son filet");
            Random rand = new Random();
            reussiteLancer = (rand.nextInt(10));
            if (reussiteLancer == 1) {
                System.out.println("Son filet attrape " + nom + " et il l’empale sauvagement avec sa lance");
                personnageCible.setPointsDeVie(0);
            }
            else{
                System.out.println("Le filet n'atteint pas sa cible"); 
            }
            filet = false;
        }
        else{
            System.out.println("\n" + nom + " ramasse son filet et en profite pour attaquer");
            super.frapperPersonnage(personnageCible);
            filet = true;
        }
    }
    
    
}
