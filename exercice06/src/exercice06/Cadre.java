package exercice06;
import java.util.Date ;
public class Cadre extends Employer{
	//le cadre caractèrise par un indic ;
	protected int indice ;
	
	//constructeur sans paramètre :
	public Cadre()
	{
		super() ; 
	}
	
	//constructeur avec paramètre :
	public Cadre(String nom , String prenom , Date dateNaissance ,int indice)
	{
		super(nom,prenom,dateNaissance);
		this.indice = indice ;
	}
	
	//redéfinition de la méthode getSalaire() :
	@Override
	public double getSalaire()
	{
		double salaire = 0.0;
		switch(indice)
		{
		case 1 :  salaire = 12000.0 ;
				  break ;
		case 2 : salaire = 14000.0 ;
				 break ;
		case 3 : salaire = 16000.0 ; 
				 break ;
		case 4 : salaire = 18000.0 ;
				 break ;
		default :
				 System.out.println("l'indice n'exist pas !");
				 break ;
		}
		
		return salaire ;
	}
	@Override
	//redéfinition la méthode toString() :
	public String toString()
	{
		return super.toString()+" indice : "+indice+" salaire : "+getSalaire();
	}
}
