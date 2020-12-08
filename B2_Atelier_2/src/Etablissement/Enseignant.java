package Etablissement;

public class Enseignant extends Personne {
	
	private static int nombrecree;

	Enseignant(String nom, String prenom, String adresse, String ville) {
		super(nom, prenom, adresse, ville);
		nombrecree++;
	}
	
	public void ecrirePersonne() {
		System.out.println("Enseignant Number: " + Enseignant.nombrecree + " nom: " + getPrenom() + "prenom: " + getPrenom() + "adress: " + getAdresse() + "ville: " + getVille());
	}
}
