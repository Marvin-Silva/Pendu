import java.util.Arrays;

import java.util.List;
import java.util.Random;
import java.util.Scanner;
public class TirageAleatoire {
	String MotPris;
	String []AfficherMots;
	jeu jeu;
	String playerEssai;
	
	public void MotCles(){
		List<String>TabdeMots =  Arrays.asList("pomme", "telephone", "verre");
		int IndexAleatoire;
		int j = 1;
		Random rand = new Random();

		
		for ( int i=0; i < j;i++) {
			IndexAleatoire = rand.nextInt(TabdeMots.size());		
			 this.MotPris = TabdeMots.get(IndexAleatoire); 
			 System.out.println(MotPris);
	}
		
}		

	public void Mot() {
		jeu display = new jeu();
		AfficherMots = this.MotPris.split("");
		String []ListeUti = new String [AfficherMots.length];
		
		System.out.println(Arrays.toString(AfficherMots));
		System.out.println("Le mot à deviner a " +""+ AfficherMots.length +" Lettres ");
		int j = 0;
		do {
		Scanner essais = new Scanner(System.in);
		this.playerEssai = essais.nextLine();
		

		for (int i = 0; i < AfficherMots.length; i++) {
		
		if (playerEssai.equals(AfficherMots[i])) {
			ListeUti[i] = AfficherMots[i];
			System.out.println(Arrays.toString(ListeUti));
			
		}
		else {
			
			this.jeu = new jeu();
			//this.playerEssai;
			/*display.Screen1();	*/
		}
	
		}
			
		//System.out.println(Arrays.toString(ListeUti));
		
}while (j < AfficherMots.length);}
	public static void jeu() {
		jeu display = new jeu();
		display.Screen1();
		display.Screen2();
		display.Screen3();
		display.Screen4();
		display.Screen5();
		display.Screen6();
		}
	
}
