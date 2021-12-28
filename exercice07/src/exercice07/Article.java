package exercice07;

public class Article {
	
	//Attributs :
	private double prixAchat ;
	private double prixVente ;
	private String nom ;
	private String fournisseur ;
	
	//getter et setter :
	public double getPrixAchat() {
		return prixAchat;
	}

	public void setPrixAchat(double prixAchat) {
		this.prixAchat = prixAchat;
	}

	public double getPrixVente() {
		return prixVente;
	}

	public void setPrixVente(double prixVente) {
		this.prixVente = prixVente;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getFournisseur() {
		return fournisseur;
	}

	public void setFournisseur(String fournisseur) {
		this.fournisseur = fournisseur;
	}

	//deux constructeurs :
	public Article()
	{}
	
	public Article(double prixAchat , double prixVente , String nom ,String fournisseur)
	{
		setPrixVente(prixAchat);
		setPrixVente(prixVente) ;
		setNom(nom);
		setFournisseur(fournisseur);
	}
	
	//méthode calculer le taux de rendement :
	public double calculerTauxRendement()
	{
		return prixVente - prixAchat;
	}
	
	//méthode d'affichage :
	public void affichage()
	{
		System.out.println("le prix : "+prixVente+"\nle nom d'article : "+nom+"\nle fournisseur : "+fournisseur) ;
	}

}
