package com.miage.signaturechecker.matiere;

import com.miage.signaturechecker.promotion.Promotion;
import jakarta.transaction.Transactional;
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

    @Transactional
    public boolean deleteByNomMat(String nomMat) {
        Matiere matiere = matiereRepository.findByNomMat(nomMat);
        if (matiere != null) {
            matiereRepository.delete(matiere);
            return true;
        } else {
            return false;
        }
    }
}

