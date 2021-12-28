package exercice01;

public class PileTest {

	public static void main(String[] args) {
		Pile p = new Pile();
		
		try {
			for(int i=0;i<args.length;i++) 
				{
					p.empile(args[i]);
				}
			}
		catch(PilePleine e1) {
			}
		
		try {
			for(;;) 
				System.out.print(p.depile()+" ");
			}
		catch(PileVide e2) 
		{ 
			System.out.println(); 
		}
	}

}
