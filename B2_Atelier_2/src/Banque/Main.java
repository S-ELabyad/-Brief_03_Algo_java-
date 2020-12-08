package Banque;

public class Main {

    public static void main(String[] args) {
            Compte compte = new Compte(1009238490, 50);
            compte.Ajouter(150);
            compte.retier(100);

            System.out.println(compte.Afficher());
    }
}
