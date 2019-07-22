package com.apsidiscount.service;

import java.util.List;

import com.apsidiscount.entity.Article;
import com.apsidiscount.entity.Categorie;
import com.apsidiscount.entity.Constructeur;

public interface ArticleService {
	Article getById(long id) throws ArticleInconnuException;
	List<Article> getAllArticle();
	Article modifier(Article article) throws ArticleInconnuException;
	List<Article> getArticlesByCategory(Long id);
	List<Article> getArticlesByConstructeur(Long id);

}
