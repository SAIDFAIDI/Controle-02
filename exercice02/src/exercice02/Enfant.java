package exercice02;

public class Enfant {
	//attributs :
			private int age ;
			
			//constructeur avec param�tre Age doit �tre compris entre 1 et 10 :
			public Enfant(int age) throws AgeEnfantException
			{
			 try{
				if(age < 1 || age > 10)
				{
					throw new AgeEnfantException("["+age+"] ans n'est pas un �ge valide !");
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
