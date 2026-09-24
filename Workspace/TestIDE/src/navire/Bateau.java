package navire;

import java.util.Arrays;

public class Bateau {
	public Bateau(String nom, int taille) {
		this.nom = nom;
		this.taille = taille;
		this.element = new Element[taille];
	}

	public String getNom() {
		return nom;
	}

	public String toString() {
		return "Bateau [nom=" + nom + ", taille=" + taille + ", elements=" + Arrays.toString(elements) + "]";
	}

	private String nom;
	private int taille;
	private Element[] elements;
	// TODO Jsp ce qui me reste a faire
}
