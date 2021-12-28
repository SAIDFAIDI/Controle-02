package exercice06;
import java.util.Date ;
public class Associe extends Employer{

	//attributs :
	private float pourcentage ;
	private double chiffreDaffaire ;
	
	//constructeur sans param�tres :
	public Associe()
	{
		super();
	}
	
	//constructeur avec param�tres :
	public Associe(String nom , String prenom ,Date dateNaissance , float pourcentage , double chiffreDaffaire )
	{
		super(nom , prenom , dateNaissance) ;
		this.pourcentage = pourcentage ;
		this.chiffreDaffaire = chiffreDaffaire ;
	}
	
	//m�thode toString() :
	@Override
	public String toString()
	{
		return super.toString()+" Pourcentage : "+pourcentage+"%"+" chiffre d'affaire : "+chiffreDaffaire ;
	}
	
	//m�thode getSalaire();
	@Override
	public double getSalaire()
	{
		double salaire = ((this.chiffreDaffaire*(double)(this.pourcentage)/100)/12) ;  
		return salaire ;
	}
	
}
