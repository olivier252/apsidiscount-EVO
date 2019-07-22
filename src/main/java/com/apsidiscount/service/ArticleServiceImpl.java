package com.apsidiscount.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apsidiscount.dao.ArticleDAO;
import com.apsidiscount.entity.Article;
import com.apsidiscount.entity.Categorie;
import com.apsidiscount.entity.Constructeur;

@Service
public class ArticleServiceImpl implements ArticleService{

	private ArticleDAO articleDAO;

	public ArticleServiceImpl(@Autowired ArticleDAO articleDAO) {
		this.articleDAO=articleDAO;
	}
	
	@Override
	public Article getById(long id) throws ArticleInconnuException {
		Article article = articleDAO.getById(id);
		if(article==null) {
			throw new ArticleInconnuException(id);
		}
		return article;
	}
	
	@Override
	@Transactional
	public Article modifier(Article article) throws ArticleInconnuException {
		Article articleVar = getById(article.getId());
		//pourquoi tout modifier ?
		articleVar.setImage(article.getImage());
		articleVar.setDesignation(article.getDesignation());
		articleVar.setPrix(article.getPrix());
		articleVar.setDescription(article.getDescription());
		articleVar.setCategorie(article.getCategorie());
		articleVar.setConstructeur(article.getConstructeur());
		articleVar.setMiseEnLigne(article.getMiseEnLigne());
		articleVar.setStock(article.getStock());
	
		return articleVar;
	}
	
	@Override
	public List<Article> getAllArticle() {
		List<Article> article = articleDAO.getAllArt();
		
		return article;
	}
	
	
	@Override
	public List<Article> getArticlesByCategory(Long id) {
		List<Article> articleCategory = articleDAO.getByCategorieById(id);
		
		return articleCategory;
	}
	
	@Override 
	public List <Article> getArticlesByConstructeur(Long id) {
		List <Article> articleConstruct = articleDAO.getByConstructeurById(id);
		
		return articleConstruct;
	}
}

