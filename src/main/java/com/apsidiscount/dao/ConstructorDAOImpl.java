package com.apsidiscount.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.apsidiscount.entity.Constructeur;

public class ConstructorDAOImpl implements ConstructorDAO {
	
	@PersistenceContext
	private EntityManager em;
	
	public ConstructorDAOImpl() {
	}
	
	@Override
	public List <Constructeur> getAllConstruct(){
		return this.em.createQuery("select c from Constructeur c ", Constructeur.class)
				.getResultList();
				
	}
}
