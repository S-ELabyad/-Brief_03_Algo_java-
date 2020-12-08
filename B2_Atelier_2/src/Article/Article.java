package Article;

public class Article {
	
	private String nom;
	private double prix;
	

	public Article() {
		
	}
	
	public Article(String nom , double prix) {
		this.nom = nom;
		this.setPrix(prix);
	}
	
	
	public void afficher() {
		System.out.println("le nom de l'article est "+ this.nom + " de prix " + this.getPrix() +" DH \n");
	}
	
	public double getPrix() {
		return prix;
	}
	
	public void setPrix(double prix) {
		this.prix = prix;
	}



}
