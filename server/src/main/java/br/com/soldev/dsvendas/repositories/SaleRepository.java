package br.com.soldev.dsvendas.repositories;

import br.com.soldev.dsvendas.entities.Sale;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SaleRepository extends JpaRepository<Sale, Long> { }
