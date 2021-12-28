package excercice04;

public class TestAdresseIP {

	public static void main(String[] args) {
		//création des adresses :
				AdresseIP adresse1=null;
				try {
					adresse1 = new AdresseIP(257,8,8,8);
				} catch (AdresseIPException e) {
					e.printStackTrace();
				}
				
				AdresseIP adresse2=null;
				try {
					adresse2 = new AdresseIP(255,255,255,255);
				} catch (AdresseIPException e) {
					e.printStackTrace();
				}
				
				//affichage des adresses :
				System.out.println("adresse 1 : "+adresse1.toString());
				System.out.println("adresse 2 : "+adresse2.toString());
	}

}
