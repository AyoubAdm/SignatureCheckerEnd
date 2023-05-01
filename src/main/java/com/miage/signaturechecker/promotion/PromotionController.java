package com.miage.signaturechecker.promotion;

import com.miage.signaturechecker.etudiant.Etudiant;
import com.miage.signaturechecker.etudiant.EtudiantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    }
