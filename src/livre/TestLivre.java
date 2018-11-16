package livre;

/**Crée 2 instances de la classe Livre,
 * rentre les instances dans un tableau,
 * affiche le contenu du tableau et les caractéristiques de chaque livre.
 * @author CLR
 *
 */
public class TestLivre {

	public static void main(String[] args) {

		Livre liv1 = new Livre("Java Objet", "Oracle", 24.0);
		Livre liv2 = new Livre("JEE", "Oracle", 48.0);

		Livre[] livres = { liv1, liv2 };

		int nbLivre=0;
		
		Livre.afficheCompteur(); //affiche le nombre de livres
		
		for (int i = 0; i < livres.length; i++) { //boucle de parcours du tableau
			System.out.println(livres[i].livreToString()); //affichage des attributs de chaque livre
			System.out.println("Le prix du livre "+livres[i].titre+" de l'auteur "+livres[i].auteur+" est : "+livres[i].prix+" euros");
			System.out.println("Référence du livre est "+(i+1));
			nbLivre++;
		}
		System.out.println();
		System.out.println("Le nombre de livres est : "+nbLivre); //comptage des livres

	}
	
	

}
