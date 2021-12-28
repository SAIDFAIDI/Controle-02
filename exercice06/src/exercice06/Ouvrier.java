package exercice06;
import java.util.Date ;
public class Ouvrier extends Employer {
	//ouvrier se caractérise par sa date d'entrée à la société :
	private Date dateEntreeSociete ;
	private static double smig = 3000 ;
	private double salaire ;
	
	//constructeur sans paramètres :
	public Ouvrier()
	{
		super();
	}

	//constructeur avec paramètres :
	public Ouvrier(String nom , String prenom , Date dateNaissance , Date dateEntreeSociete)
	{
		super(nom,prenom,dateNaissance);
		this.dateEntreeSociete = dateEntreeSociete ;
	}
	//méthode getSalaire() abstraire :
	public double getSalaire()
	{
		Date dateAujourdui = new Date() ;
		double salaire = (double)smig+(double)(dateAujourdui.getYear()+1900-dateEntreeSociete.getYear())*100;
		if(salaire >= smig*2)
			return (double)smig*2;
		else
			return salaire ;
	}

	@Override
	public String toString()
	{
		return super.toString()+" date d'entrée à sociétée : "+
		dateEntreeSociete.getYear()+" salaire : "+getSalaire() ;
	}
	
}
