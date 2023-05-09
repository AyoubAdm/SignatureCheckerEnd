package com.miage.signaturechecker.enseignant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/enseignants")
public class EnseignantController {

    @Autowired
    private EnseignantService enseignantService;

    @CrossOrigin
    @GetMapping
    public List<Enseignant> findAll() {
        return enseignantService.findAll();
    }

    @CrossOrigin
    @GetMapping("/{id}")
    public Enseignant findById(@PathVariable int id) {
        return enseignantService.findById(id);
    }

    @CrossOrigin
    @PostMapping
    public ResponseEntity<?> save(@RequestBody Enseignant enseignant) {
        enseignantService.save(enseignant);
        return ResponseEntity.status(HttpStatus.CREATED).body(enseignant);
    }

    @ExceptionHandler(DataIntegrityViolationException.class)
    public ResponseEntity<String> handleDataIntegrityViolationException(DataIntegrityViolationException e) {
        return ResponseEntity.status(HttpStatus.CONFLICT).body("Un enseignant avec ce nom existe déjà");
    }
    @CrossOrigin
    @PutMapping("/{id}")
    public Enseignant update(@RequestBody Enseignant enseignant, @PathVariable int id) {
        enseignant.setIdEns(id);
        return enseignantService.save(enseignant);
    }

    @CrossOrigin
    @DeleteMapping("/{nomEns}")
    public ResponseEntity<Void> supprimerEnseignantParNom(@PathVariable String nomEns) {
        boolean isDeleted = enseignantService.deleteByNomEns(nomEns);
        if (isDeleted) {
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}

