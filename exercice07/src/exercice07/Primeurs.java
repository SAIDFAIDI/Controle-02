package exercice07;
import java.util.Date ;
public class Primeurs extends Article implements Produits {
	
	//Attributs :
	
	private Date datePeremption ;
	
	public Date getDatePeremption() 
	{
		return datePeremption;
	}

	public void setDatePeremption(Date datePeremption) 
	{
		this.datePeremption = datePeremption;
	}

	//constructeurs sans paramètres :
	public Primeurs()
	{ 
		super();
	}
	
	//constructeur avec paramètres :
	public Primeurs(double prixAchat , double prixVente , String nom ,String fournisseur,Date datePeremption)
	{
		super(prixAchat,prixVente,nom,fournisseur);
		setDatePeremption(datePeremption) ;
	}
	
	@Override
	public void affichage()
	{
		super.affichage();
		System.out.println("date de péremption : "+datePeremption.getDate()+"/"+datePeremption.getMonth()+"/"+datePeremption.getYear());
	}
	
	//méthode implémentée par l'interface Produits :
	public Date datePeremption()
	{
		return getDatePeremption();
	}
	
	//méthode implémentée par l'interface Produits :
	public int joursRestant()
	{
		Date auj = new Date();
		int dayAuj = auj.getDay()+auj.getMonth()*30 + auj.getYear()*365;
		int dayPeremption = datePeremption.getDay()+datePeremption.getMonth()*30 + datePeremption.getYear()*365;
		return dayAuj-dayPeremption ;
	}
}
