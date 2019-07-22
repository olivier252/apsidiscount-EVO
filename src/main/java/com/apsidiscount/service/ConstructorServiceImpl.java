package com.apsidiscount.service;

import java.util.List;

import com.apsidiscount.dao.ConstructorDAO;
import com.apsidiscount.entity.Constructeur;

public class ConstructorServiceImpl implements ConstructorService {
	
	private ConstructorDAO constructorDAO;
	
	@Override
	public List <Constructeur> getAllConstructors() {
		List <Constructeur> constructorList = constructorDAO.getAllConstruct();
		return constructorList;
	}
}
