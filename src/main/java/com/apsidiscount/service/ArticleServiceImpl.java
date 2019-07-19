package com.apsidiscount.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apsidiscount.dao.ArticleDAO;
import com.apsidiscount.entity.Article;

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
	public Article modifier(Article article, long id) throws ArticleInconnuException {
		Article articleVar = getById(id);
		articleVar = article;
		return articleVar;
	}
	
	@Override
	public List<Article> getAllArticle() {
		List<Article> article = articleDAO.getAllArt();
		
		return article;
	}
}

