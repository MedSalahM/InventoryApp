package com.mms.stock.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mms.stock.domain.Produit;

public interface ProduitR extends JpaRepository<Produit,Integer> {

	 Optional<Produit> findByCode(String code);
}
