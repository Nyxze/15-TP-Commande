package com.formation.commande.modele.bo;

public class Ramette extends Article {

	private int grammage;

	public Ramette(String marque, String ref, String designation, float pu, int grammage) {
		setMarque(marque);
		setReference(ref);
		setDesignation(designation);
		setPrixUnitaire(pu);
		setGrammage(grammage);
	}

	public Ramette(String marque, String ref, String designation, float pu, int qte, int grammage) {
		setMarque(marque);
		setReference(ref);
		setDesignation(designation);
		setPrixUnitaire(pu);
		setGrammage(grammage);
		setQteStock(qte);
	}

	public int getGrammage() {
		return grammage;
	}

	public void setGrammage(int grammage) {
		this.grammage = grammage;
	}

	@Override
	public String toString() {
		return super.toString() + "Ramette [grammage=" + grammage + "]";
	}

}