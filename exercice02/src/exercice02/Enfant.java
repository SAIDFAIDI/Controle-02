package exercice02;

public class Enfant {
	//attributs :
			private int age ;
			
			//constructeur avec paramètre Age doit être compris entre 1 et 10 :
			public Enfant(int age) throws AgeEnfantException
			{
			 try{
				if(age < 1 || age > 10)
				{
					throw new AgeEnfantException("["+age+"] ans n'est pas un âge valide !");
				}
				else
					this.age = age ;
			}catch(AgeEnfantException e)
			 	{
					System.out.println(e);
				}
			}
			// getter 
			public int getAge() 
			{
				return age;
			}
}
