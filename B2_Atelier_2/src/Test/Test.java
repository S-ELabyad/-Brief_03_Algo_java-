package Test;

public class Test {
	private String nom;
	private String prenom;
	private String adress;
	private int anneeNaissance;
	private int anneeEncours;
	
	public Test() {
		
	}
	
	public Test(String nom, String prenom, String adress, int anneeNaissance, int anneeEncours) {
		this.nom = nom;
		this.prenom = prenom;
		this.adress = adress;
		this.anneeNaissance = anneeNaissance;
		this.anneeEncours = anneeEncours;
	}

	public int calculerAge() {
		return  this.anneeEncours - this.anneeNaissance;
	}
	public void afficherInfosClient() {
		System.out.println(this.nom + " " + this.prenom + " , né le " + this.anneeNaissance + " habitant " + this.adress + " , "  + calculerAge() + " ans ");
	}
}
