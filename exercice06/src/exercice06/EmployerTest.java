package exercice06;
import java.util.Date ;
public class EmployerTest {

	public static void main(String[] args) {
		
	//creation des objet :
	Ouvrier ouvrier = new Ouvrier("KHALIL","Adam",new Date(1975,3,1),new Date(1995,4,4));
	Cadre cadre = new Cadre("ARRAJI","Yahya",new Date(1992,5,6),4);
	Associe associe = new Associe("ASSAFI","Walid",new Date(1990,3,3),10,1200000);
	
	//faire appel sur la méthode toString() :
	System.out.println(ouvrier.toString());
	System.out.println(cadre.toString());
	System.out.println(associe.toString());
	
	//faire appel sur la méthode getSalaire() :
	System.out.println(ouvrier.getSalaire());
	System.out.println(cadre.getSalaire());
	System.out.println(associe.getSalaire());
	}
}
