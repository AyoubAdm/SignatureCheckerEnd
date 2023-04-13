package com.miage.signaturechecker.absence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AbsenceRepository extends JpaRepository<Absence, Integer> {

    List<Absence> findByEtudiantId(int id);
}
