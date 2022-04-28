package com.formation.commande.modele.bo;

import java.util.Arrays;
import java.util.Iterator;

public class Panier {

	private float montant;
	private int indexLigne;
	private LignePanier[] lignesPanier;

	public Panier() {
	}

	public float getMontant() {
		float temp = 0.0f;
		for (LignePanier lignePanier : lignesPanier) {
			temp += lignePanier.getPrix();
		}
		montant = temp;
		return montant;
	}

	public Ligne getLigne(int index) {

		return lignesPanier[index];
	}

	public LignePanier[] getLignesPanier() {
		return lignesPanier;
	}

	public void addLigne(Article article, int qte) {

		if (article.getQteStock() > qte) {
			article.sortirStock(qte);
			LignePanier[] tempArray = new LignePanier[indexLigne + 1];
			if (lignesPanier == null) {
				tempArray[0] = new LignePanier(article, qte);
			} else {
				for (int i = 0; i < lignesPanier.length; i++) {
					tempArray[i] = lignesPanier[i];
					tempArray[indexLigne] = new LignePanier(article, qte);

				}

			}
			indexLigne += 1;
			lignesPanier = tempArray;
		}

	}

	public void updateLigne(int index, int newQte) {

		lignesPanier[index].setQte(newQte);

	}

	@Override
	public String toString() {
		System.out.println("Panier:");
		System.out.println();
		for (int i = 0; i < lignesPanier.length; i++) {
			if (lignesPanier[i] != null) {
				System.out.println("ligne " + i + " 	Ligne:[" + lignesPanier[i].toString());
			}

		}
		System.out.println("Valeur" + getMontant());
		return "";
	}

}
