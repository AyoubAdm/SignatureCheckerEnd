package com.miage.signaturechecker.enseignant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.miage.signaturechecker.enseignant.EnseignantRepository;
import com.miage.signaturechecker.enseignant.Enseignant;

import java.util.List;

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
}
