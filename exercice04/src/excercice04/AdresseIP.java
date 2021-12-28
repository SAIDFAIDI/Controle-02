package excercice04;
public class AdresseIP {
	//attributs :
			private int[] octets;
			private String classe;
			
			//constructeur :
			public AdresseIP(int o1,int o2, int o3, int o4) throws AdresseIPException{
			try{
				if(o1<0 || o1>255 || o2<0 || o2>255 || o3<0 || o3>255 || o4<0 || o4>255)
					throw new AdresseIPException("les nombres de l'adresse doit être comprie entre 0 et 255 !!");
				else
					octets = new int[] {o1,o2,o3,o4};
				}
			catch(AdresseIPException e)
				{
					System.out.println(e);
				}
			}
			
			//getter :
			public String getClasse() {
				return classe;
			}
			//setter :
			public void setClasse(String classe) {
				this.classe = classe;
			}

			@Override
			public String toString() 
			{
				if(octets != null)
					return octets[0] + "." + octets[1] + "." + octets[2] + "."+ octets[3] ;
				else
					return null;
			}
}
