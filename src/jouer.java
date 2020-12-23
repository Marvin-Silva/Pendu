import java.util.Scanner;

//Les attributs
public class jouer{
	
	
	
	String nom;
	int Point = 0;
	Boolean gagner;
	
	//constructor
	public void jouerNow() {
		System.out.print("Votre Nom: ");
		Scanner uti = new Scanner(System.in);
		String entreeNom = uti.nextLine();

		System.out.println("Bonjour "+entreeNom+",");
		System.out.println("==================================== ");
		System.out.println("Vous êtes dans le JEU DU PENDU");
		System.out.println("=====================================");

		System.out.println("Devinez la lettre, afin de trouver le mot Clés");

	}
	
	
}
