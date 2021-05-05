package br.com.soldev.dsvendas.resources;

import br.com.soldev.dsvendas.DTOs.SellerDTO;
import br.com.soldev.dsvendas.services.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/sellers")
public class SellerResource {
    private final SellerService sellerService;

    @Autowired
    private SellerResource(SellerService sellerService) {
        this.sellerService = sellerService;
    }

    @GetMapping
    public ResponseEntity<List<SellerDTO>> getAll() {
        return new ResponseEntity<>(
                this.sellerService.getAll(),
                HttpStatus.OK
        );
    }
}
