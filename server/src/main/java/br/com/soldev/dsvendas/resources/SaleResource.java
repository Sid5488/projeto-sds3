package br.com.soldev.dsvendas.resources;

import br.com.soldev.dsvendas.DTOs.SaleDTO;
import br.com.soldev.dsvendas.services.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sales")
public class SaleResource {
    private final SaleService saleService;

    @Autowired
    private SaleResource(SaleService saleService) {
        this.saleService = saleService;
    }

    @GetMapping
    public ResponseEntity<Page<SaleDTO>> getAll(Pageable pageable) {
        return new ResponseEntity<>(
                this.saleService.getAll(pageable),
                HttpStatus.OK
        );
    }
}
