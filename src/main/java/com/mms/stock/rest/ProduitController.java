package com.mms.stock.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mms.stock.domain.Produit;
import com.mms.stock.service.IProduitService;


@RestController

public class ProduitController {

	@Autowired
	private IProduitService produitService;
	
	@GetMapping("/produits")
	public ResponseEntity<?> all() {
		
		return ResponseEntity.ok(produitService.liste());
	}

	@PostMapping("/add")
	public ResponseEntity<?> add(@RequestBody Produit p) {
		
		return ResponseEntity.ok("Produit avec numero "+produitService.saveProduit(p).getId()+" est ajoutee");
	}
	@GetMapping("/produit/{code}")
	public ResponseEntity<?> get(@PathVariable String code) {
		
		return ResponseEntity.ok(produitService.find(code));
	}
}
