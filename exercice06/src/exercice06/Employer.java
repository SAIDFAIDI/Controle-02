package exercice06;

import java.util.Date ;
public abstract class Employer {
	// attributs de classe :
	protected String nom ;
	protected String prenom ;
	protected Date dateNaissance;
	
	//constructeur par d�feaut ;
	public Employer()
	{	}
	
	//constructeur par param�tre :
	public Employer(String nom , String prenom ,Date dateNaissance)
	{
		this.nom = nom ;
		this.prenom = prenom ;
		this.dateNaissance =dateNaissance ;
	}
	
	//m�thode toString() pour afficher les information de l'objet ;
	@Override
	public String toString()
	{
		return "nom : "+nom+" prenom : "+prenom+" dateNaissance : "+
	dateNaissance.getDate()+"/"+dateNaissance.getMonth()+"/"+dateNaissance.getYear();
	}
	
	//la m�thode abstract getSalaire() :
	public abstract double getSalaire();
	
}
