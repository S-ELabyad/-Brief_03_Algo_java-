package Banque;

public class Compte {
    private long numCompte;
    private double Solde;

    private double soldeRetirer;
    private double soldeAjouter;
    
    private double intererAnuelle;

    public Compte(long numCompte, double Solde) {
        this.numCompte = numCompte;
        this.Solde = Solde;
    }

    public double Ajouter(double newSolde) {
        return this.soldeAjouter = this.Solde + newSolde;
    }
    public double retier(double retirer) {
        if(this.soldeAjouter > 200) {
            return this.soldeRetirer = soldeAjouter - retirer;
        }
        else {
            return this.soldeRetirer = soldeAjouter;
        }
    }


    public double intererAnuelle() {
        this.intererAnuelle = 200 + this.soldeAjouter*0.07;
        return this.intererAnuelle;
    }

    public String Afficher() {
        if(this.soldeAjouter > 200) {
            return "Bonjour votre numero de compte " + this.numCompte + " , et votre solde apres ajouter " + this.soldeAjouter + 
                    ", et votre sold apres retirer et " + this.soldeRetirer + " \n est votre interer annuelle :" + intererAnuelle() + "\n";
        }
        else {
            return "Bonjour votre numero de compte " + this.numCompte + " , et votre solde apres ajouter " + this.soldeAjouter + 
                    ", et votre sold apres retirer et " + this.soldeRetirer +  " \n est votre interer annuelle :" + intererAnuelle() +
                    " \n ---------------- Warning ----------------- \n" +
                    "votre solde et < 200 alors tu as pas le droit de retier un solde";
        }
    }
}