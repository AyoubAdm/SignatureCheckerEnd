package com.miage.signaturechecker.etudiant;

import org.springframework.beans.factory.annotation.Autowired;
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

    @PostMapping
    public Etudiant save(@RequestBody Etudiant etudiant) {
        return etudiantService.save(etudiant);
    }

    @PutMapping("/{id}")
    public Etudiant update(@RequestBody Etudiant etudiant, @PathVariable int id) {
        etudiant.setIdEtu(id);
        return etudiantService.save(etudiant);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable int id) {
        etudiantService.deleteById(id);
    }
}

