package Article;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Article show = new Article("pomada-safra", 4.5);
		
		show.afficher();
		
		
		
		ArticleEnSolde shows = new ArticleEnSolde("pomada-safra", 4.5, 7);
		shows.afficher();
	}
}
