package exercice03;

public class VilleTest {

	public static void main(String[] args) {
		//creation d'objet ville 1 et ville2 :
		Ville ville1 = null ;
		try{
			 ville1 = new Ville("Rabat",645500,"MAROC");
		}catch(PopulationException e){
			System.out.println(e.getMessage());
		}
		
		Ville ville2 = null;
		try{
			ville2 = new Ville("Casablance",-3594352,"MAROC");
		}catch(PopulationException e){
			System.out.println(e.getMessage());
		}
		
		//affichage de la population des deux ville :
		System.out.println("la population de la ville "+ville1.getNom()+" est : "+ville1.getPopulation());
		System.out.println("la population de la ville "+ville2.getNom()+" est : "+ville2.getPopulation());
		}

}
