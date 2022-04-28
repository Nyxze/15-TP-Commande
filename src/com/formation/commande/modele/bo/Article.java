package com.formation.commande.modele.bo;

abstract public class Article {
	
	private String reference;
	private String marque;
	private String designation;
	private float prixUnitaire;
	private int qteStock;
	public String getReference() {
		return reference;
	}
	public String getMarque() {
		return marque;
	}
	public String getDesignation() {
		return designation;
	}
	public float getPrixUnitaire() {
		return prixUnitaire;
	}
	public int getQteStock() {
		return qteStock;
	}
	protected void setReference(String reference) {
		this.reference = reference;
	}
	protected void setMarque(String marque) {
		this.marque = marque;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public void setPrixUnitaire(float prixUnitaire) {
		this.prixUnitaire = prixUnitaire;
	}
	public void setQteStock(int qteStock) {
		this.qteStock = qteStock;
	}
	
	protected void enterStock( int qte) {
		
		this.qteStock += qte;
		
	}
	protected void sortirStock( int qte) {
		this.qteStock -= qte;
	}
	@Override
	public String toString() {
		return "Article ["+ ", marque=" + marque + " reference = " + reference + ", designation=" + designation
				+ ", prixUnitaire=" + prixUnitaire + ", qteStock=" + qteStock + "]";
	}
	
	
	
	
	
	
	

}
