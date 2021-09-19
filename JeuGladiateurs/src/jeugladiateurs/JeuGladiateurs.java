package jeugladiateurs;

import personnages.Personnage;
import combat.CompteurDeTour;
import combat.AffichageEcran;
import java.util.List;

public class JeuGladiateurs {

    public static void main(String[] args) {

    // <editor-fold defaultstate="collapsed" desc="Instanciation des objets">
    CompteurDeTour tour = new CompteurDeTour();
    AffichageEcran affichage = new AffichageEcran();
    Personnage personnage1 = new Personnage("Bob le malchanceux", 15, 15 ,70 ,15);
    Personnage personnage2 = new Personnage("Igor l’empaleur", 25, 5, 100, 30);     

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Affichage pré-combat">
    //Afficher les infos de chaque personnage
    personnage1.afficherInfosPersonnage();
    personnage2.afficherInfosPersonnage();
    //Afficher le message du début du combat
    affichage.afficherDebutCombat();
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Mécanique de combat">
    // La boucle contenant les étapes du combat
    while(personnage1.getPointsDeVie() != 0 && personnage2.getPointsDeVie() != 0){
        tour.afficheTour();
        
        for (int i = 0; i < 101; i++) {
            if(i == personnage1.getInitiative()){
                personnage1.frapperPersonnage(personnage2);
            }
            else if(i == personnage2.getInitiative()){
                personnage2.frapperPersonnage(personnage1);
            }
        }
        personnage1.setNewInitiativeRandom();
        personnage2.setNewInitiativeRandom();
        
        affichage.afficherSeparateurInfosPerso();
        personnage1.afficherInfosPersonnage();
        personnage2.afficherInfosPersonnage();
        tour.augmenteTour();
        affichage.afficherSeparateurDeTour();
    }
    // Après la boucle, afficher le résultat du combat
    affichage.afficheVictoire(personnage1, personnage2);
    // </editor-fold>
    }
}
