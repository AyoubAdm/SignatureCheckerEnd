package com.miage.signaturechecker.enseignant;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface EnseignantRepository extends JpaRepository<Enseignant, Integer> {

    Enseignant findByNomEns(String nomEns);
}

