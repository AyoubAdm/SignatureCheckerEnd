package com.miage.signaturechecker.enseignant;

import org.springframework.beans.factory.annotation.Autowired;
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

    @PostMapping
    public Enseignant save(@RequestBody Enseignant enseignant) {
        return enseignantService.save(enseignant);
    }

    @CrossOrigin
    @PutMapping("/{id}")
    public Enseignant update(@RequestBody Enseignant enseignant, @PathVariable int id) {
        enseignant.setIdEns(id);
        return enseignantService.save(enseignant);
    }

    @CrossOrigin
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable int id) {
        enseignantService.deleteById(id);
    }
}

