package Etablissement;


public class Etudiant extends Personne {

	private static int nombrecree;
	
	Etudiant(String nom, String prenom, String adresse, String ville) {
		super(nom, prenom, adresse, ville);
		nombrecree++;
	}

	public void ecrirePersonne() {
		System.out.println("Eudiant Number: " + Etudiant.nombrecree + " nom: " + getPrenom() + "prenom: " + getPrenom() + "adress: " + getAdresse() + "ville: " + getVille());
	}
}