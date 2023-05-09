package com.miage.signaturechecker.promotion;

import com.miage.signaturechecker.etudiant.Etudiant;
import com.miage.signaturechecker.etudiant.EtudiantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
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
    public ResponseEntity<?> save(@RequestBody Promotion promotion) {
        promotionService.save(promotion);
        return ResponseEntity.status(HttpStatus.CREATED).body(promotion);
    }

    @ExceptionHandler(DataIntegrityViolationException.class)
    public ResponseEntity<String> handleDataIntegrityViolationException(DataIntegrityViolationException e) {
        return ResponseEntity.status(HttpStatus.CONFLICT).body("Une promotion avec ce nom existe déjà");
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
