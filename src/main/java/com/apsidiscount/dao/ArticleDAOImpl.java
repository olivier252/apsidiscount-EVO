package com.apsidiscount.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.apsidiscount.entity.Article;
import com.apsidiscount.entity.Categorie;
import com.apsidiscount.entity.Constructeur;

@Repository
public class ArticleDAOImpl implements ArticleDAO {

	@PersistenceContext
	private EntityManager em;
	
	public ArticleDAOImpl() {
	}

	public ArticleDAOImpl(EntityManager em) {
		this.em = em;
	}

	@Override
	public Article getById(long id) {
		return this.em.find(Article.class, id);
	}

	@Override
	public List<Article> getByCategorie(String nomCategorie) {
		return this.em.createQuery("select a from Article a where a.categorie.nom = :nomCategorie", Article.class)
				      .setParameter("nomCategorie", nomCategorie)
				      .getResultList();
	}

	@Override
	public List<Article> getByCategorie(Categorie categorie) {
		return this.em.createQuery("select a from Article a where a.categorie = :categorie", Article.class)
				      .setParameter("categorie", categorie)
			          .getResultList();
	}
	
	@Override
	public List<Article> getAllArt() {
		return this.em.createQuery("select new Article(a.id, a.designation, a.prix, a.miseEnLigne, a.stock) from Article a", Article.class)
			          .getResultList();
	}
	
	//Ajout 21/7
	
	@Override
	public List<Article> getByConstructeur(Constructeur constructeur) {
		return this.em.createQuery("select a from Article a where a.constructeur = :constructeur", Article.class)
				.setParameter("constructeur", constructeur)
				.getResultList();
	}
}
