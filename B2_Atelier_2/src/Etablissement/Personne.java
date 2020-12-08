package Etablissement;


public abstract class Personne{
	private String nom;
	private String prenom;
	private String adresse;
	private String ville;
	private String dateNaissance;
	
	Personne(String nom, String prenom, String adresse, String ville, String dateNaissance) {
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.ville = ville;
		this.dateNaissance = dateNaissance;
	}
	
	Personne(String nom, String prenom, String adresse, String ville) {
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.ville = ville;
		
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(String dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public abstract void ecrirePersonne();

	/*
	@Override
	public String toString() {
		return "nom: " + getNom() + ", prenom: " + getPrenom() + ", adresse: " + getAdresse()
				+ ", ville: " + getVille() + ", dateNaissance: " + getDateNaissance();
	}
	*/
}