package org.example.ellafi_malek84sae7.Controllers;

import org.example.ellafi_malek84sae7.entities.Etudiant;
import org.example.ellafi_malek84sae7.services.interfaces.IEtudiantService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class EtudiantController {
    private final IEtudiantService etudiantService ;
    public EtudiantController(IEtudiantService etudiantService) {
        this.etudiantService = etudiantService;
    }
    @PostMapping("/addEtudiant")
    public Etudiant addEtudiant(@RequestBody Etudiant etudiant) {
        return etudiantService.addEtudiant(etudiant);
    }
    @DeleteMapping("/deleteetudiant")
    public void deleteEtudiant(@RequestBody Etudiant etudiant) {
        etudiantService.deleteEtudiant(etudiant.getIdEtudiant());
    }
    @PutMapping("/updateetudiant")
    public Etudiant updateEtudiant(@RequestBody Etudiant etudiant) {
        return etudiantService.updateEtudiant(etudiant);
    }
    @GetMapping("/{id}")
    public Etudiant getEtudiant(@PathVariable long id) {
       return etudiantService.getEtudiantById(id);
    }
    @GetMapping("/all")
    public List<Etudiant> getAllEtudiant() {
        return etudiantService.getAllEtudiants();
    }
}
