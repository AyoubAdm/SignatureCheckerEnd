package com.miage.signaturechecker.matiere;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.miage.signaturechecker.matiere.MatiereRepository;
import com.miage.signaturechecker.matiere.Matiere;

import java.util.List;

@Service
public class MatiereService {

    @Autowired
    private MatiereRepository matiereRepository;

    public List<Matiere> findAll() {
        return matiereRepository.findAll();
    }

    public Matiere findById(int id) {
        return matiereRepository.findById(id).orElse(null);
    }

    public Matiere save(Matiere matiere) {
        return matiereRepository.save(matiere);
    }

    public void deleteById(int id) {
        matiereRepository.deleteById(id);
    }
}

