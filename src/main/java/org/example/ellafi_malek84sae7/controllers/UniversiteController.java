package org.example.ellafi_malek84sae7.controllers;




import org.example.ellafi_malek84sae7.entities.Universite;
import org.example.ellafi_malek84sae7.services.interfaces.IUniversiteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/universites")
public class UniversiteController {
    private final IUniversiteService universiteService;

    public UniversiteController(IUniversiteService universiteService) {
        this.universiteService = universiteService;
    }

    @PostMapping
    public Universite addUniversite(@RequestBody Universite universite) {
        return universiteService.addUniversite(universite);
    }

    @DeleteMapping("/{id}")
    public void deleteUniversite(@PathVariable("id") long id) {
        universiteService.deleteUniversite(id);
    }

    @PutMapping
    public Universite updateUniversite(@RequestBody Universite universite) {
        return universiteService.updateUniversite(universite);
    }

    @GetMapping("/{id}")
    public Universite getUniversite(@PathVariable long id) {
        return universiteService.getUniversiteById(id);
    }

    @GetMapping
    public List<Universite> getAllUniversites() {
        return universiteService.getAllUniversites();
    }

    @PutMapping("/affecter-foyer")
    public Universite affecterFoyerAUniversite(@RequestParam("idFoyer") long idFoyer,
                                               @RequestParam("nomUniversite") String nomUniversite) {
        return universiteService.affecterFoyerAUniversite(idFoyer, nomUniversite);
    }

    @PutMapping("/desaffecter-foyer/{idUniversite}")
    public Universite desaffecterFoyerAUniversite(@PathVariable("idUniversite") long idUniversite) {
        return universiteService.desaffecterFoyerAUniversite(idUniversite);
    }
}