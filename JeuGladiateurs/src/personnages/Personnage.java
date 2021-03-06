package personnages;
import java.util.Random;

public class Personnage {

    // <editor-fold defaultstate="collapsed" desc="Attributs">
    // Mettre vos attributs ici
    String nom;
    int pointsDeVie;
    int valeurMaxAttaque;
    int valeurDefense;
    int initiative;
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Constructeurs et initialisation">
    public Personnage(String nom, int attaqueMax, int defense, int pvs, int ini) {
        //Constructeur AVEC paramètres
        this.nom = nom;
        this.pointsDeVie = pvs;
        this.valeurMaxAttaque = attaqueMax;
        this.valeurDefense = defense;
        this.initiative = ini;
    }

    public Personnage() {
        //Constructeur SANS paramètres qui initialise à ZÉRO ou à ""
        String nom = "";
        int pointsDeVie = -1;
        int valeurMaxAttaque = -1;
        int valeurDefense = -1;
        int initiative = -1;
    }
    public String getNom() {
        return nom;
    }

    public int getPointsDeVie() {
        return pointsDeVie;
    }

    public int getValeurMaxAttaque() {
        return valeurMaxAttaque;
    }

    public int getValeurDefense() {
        return valeurDefense;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Getters et setters">
    //Les getters
    public int getInitiative() {    
        return initiative;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPointsDeVie(int pointsDeVie) {
        this.pointsDeVie = pointsDeVie;
    }

    public void setValeurMaxAttaque(int valeurMaxAttaque) {
        this.valeurMaxAttaque = valeurMaxAttaque;
    }

    public void setValeurDefense(int valeurDefense) {
        this.valeurDefense = valeurDefense;
    }

    //Les setters
    public void setInitiative(int initiative) {    
        this.initiative = initiative;
    }

    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Mécanique de jeu">
    public void afficherInfosPersonnage() {
        //Afficher les infos du personnage, tel que montré dans l'énoncé
        String statut = "";
        if (pointsDeVie <= 0) {
            statut = "Mort";
        }
        else {
            statut = "Vivant";
        }
        System.out.println("\n" + nom);
        System.out.println("    Attaque : " + valeurMaxAttaque);
        System.out.println("    Défence : " + valeurDefense);
        System.out.println("    Points de vie : " + pointsDeVie);
        System.out.println("    initiative : " + initiative);
        System.out.println("    Statut : " + statut);
    }

    private int attaqueCalcul() {
        // Retourner la valeur de l'attaque du personnage.
        // Cette valeur est trouvée aléatoirement et doit se situer entre ZÉRO et valeurMaxAttaque.
        Random rand = new Random();
        int nombreAleatoire;
        nombreAleatoire = (rand.nextInt(valeurMaxAttaque));
        return nombreAleatoire;
    }

    public void frapperPersonnage(Personnage personnageCible) {
        // Récupérer la valeur d'attaque pour ce tour, calculer les dégats,
        int dommages;
        int forceDeFrappe;
        int valeurDefenseDefenseur;
        forceDeFrappe = attaqueCalcul();
        valeurDefenseDefenseur = personnageCible.valeurDefense;
        
        dommages = forceDeFrappe - valeurDefenseDefenseur;
        
        if (dommages < 0) {
            dommages = 0;
        }
        personnageCible.pointsDeVie -= dommages;
        if (personnageCible.pointsDeVie <= 0) {
            personnageCible.pointsDeVie = 0;
        }
        
        // modifier les points de vie du personnage cible, afficher les détails
        // sur l'attaque, tel que montré dans l'énoncé.
        System.out.println("\n" + nom + " attaque avec une puissance de : " + forceDeFrappe);
        System.out.println(personnageCible.nom + " a une défence de : " + valeurDefenseDefenseur);
        System.out.println("Les dommages sont donc de : " + dommages);
    }

    public void setNewInitiativeRandom() {
        // Modifier de façon aléatoire la valeur INI du personnage.
        Random rand = new Random();
        initiative = (rand.nextInt(100));
    }
    // </editor-fold>
}
