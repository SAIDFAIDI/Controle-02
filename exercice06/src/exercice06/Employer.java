package exercice06;

import java.util.Date ;
public abstract class Employer {
	// attributs de classe :
	protected String nom ;
	protected String prenom ;
	protected Date dateNaissance;
	
	//constructeur par défeaut ;
	public Employer()
	{	}
	
	//constructeur par paramètre :
	public Employer(String nom , String prenom ,Date dateNaissance)
	{
		this.nom = nom ;
		this.prenom = prenom ;
		this.dateNaissance =dateNaissance ;
	}
	
	//méthode toString() pour afficher les information de l'objet ;
	@Override
	public String toString()
	{
		return "nom : "+nom+" prenom : "+prenom+" dateNaissance : "+
	dateNaissance.getDate()+"/"+dateNaissance.getMonth()+"/"+dateNaissance.getYear();
	}
	
	//la méthode abstract getSalaire() :
	public abstract double getSalaire();
	
}
