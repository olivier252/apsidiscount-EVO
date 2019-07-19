package com.apsidiscount.service;

import java.util.List;

import com.apsidiscount.entity.Article;

public interface ArticleService {
	Article getById(long id) throws ArticleInconnuException;

	Article modifier(long id, String designation, String description) throws ArticleInconnuException;

	List<Article> getAllArticle();

	Article modifier(Article article) throws ArticleInconnuException;

	Article modifier(Article article, long id) throws ArticleInconnuException;



}
