package com.miage.signaturechecker.enseignant;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EnseignantRepository extends JpaRepository<Enseignant, Integer> {
}

