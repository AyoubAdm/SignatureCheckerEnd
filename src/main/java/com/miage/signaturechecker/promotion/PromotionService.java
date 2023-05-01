package com.miage.signaturechecker.promotion;

import com.miage.signaturechecker.etudiant.Etudiant;
import com.miage.signaturechecker.etudiant.EtudiantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class PromotionService {
    @Autowired
    private PromotionRepository promotionRepository;


    public List<Promotion> findAll() {
        return promotionRepository.findAll();
    }
}
