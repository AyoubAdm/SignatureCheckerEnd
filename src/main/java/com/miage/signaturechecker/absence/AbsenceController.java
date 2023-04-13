package com.miage.signaturechecker.absence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/absences")
public class AbsenceController {

    @Autowired
    private AbsenceService absenceService;

    @CrossOrigin
    @GetMapping
    public List<Absence> findAll() {
        return absenceService.findAll();
    }

    @CrossOrigin
    @GetMapping("/{id}")
    public Absence findById(@PathVariable int id) {
        return absenceService.findById(id);
    }


    @CrossOrigin
    @GetMapping("/etudiant/{id}")
    public List<Absence> findByEtudiantId(@PathVariable int id) {
        return absenceService.findByEtudiantId(id);
    }

    @PostMapping
    public Absence save(@RequestBody Absence absence) {
        return absenceService.save(absence);
    }

    @PutMapping("/{id}")
    public Absence update(@RequestBody Absence absence, @PathVariable int id) {
        absence.setId(id);
        return absenceService.save(absence);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable int id) {
        absenceService.deleteById(id);
    }
}

