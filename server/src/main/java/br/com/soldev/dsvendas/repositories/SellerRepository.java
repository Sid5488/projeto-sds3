package br.com.soldev.dsvendas.repositories;

import br.com.soldev.dsvendas.entities.Seller;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SellerRepository extends JpaRepository<Seller, Long> { }
