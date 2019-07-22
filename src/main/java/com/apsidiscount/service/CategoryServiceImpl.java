package com.apsidiscount.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.apsidiscount.dao.CategorieDAO;
import com.apsidiscount.entity.Categorie;

public class CategoryServiceImpl implements CategoryService {
	
	private CategorieDAO categorieDAO;

	public CategoryServiceImpl(@Autowired CategorieDAO categorieDAO) {
		this.categorieDAO=categorieDAO;
	}
	
	//Ajout 21/7
	@Override
	public List <Categorie> getAllCat(){
			List <Categorie> categorieList = categorieDAO.getAllCategories();
			return categorieList;
	}
}
