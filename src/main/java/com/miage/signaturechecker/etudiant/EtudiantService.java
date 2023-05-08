package com.miage.signaturechecker.etudiant;

import com.miage.signaturechecker.etudiant.EtudiantRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.miage.signaturechecker.etudiant.EtudiantRepository;
import com.miage.signaturechecker.etudiant.Etudiant;

import java.util.List;
import java.util.Optional;

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

    @Transactional
    public boolean deleteByNomAndPromo(String nom, String promo) {
        Etudiant etudiant = etudiantRepository.findByNomEtuAndPromo(nom, promo);
        if (etudiant != null) {
            etudiantRepository.delete(etudiant);
            return true;
        } else {
            return false;
        }
    }

    @Transactional
    public boolean updateEtudiant(String nom, String promo, Etudiant updatedEtudiant) {
        Etudiant existingEtudiant = etudiantRepository.findByNomEtuAndPromo(nom, promo);
        if (existingEtudiant == null) {
            return false;
        }

        if (updatedEtudiant.getTp() != null && !updatedEtudiant.getTp().isEmpty()) {
            existingEtudiant.setTp(updatedEtudiant.getTp());
        }
        if (updatedEtudiant.getTd() != null && !updatedEtudiant.getTd().isEmpty()) {
            existingEtudiant.setTd(updatedEtudiant.getTd());
        }
        if (updatedEtudiant.getPromo() != null && !updatedEtudiant.getPromo().isEmpty()) {
            existingEtudiant.setPromo(updatedEtudiant.getPromo());
        }

        etudiantRepository.save(existingEtudiant);
        return true;
    }



}

