package com.apsidiscount.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apsidiscount.dao.ConstructorDAO;
import com.apsidiscount.entity.Constructeur;

@Service
public class ConstructorServiceImpl implements ConstructorService {
	
	private ConstructorDAO constructorDAO;
	
	public ConstructorServiceImpl(@Autowired ConstructorDAO consDAO) {
		this.constructorDAO=consDAO;
	}
	
	@Override
	public List <Constructeur> getAllConstructors() {
		List <Constructeur> constructorList = constructorDAO.getAllConstruct();
		return constructorList;
	}
}
