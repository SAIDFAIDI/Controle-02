package exercice07;

public class ArticleElectromenage extends Article implements Susceptible{

	//attributs suplémentaires :
	private int voltage ;
	private String marque ;
	
	//getter setter 
	
	//constructeurs :
	public ArticleElectromenage()
	{
		super();
	}
	
	public ArticleElectromenage(double prixAchat,double prixVente,String nom,String fournisseur,int voltage,String marque) 
	{
		super(prixAchat,prixVente,nom,fournisseur);
		setVoltage(voltage);
		setMarque(marque);
	}
	
	//setter getter :
	public int getVoltage() {
		return voltage;
	}
	public void setVoltage(int voltage) {
		this.voltage = voltage;
	}
	public String getMarque() {
		return marque;
	}
	public void setMarque(String marque) {
		this.marque = marque;
	}
	
	//méthode affichage :
	@Override 
	public void affichage()
	{
		super.affichage();
		System.out.println("le voltage : "+getVoltage()+"\nla marque : "+getMarque());
	}

	@Override
	public void lancerSolde(double pourcentage) 
	{
		super.setPrixVente((super.getPrixVente()-(double)(super.getPrixVente()*pourcentage/100)));
	}

	@Override
	public void terminerSolde(double pourcentage) 
	{
		super.setPrixVente((super.getPrixVente()+(double)(super.getPrixVente()*pourcentage/100)));
	}
}
