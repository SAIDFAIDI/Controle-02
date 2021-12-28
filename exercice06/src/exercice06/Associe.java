package exercice06;
import java.util.Date ;
public class Associe extends Employer{

	//attributs :
	private float pourcentage ;
	private double chiffreDaffaire ;
	
	//constructeur sans paramètres :
	public Associe()
	{
		super();
	}
	
	//constructeur avec paramètres :
	public Associe(String nom , String prenom ,Date dateNaissance , float pourcentage , double chiffreDaffaire )
	{
		super(nom , prenom , dateNaissance) ;
		this.pourcentage = pourcentage ;
		this.chiffreDaffaire = chiffreDaffaire ;
	}
	
	//méthode toString() :
	@Override
	public String toString()
	{
		return super.toString()+" Pourcentage : "+pourcentage+"%"+" chiffre d'affaire : "+chiffreDaffaire ;
	}
	
	//méthode getSalaire();
	@Override
	public double getSalaire()
	{
		double salaire = ((this.chiffreDaffaire*(double)(this.pourcentage)/100)/12) ;  
		return salaire ;
	}
	
}
