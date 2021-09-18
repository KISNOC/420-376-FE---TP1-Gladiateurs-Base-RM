package personnages;

public class Personnage {

    // <editor-fold defaultstate="collapsed" desc="Attributs">
    // TODO : Mettre vos attributs ici
    String nom;
    int pointsDeVie;
    int valeurMaxAttaque;
    int valeurDefense;
    int initiative;
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Constructeurs et initialisation">
    public Personnage(String nom, int attaqueMax, int defense, int pvs, int ini) {
        // TODO : Constructeur AVEC paramètres
        this.nom = nom;
        this.pointsDeVie = pvs;
        this.valeurMaxAttaque = attaqueMax;
        this.valeurDefense = defense;
        this.initiative = ini;
    }

    public Personnage() {
        // TODO : Constructeur SANS paramètres qui initialise à ZÉRO ou à ""
        String nom = "";
        int pointsDeVie = -1;
        int valeurMaxAttaque = -1;
        int valeurDefense = -1;
        int initiative = -1;
    }
    // </editor-fold>
    public String getNom() {
        return nom;
        // TODO : Afficher les infos du personnage, tel que montré dans l'énoncé
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

    // <editor-fold defaultstate="collapsed" desc="Getters et setters">
    // TODO : Les getters
    public int getInitiative() {    
        return initiative;
    }
    public void setNom(String nom) {
        this.nom = nom;
        // TODO : Afficher les infos du personnage, tel que montré dans l'énoncé
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

    // TODO : Les setters
    public void setInitiative(int initiative) {    
        this.initiative = initiative;
    }

    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Mécanique de jeu">
    public void afficherInfosPersonnage() {
        // TODO : Afficher les infos du personnage, tel que montré dans l'énoncé
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
        // TODO : Retourner la valeur de l'attaque du personnage.
        // Cette valeur est trouvée aléatoirement et doit se situer entre ZÉRO et valeurMaxAttaque.
        return 0;
    }

    public void frapperPersonnage(Personnage personnageCible) {
        // TODO : Récupérer la valeur d'attaque pour ce tour, calculer les dégats,
        //modifier les points de vie du personnage cible, afficher les détails
        // sur l'attaque, tel que montré dans l'énoncé.
    }

    public void setNewInitiativeRandom() {
        // TODO : Modifier de façon aléatoire la valeur INI du personnage.
    }
    // </editor-fold>
}
