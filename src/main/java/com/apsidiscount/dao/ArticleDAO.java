package com.apsidiscount.dao;

import java.util.List;

import com.apsidiscount.entity.Article;
import com.apsidiscount.entity.Categorie;
import com.apsidiscount.entity.Constructeur;

public interface ArticleDAO {

	Article getById(long id);
	List<Article> getByCategorie(String nomCategorie);
	List<Article> getByCategorie(Categorie categorie);
	List<Article> getAllArt();
	List<Article> getByConstructeur(Constructeur constructeur);



}
