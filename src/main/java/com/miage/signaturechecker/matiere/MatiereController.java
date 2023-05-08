package com.miage.signaturechecker.matiere;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/matieres")
public class MatiereController {

    @Autowired
    private MatiereService matiereService;

    @CrossOrigin
    @GetMapping
    public List<Matiere> findAll() {
        return matiereService.findAll();
    }

    @CrossOrigin
    @GetMapping("/{id}")
    public Matiere findById(@PathVariable int id) {
        return matiereService.findById(id);
    }

    @CrossOrigin
    @PostMapping
    public Matiere save(@RequestBody Matiere matiere) {
        return matiereService.save(matiere);
    }


    @CrossOrigin
    @DeleteMapping("/{nomMatiere}")
    public ResponseEntity<Void> supprimerPromotionParNom(@PathVariable String nomMatiere) {
        boolean isDeleted = matiereService.deleteByNomMat(nomMatiere);
        if (isDeleted) {
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}

