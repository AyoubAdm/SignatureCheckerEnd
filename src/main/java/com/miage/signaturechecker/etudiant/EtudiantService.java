package com.miage.signaturechecker.etudiant;

import com.miage.signaturechecker.etudiant.EtudiantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.miage.signaturechecker.etudiant.EtudiantRepository;
import com.miage.signaturechecker.etudiant.Etudiant;

import java.util.List;

@Service
public class EtudiantService {

    @Autowired
    private EtudiantRepository etudiantRepository;

    public List<Etudiant> findAll() {
        return etudiantRepository.findAll();
    }

    public Etudiant findById(int id) {
        return etudiantRepository.findById(id).orElse(null);
    }

    public Etudiant save(Etudiant etudiant) {
        return etudiantRepository.save(etudiant);
    }

    public void deleteById(int id) {
        etudiantRepository.deleteById(id);
    }
}

