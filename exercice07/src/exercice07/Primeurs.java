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

	//constructeurs sans param�tres :
	public Primeurs()
	{ 
		super();
	}
	
	//constructeur avec param�tres :
	public Primeurs(double prixAchat , double prixVente , String nom ,String fournisseur,Date datePeremption)
	{
		super(prixAchat,prixVente,nom,fournisseur);
		setDatePeremption(datePeremption) ;
	}
	
	@Override
	public void affichage()
	{
		super.affichage();
		System.out.println("date de p�remption : "+datePeremption.getDate()+"/"+datePeremption.getMonth()+"/"+datePeremption.getYear());
	}
	
	//m�thode impl�ment�e par l'interface Produits :
	public Date datePeremption()
	{
		return getDatePeremption();
	}
	
	//m�thode impl�ment�e par l'interface Produits :
	public int joursRestant()
	{
		Date auj = new Date();
		int dayAuj = auj.getDay()+auj.getMonth()*30 + auj.getYear()*365;
		int dayPeremption = datePeremption.getDay()+datePeremption.getMonth()*30 + datePeremption.getYear()*365;
		return dayAuj-dayPeremption ;
	}
}
