package com.apsidiscount.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.apsidiscount.entity.Constructeur;

@Repository
public class ConstructorDAOImpl implements ConstructorDAO {
	
	@PersistenceContext
	private EntityManager em;
	
	public ConstructorDAOImpl() {
	}
	
	public ConstructorDAOImpl(EntityManager em) {
		this.em = em;
	}
	
	@Override
	public List <Constructeur> getAllConstruct(){
		return this.em.createQuery("select c from Constructeur c ", Constructeur.class)
				.getResultList();
				
	}
}
