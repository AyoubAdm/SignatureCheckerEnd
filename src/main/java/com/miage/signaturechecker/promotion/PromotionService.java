package com.miage.signaturechecker.promotion;

import com.miage.signaturechecker.etudiant.Etudiant;
import com.miage.signaturechecker.etudiant.EtudiantRepository;
import jakarta.transaction.Transactional;
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

    public Promotion save(Promotion promotion) {
        return promotionRepository.save(promotion);
    }

    @Transactional
    public boolean deleteByNomPromo(String nomPromo) {
        Promotion promotion = promotionRepository.findByNomPromo(nomPromo);
        if (promotion != null) {
            promotionRepository.delete(promotion);
            return true;
        } else {
            return false;
        }
    }

}
