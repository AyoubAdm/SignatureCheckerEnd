package com.miage.signaturechecker.enseignant;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.miage.signaturechecker.enseignant.EnseignantRepository;
import com.miage.signaturechecker.enseignant.Enseignant;

import java.util.List;
import java.util.Optional;

@Service
public class EnseignantService {

    @Autowired
    private EnseignantRepository enseignantRepository;

    public List<Enseignant> findAll() {
        return enseignantRepository.findAll();
    }

    public Enseignant findById(int id) {
        return enseignantRepository.findById(id).orElse(null);
    }

    public Enseignant save(Enseignant enseignant) {
        return enseignantRepository.save(enseignant);
    }

    public void deleteById(int id) {
        enseignantRepository.deleteById(id);
    }

    @Transactional
    public boolean deleteByNomEns(String nomEns) {
        Enseignant enseignant = enseignantRepository.findByNomEns(nomEns);
        if (enseignant != null) {
            enseignantRepository.delete(enseignant);
            return true;
        } else {
            return false;
        }
    }
}
