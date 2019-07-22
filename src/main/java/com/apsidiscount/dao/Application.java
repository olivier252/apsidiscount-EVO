package com.apsidiscount.dao;

import java.util.List;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.apsidiscount.entity.Article;
import com.apsidiscount.service.ApsiDiscountException;
import com.apsidiscount.service.ClientService;

public class Application {

	public static void main(String[] args) {
		try (GenericXmlApplicationContext appCtx = new GenericXmlApplicationContext("classpath:application-context.xml")) {

			ClientService clientService = appCtx.getBean(ClientService.class);
			
			clientService.ajouterArticlesDansPanier(3, 3,2,1);
		} catch (ApsiDiscountException e) {
			e.printStackTrace();
		}
		
		ArticleDAO cdao = new ArticleDAOImpl();
		
		List<Article> lcad = cdao.getAllArt();
		
		System.out.println(lcad.toString());
	}
	
}
