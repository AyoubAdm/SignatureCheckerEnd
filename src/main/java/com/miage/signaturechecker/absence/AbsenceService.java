package com.miage.signaturechecker.absence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AbsenceService {

    @Autowired
    private AbsenceRepository absenceRepository;

    public List<Absence> findAll() {
        return absenceRepository.findAll();
    }

    public Absence findById(int id) {
        return absenceRepository.findById(id).orElse(null);
    }

    public List<Absence> findByEtudiantId(int id){ return absenceRepository.findByEtudiantId(id);}

    public Absence save(Absence absence) {
        return absenceRepository.save(absence);
    }

    public void deleteById(int id) {
        absenceRepository.deleteById(id);
    }
}

