package com.apsidiscount.dao;

import java.util.List;

import com.apsidiscount.entity.Article;
import com.apsidiscount.entity.Categorie;
import com.apsidiscount.entity.Constructeur;

public interface ArticleDAO {

	Article getById(long id);
	List<Article> getByCategorie(String nomCat);
	List<Article> getByCategorieById(Long id);
	List<Article> getAllArt();
	List<Article> getByConstructeurById(Long id);



}
