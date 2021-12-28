package exercice02;

public class Test {

	public static void main(String[] args) {
		//Age doit être compris entre 1 et 10 :
		Enfant enfant1 = null;
		try
		{
			enfant1 = new Enfant(18);
		}catch(AgeEnfantException e) {
			System.out.println(e);
		}
	
		Enfant enfant2 = null;
		//Age doit être compris entre 1 et 10 :
		try
		{
			enfant2 = new Enfant(7);
		}catch(AgeEnfantException e) {
			System.out.println(e);
		}
		
		//affichage des ages des deux enfants :
		System.out.println("l'age d'enfant1 : "+enfant1.getAge());
		System.out.println("l'age d'enfant2 : "+enfant2.getAge());

	}

}
