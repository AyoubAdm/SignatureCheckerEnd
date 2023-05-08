package com.miage.signaturechecker.promotion;

import com.miage.signaturechecker.etudiant.Etudiant;
import com.miage.signaturechecker.etudiant.EtudiantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/promotion")
public class PromotionController {

        @Autowired
        private PromotionService promotionService;

        @CrossOrigin
        @GetMapping
        public List<Promotion> findAll() {
            return promotionService.findAll();
        }

    @CrossOrigin
    @PostMapping
    public Promotion save(@RequestBody Promotion promotion) {
        return promotionService.save(promotion);
    }


    @CrossOrigin
    @DeleteMapping("/{nomPromo}")
    public ResponseEntity<Void> supprimerPromotionParNom(@PathVariable String nomPromo) {
        boolean isDeleted = promotionService.deleteByNomPromo(nomPromo);
        if (isDeleted) {
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    }
