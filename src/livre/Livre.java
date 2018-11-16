package livre;

/**
 * 
 * @author CLR
 *
 */
public class Livre {

	long id;
	String titre;
	String auteur;
	double prix;

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

	public Livre(String titre, String auteur, double prix) {
		this.titre = titre;
		this.auteur = auteur;
		this.prix = prix;
	}

	public String livreToString() {
		return "\n Titre du livre : " + titre + "\n Auteur du livre : " + auteur + "\n Prix du livre : " + prix;
	}

}
