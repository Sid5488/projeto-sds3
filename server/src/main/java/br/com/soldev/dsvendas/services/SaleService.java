package br.com.soldev.dsvendas.services;

import br.com.soldev.dsvendas.DTOs.SaleDTO;
import br.com.soldev.dsvendas.entities.Sale;
import br.com.soldev.dsvendas.repositories.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


@Service
public class SaleService {
    private final SaleRepository saleRepository;

    @Autowired
    public SaleService(SaleRepository saleRepository) {
        this.saleRepository = saleRepository;
    }

    public Page<SaleDTO> getAll(Pageable pageable) {
        Page<Sale> sales = this.saleRepository.findAll(pageable);

        return sales.map(sale -> new SaleDTO(sale));
    }
}
