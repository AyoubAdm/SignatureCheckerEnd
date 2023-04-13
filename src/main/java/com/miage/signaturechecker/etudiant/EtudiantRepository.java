package com.miage.signaturechecker.etudiant;

import com.miage.signaturechecker.absence.Absence;
import com.miage.signaturechecker.etudiant.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EtudiantRepository extends JpaRepository<Etudiant, Integer> {

}

