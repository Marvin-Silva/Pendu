import java.util.Scanner;

public class App {

	public static void main(String []args) {

		jouer jouer1 = new jouer();
		jouer1.jouerNow();		
		
		TirageAleatoire sort = new TirageAleatoire();
		sort.MotCles();
	
		jeu Ecran = new jeu();
		Ecran.Screen();
		sort.Mot();
		
		
		
	}	
}
