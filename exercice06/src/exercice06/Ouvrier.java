package exercice06;
import java.util.Date ;
public class Ouvrier extends Employer {
	//ouvrier se caract�rise par sa date d'entr�e � la soci�t� :
	private Date dateEntreeSociete ;
	private static double smig = 3000 ;
	private double salaire ;
	
	//constructeur sans param�tres :
	public Ouvrier()
	{
		super();
	}

	//constructeur avec param�tres :
	public Ouvrier(String nom , String prenom , Date dateNaissance , Date dateEntreeSociete)
	{
		super(nom,prenom,dateNaissance);
		this.dateEntreeSociete = dateEntreeSociete ;
	}
	//m�thode getSalaire() abstraire :
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
		return super.toString()+" date d'entr�e � soci�t�e : "+
		dateEntreeSociete.getYear()+" salaire : "+getSalaire() ;
	}
	
}
