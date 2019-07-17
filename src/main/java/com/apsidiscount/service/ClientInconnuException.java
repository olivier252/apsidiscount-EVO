package com.apsidiscount.service;

public class ClientInconnuException extends ApsiDiscountException {

	public ClientInconnuException(long idClient) {
		super("Le client avec l'ID " + idClient + " n'existe pas !");
	}

}
