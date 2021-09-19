package combat;

public class CompteurDeTour {

    // <editor-fold defaultstate="collapsed" desc="Attributs">
    //Mettre vos attributs ici
    int cptrTour;
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Constructeurs et initialisation">
    public CompteurDeTour() {
        //Constructeur SANS paramètres qui initialise un compteur de tour (attribut) à 1
        cptrTour = 1;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Getters et setters">
    //Le getter
    public int getCptrTour() {    
        return cptrTour;
    }
    
    //Le setter
    public void setCptrTour(int cptrTour) {
        this.cptrTour = cptrTour;
    }
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Mécanique de jeu">
    public void augmenteTour() {
        //Incrémenter le compteur de tour
        cptrTour++;
    }

    public void afficheTour() {
        //Afficher le tour actuel, tel que montré dans l'énoncé
        System.out.println("---------------");
        System.out.println("TOUR ACTUEL: " + cptrTour);
        System.out.println("---------------");
    }
    // </editor-fold>
}
