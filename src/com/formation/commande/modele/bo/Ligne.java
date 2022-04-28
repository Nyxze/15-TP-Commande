package com.formation.commande.modele.bo;

abstract public class  Ligne {
	protected Article article;
	protected int qte;
	protected float prix;
	
	public Ligne(Article article, int qte) {
		this.article = article;
		this.qte = qte;
		this.prix = qte * article.getPrixUnitaire();
	}
	
	public Article getArticle() {
		return article;
	}


	protected void setArticle(Article article) {
		this.article = article;
	}


	public int getQte() {
		return qte;
	}


	protected void setQte(int qte) {
		this.prix = qte * article.getPrixUnitaire();
		this.qte = qte;
	}


	public float getPrix() {
		return prix;
	}

	@Override
	public String toString() {
		return "qte=" + qte + ", prix=" + prix + "article =" + article.toString();
	}


}
