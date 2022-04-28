package com.formation.commande.modele.bo;

import java.util.Arrays;

public class Catalogue {

	private Article articlesAuCatalogue[];

	public Catalogue(Article[] articles) {

		this.articlesAuCatalogue = articles;
	}

	public Article[] getArticlesAuCatalogue() {

		return this.articlesAuCatalogue;
	}

	@Override
	public String toString() {
		System.out.println("Catalogue [articlesAuCatalogue=");
		for (int i = 0; i < articlesAuCatalogue.length; i++) {
			if (articlesAuCatalogue[i] != null) {
				System.out.println(articlesAuCatalogue[i].toString());
			}

		}
		return "";
	}

}
