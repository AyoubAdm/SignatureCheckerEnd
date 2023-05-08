package com.miage.signaturechecker.matiere;

import com.miage.signaturechecker.promotion.Promotion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface MatiereRepository extends JpaRepository<Matiere, Integer> {
    Matiere findByNomMat(String nomMat);
}
