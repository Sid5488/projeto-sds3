package br.com.soldev.dsvendas.services;

import br.com.soldev.dsvendas.DTOs.SellerDTO;
import br.com.soldev.dsvendas.entities.Seller;
import br.com.soldev.dsvendas.repositories.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SellerService {
    private final SellerRepository sellerRepository;

    @Autowired
    public SellerService(SellerRepository sellerRepository) {
        this.sellerRepository = sellerRepository;
    }

    public List<SellerDTO> getAll() {
        List<Seller> sellers = this.sellerRepository.findAll();

        return sellers
                .stream()
                .map(seller -> new SellerDTO(seller))
                .collect(Collectors.toList());
    }
}
