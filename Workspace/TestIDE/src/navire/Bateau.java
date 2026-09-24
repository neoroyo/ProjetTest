package navire;

import java.util.Arrays;

public class Bateau {
	public Bateau(String nom, int taille) {
		this.nom = nom;
		this.taille = taille;

	}

	public String getNom() {
		return nom;
	}

	public String toString() {
		return "Bateau [nom=" + nom + ", taille=" + taille + ", elements=" + Arrays.toString(elements) + "]";
	}
public void attaquer(int numElement) {
	elements[numElement - 1].toucher();
}
	public static void main(String[] args) {
		
	}

	private String nom;
	private int taille;
	private Element[] elements;
	// TODO Jsp ce qui me reste a faire
}
