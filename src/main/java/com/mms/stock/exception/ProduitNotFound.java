package com.mms.stock.exception;

public class ProduitNotFound extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1321541L;

	public ProduitNotFound(String code) {
		
		super("Pas de produit avec ce code : "+code);
	}
}
