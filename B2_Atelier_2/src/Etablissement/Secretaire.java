package Etablissement;


public class Secretaire extends Personne {
	private String numeroDeBureaux;

	Secretaire(String nom, String prenom, String adresse, String ville, String numeroDeBureaux) {
		super(nom, prenom, adresse, ville);
		
		this.numeroDeBureaux = numeroDeBureaux;
	}

	public String getNumeroDeBureaux() {
		return numeroDeBureaux;
	}

	public void setNumeroDeBureaux(String numeroDeBureaux) {
		this.numeroDeBureaux = numeroDeBureaux;
	}

	@Override
	public void ecrirePersonne() {
		System.out.println("nom: " + getPrenom() + "prenom: " + getPrenom() + "adress: " + getAdresse() + "ville: " + getVille() + "numero de bureaux: " + getNumeroDeBureaux());
	}

	@Override
	public String toString() {
		return "Secretaire [getNumeroDeBureaux()=" + getNumeroDeBureaux() + ", getNom()=" + getNom() + ", getPrenom()="
				+ getPrenom() + ", getAdresse()=" + getAdresse() + ", getVille()=" + getVille() + "]";
	}
}
