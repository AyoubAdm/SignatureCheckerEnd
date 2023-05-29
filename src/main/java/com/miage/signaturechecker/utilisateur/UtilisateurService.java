package com.miage.signaturechecker.utilisateur;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UtilisateurService {

    @Autowired
    private UtilisateurRepository utilisateurRepository;


    public List<Utilisateur> findAll() {
        return utilisateurRepository.findAll();
    }

    public Utilisateur save (Utilisateur utilisateur) {
        return utilisateurRepository.save(utilisateur);
    }

    public Utilisateur findByNomUser(String nomUser) {
        return utilisateurRepository.findByNomUser(nomUser);
    }



    @Transactional
    public boolean deleteByNomUser(String nomUser) {
        Utilisateur utilisateur = utilisateurRepository.findByNomUser(nomUser);
        if (utilisateur != null) {
            utilisateurRepository.delete(utilisateur);
            return true;
        } else {
            return false;
        }
    }

    public boolean isUserExist(String nomUser, String mdpUser) {
        return utilisateurRepository.isUserExist(nomUser, mdpUser);
    }
}
