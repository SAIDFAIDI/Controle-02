package exercice07;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Magasin {
	
	//attributs :
	private HashMap<Article,Integer> listeArticle = new HashMap<>();
	private ArrayList<Article> articleVendu = new ArrayList<>() ;
	private ArrayList<Article> articleEnStock = new ArrayList<>() ;
	
	//constructeurs :
	public Magasin()
	{
		
	}
	
	public Magasin(Article article , int quantitee) 
	{
		if(listeArticle.containsKey(article) == false)
		{
			listeArticle.put(article , quantitee);
			articleEnStock.add(article);
		}
		else
			listeArticle.replace(article , listeArticle.get(article)+quantitee);
	}
	//méthode vendreArticles :
	public void vendreArticles(Article article , int quantitee)
	{
			if( listeArticle.containsKey(article) == true )
			{
				if( listeArticle.get(article) >= quantitee )
				{
					listeArticle.replace(article,listeArticle.get(article)-quantitee );
					System.out.println("la quantité demandé de l'article ["+article.getNom()+"] est vendu :");
					if(listeArticle.get(article) == 0)
					{
						articleEnStock.remove(article);	
					}
					articleVendu.add(article);
				}
				else
					System.out.println("la quantité demandé de l'article ["+article.getNom()+"] non disponible !!");
			}
			else 
				System.out.println("l'article ["+article.getNom()+"] n'exist pas !");
	}
	
	//méthode s'approvisionner :
		public void approvisionner(Article article,int quantitee)
		{
			if(listeArticle.containsKey(article) == true )
			{
				listeArticle.replace(article,listeArticle.get(article)+quantitee);
				System.out.println("l'atricle ["+article.getNom()+"] a été ajoujé sur le stock : ");
				if(articleEnStock.contains(article) != true)
					articleEnStock.add(article);
			}
			else
			{
				listeArticle.put(article,quantitee);
				System.out.println("creation de stock pour l'article ["+article.getNom()+"] :");
				articleEnStock.add(article);
			}	
		}
	
	//méthode de lister les articles vendu :
	public void listerRupture()
	{
		System.out.print("lister des article rupture : ");	
		System.out.print("[");
		for(Article tem : articleVendu)
			System.out.print(" "+tem.getNom()+" ");
		System.out.println("]");
	}
	
	//méthode de lister les articles en stocks :
	public void listerArticleEnstock()
	{
		System.out.print("Lister les articles disponibles en stock :");
		System.out.print("[");
		for(Article tem : articleEnStock)
			System.out.print(" "+tem.getNom()+" ");
		System.out.println("]");
	}
	 
	//méthode de affiché la quantité en stock par un nom d'article :
	public double quantiteeEnStock(Article nom)
	{
	if(listeArticle.containsKey(nom) == true)
		return listeArticle.get(nom);
	else
		return 0 ;
	}
	
	public void descriptionMagasin()
	{
		System.out.println("description de l'état du magasin :");
		//for()
		System.out.println(listeArticle);
	}
	
	//méthode de calculer le taux de rendement :
	public double tauxRendement()
	{
		double taux = 0;
		for(Article tem : articleVendu)
		{
			taux += (double)tem.calculerTauxRendement()*quantiteeEnStock(tem);
		}
		System.out.println("le taux de rendement : "+taux);
		return taux ;
	}
}

