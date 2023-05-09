package com.miage.signaturechecker.etudiant;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/etudiants")
public class EtudiantController {

    @Autowired
    private EtudiantService etudiantService;

    @CrossOrigin
    @GetMapping
    public List<Etudiant> findAll() {
        return etudiantService.findAll();
    }

    @CrossOrigin
    @GetMapping("/{id}")
    public Etudiant findById(@PathVariable int id) {
        return etudiantService.findById(id);
    }

    @CrossOrigin
    @PostMapping
    public ResponseEntity<?> save(@RequestBody Etudiant etudiant) {
        etudiantService.save(etudiant);
        return ResponseEntity.status(HttpStatus.CREATED).body(etudiant);
    }

    @ExceptionHandler(DataIntegrityViolationException.class)
    public ResponseEntity<String> handleDataIntegrityViolationException(DataIntegrityViolationException e) {
        return ResponseEntity.status(HttpStatus.CONFLICT).body("Un étudiant avec ce nom et prénom existe déjà");
    }

    @CrossOrigin
    @PutMapping("/{nom}/{promo}")
    public ResponseEntity<Etudiant> update(@RequestBody Etudiant etudiant, @PathVariable String nom, @PathVariable String promo) {
        boolean updated = etudiantService.updateEtudiant(nom, promo, etudiant);
        if (updated) {
            return ResponseEntity.status(HttpStatus.OK).build();
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }


    @CrossOrigin
    @DeleteMapping("/{nom}/{promo}")
    public ResponseEntity<Void> supprimerEtudiantParNomEtPromo(@PathVariable("nom") String nom, @PathVariable("promo") String promo) {
        boolean etudiantSupprime = etudiantService.deleteByNomAndPromo(nom, promo);
        if (etudiantSupprime) {
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @CrossOrigin
    @Transactional
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable int id) {
        etudiantService.deleteById(id);
    }
}

