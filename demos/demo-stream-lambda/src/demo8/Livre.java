package demo8;

public class Livre {
	private String titre;
	private String isbn;
	private double prix;
	
	public Livre(String titre, String isbn, double prix ) {
		this.titre = titre;
		this.isbn = isbn;
		this.prix = prix;
	}
	
	@Override
	public boolean equals( Object obj ) {
		boolean resultat = false;
		
		if( obj instanceof Livre ) {
			Livre temp = (Livre) obj;
			
			resultat = temp.isbn == isbn;
		}
		
		return resultat;
	}
	
	public String getTitre() {
		return titre;
	}
	
	public String getIsbn() {
		return isbn;
	}
	
	public double getPrix() {
		return prix;
	}
	
	public void setPrix( double nouveauPrix ) {
		prix = nouveauPrix;
	}
}