package com.miage.signaturechecker.matiere;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/matieres")
public class MatiereController {

    @Autowired
    private MatiereService matiereService;

    @GetMapping
    public List<Matiere> findAll() {
        return matiereService.findAll();
    }

    @GetMapping("/{id}")
    public Matiere findById(@PathVariable int id) {
        return matiereService.findById(id);
    }

    @PostMapping
    public Matiere save(@RequestBody Matiere matiere) {
        return matiereService.save(matiere);
    }

    @PutMapping("/{id}")
    public Matiere update(@RequestBody Matiere matiere, @PathVariable int id) {
        matiere.setIdMat(id);
        return matiereService.save(matiere);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable int id) {
        matiereService.deleteById(id);
    }
}

