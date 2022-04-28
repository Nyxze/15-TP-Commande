package com.formation.commande.modele.bo;

public class Stylo extends Article {

	private String couleur;

	public Stylo(String marque, String ref, String designation, float pu, String couleur) {
		setMarque(marque);
		setReference(ref);
		setDesignation(designation);
		setPrixUnitaire(pu);
		setCouleur(couleur);
	}

	public Stylo(String marque, String ref, String designation, float pu,int qte, String couleur ) {
		setMarque(marque);
		setReference(ref);
		setDesignation(designation);
		setPrixUnitaire(pu);
		setCouleur(couleur);
		setQteStock(qte);
	}

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	@Override
	public String toString() {
		return super.toString()+"Stylo [couleur=" + couleur + "]";
	}

	

}
