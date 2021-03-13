package com.mms.stock.service;

import java.util.List;

import com.mms.stock.domain.Produit;

public interface IProduitService {
	
	List<Produit> liste();
	Produit saveProduit(Produit produit);
	Produit find(String code);
} 
