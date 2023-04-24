package com.miage.signaturechecker.absence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

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

    public List<Absence> findByEtudiantIdEtu(int id){ return absenceRepository.findByEtudiantIdEtu(id);}

    public Absence save(Absence absence) {
        return absenceRepository.save(absence);
    }

    public void deleteById(int id) {
        absenceRepository.deleteById(id);
    }

    public List<Map<String, Object>> findTotalAbsencesByStudent() {
        return absenceRepository.findTotalAbsencesByStudent();
    }
}

