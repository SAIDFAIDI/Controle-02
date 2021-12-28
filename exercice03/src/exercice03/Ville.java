package exercice03;

public class Ville {
	//attribus :
		private String nom ;
		private int population ;
		private String pays ;
		
		//constructeur sans paramètres :
		public Ville() 
		{
			
		}
		//constructeur avec paramètres :
		public Ville(String nom, int population, String pays) throws PopulationException
		{
			this.nom = nom ;
			try{
				if(population < 0)
					throw new PopulationException("La population de la ville ["+getNom()+"] doit être un nombre positif !!");
				else
					this.population = population ;
			}catch(PopulationException e)
			{
				System.out.println(e);
			}
			this.pays = pays;
		}
		
		// getter setter :
		public String getNom() 
		{
			return nom;
		}
		public void setNom(String nom) {
			this.nom = nom;
		}
		
		public int getPopulation() 
		{
			return population;
		}
		
		public void setNom(int population) {
			this.population = population;
		}
		public String getPays() {
			return pays;
		}
		public void setPays(String pays) {
			this.pays = pays;
		}
		
}
