package exercice07;

import java.util.Date;

public class Test {

	public static void main(String[] args) {

		Article article1 = new Article(1,1.5,"stylo","Ali ALI");
		Article article2 = new Article(20,25,"télécommande","Ahmed ");
		Article article3 = new Article(30,35,"pomme de terre","Yahya");
		
		Article article4 = new Primeurs(40,45,"tomate","Samir",new Date(2021,4,4));
		Article article5 = new Primeurs(50,55,"kaki","Rayan",new Date(2020,5,5));
		Article article6 = new Primeurs(60,65,"pomme","Ali",new Date(2019,6,6));
		Article article7 = new ArticleElectromenage(70,75,"télévision","Adam",224,"Itel");

		Magasin magasin = new Magasin(article7,900);
		magasin.approvisionner(article1, 110);
		magasin.approvisionner(article2, 200);
		magasin.approvisionner(article1, 300);
		magasin.approvisionner(article2, 400);
		magasin.approvisionner(article5, 500);
		magasin.approvisionner(article6, 600);
		
		magasin.vendreArticles(article1, 110);
		magasin.vendreArticles(article6, 600);
		magasin.listerArticleEnstock();
		magasin.listerRupture();
		System.out.println("la quantité de l'article ["+article7.getNom()+"] en stock est : "+magasin.quantiteeEnStock(article1));
		magasin.descriptionMagasin();
		magasin.tauxRendement();
	}

}
