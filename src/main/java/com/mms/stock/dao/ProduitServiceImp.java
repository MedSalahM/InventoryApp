package com.mms.stock.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mms.stock.domain.Produit;
import com.mms.stock.exception.ProduitNotFound;
import com.mms.stock.repo.ProduitR;
import com.mms.stock.service.IProduitService;

@Service
public class ProduitServiceImp implements IProduitService {
	
	@Autowired
	ProduitR produitRepository;
	
	@Override
	public List<Produit> liste() {
		// TODO Auto-generated method stub
		return produitRepository.findAll();
	}

	@Override
	public Produit saveProduit(Produit produit) {
		// TODO Auto-generated method stub
		return produitRepository.save(produit);
	}

	@Override
	public Produit find(String code) {

       Produit produit = produitRepository.findByCode(code)
    		                              .orElseThrow(()-> new ProduitNotFound(code));
       
       
		
		return produit;
	}

}
