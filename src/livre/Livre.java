package livre;

/**
 * Classe Livre contenant:
 * les attributs pour chaque livre,
 * les accesseurs (getters & setters) de chaque attribut,
 * un constructeur permettant d'initialiser les attributs 
 * d'un objet livre par des valeurs saisies par l’utilisateur,
 *!!! l'attribut id est auto-incrémenté lors de la création d'un livre 
 *et n'est pas saisi par l'utilisateur !!!
 *une méthode toString pour afficher les informations du livre en cours,
 *un compteur pour afficher le nombre de livre avant execution de la boucle.
 * @author CLR
 *
 */
public class Livre {

	//attributs pour chaque livre
	static long id= 0;;
	String titre;
	String auteur;
	double prix;

	//génération du constructeur
	public Livre(String titre, String auteur, double prix) {
		this.titre = titre;
		this.auteur = auteur;
		this.prix = prix;
		id++;
	}
	
	//génération des getters et setters
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getAuteur() {
		return auteur;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	//création du toString()
	public String livreToString() {
		return "\n Titre du livre : " + titre + "\n Auteur du livre : " + auteur + "\n Prix du livre : " + prix;
	}
	
	//compteur pour afficher le nombre de livre avant execution de la boucle
	public static void afficheCompteur() {
		System.out.println("Combien de livres à gérer ? "+id);
	}

}
