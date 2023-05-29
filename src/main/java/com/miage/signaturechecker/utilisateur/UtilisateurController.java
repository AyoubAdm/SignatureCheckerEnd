package com.miage.signaturechecker.utilisateur;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/utilisateur")
public class UtilisateurController {
    @Autowired
    private UtilisateurService utilisateurService;

    @CrossOrigin
    @GetMapping
    public List<Utilisateur> findAll() {
        return utilisateurService.findAll();
    }

    @CrossOrigin
    @PostMapping
    public Utilisateur save(@RequestBody Utilisateur utilisateur) {
        return utilisateurService.save(utilisateur);
    }

    @CrossOrigin
    @GetMapping("/{nomUtilisateur}")
    public Utilisateur findByNomUser(@PathVariable String nomUtilisateur) {
        return utilisateurService.findByNomUser(nomUtilisateur);
    }


    @CrossOrigin
    @DeleteMapping("/{nomUtilisateur}")
    public ResponseEntity<Void> supprimerUtilisateurParNom(@PathVariable String nomUtilisateur) {
        boolean isDeleted = utilisateurService.deleteByNomUser(nomUtilisateur);
        if (isDeleted) {
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @CrossOrigin
    @GetMapping("/check/{nomUser}:{mdpUser}")
    public boolean isUserExist(@PathVariable String nomUser, @PathVariable String mdpUser) {
        return utilisateurService.isUserExist(nomUser, mdpUser);
    }
}
