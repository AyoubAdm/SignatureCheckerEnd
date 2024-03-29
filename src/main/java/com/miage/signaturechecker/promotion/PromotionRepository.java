package com.miage.signaturechecker.promotion;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PromotionRepository extends JpaRepository<Promotion, String> {
    Promotion findByNomPromo(String nomPromo);
}
