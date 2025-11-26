package org.example.ellafi_malek84sae7.Controllers;

import org.example.ellafi_malek84sae7.entities.Universite;
import org.example.ellafi_malek84sae7.services.interfaces.IUniversiteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class universiteController {
    private final IUniversiteService universiteService;
    public universiteController(IUniversiteService universiteService) {
        this.universiteService = universiteService;
    }
    @PostMapping("/adduniversite")
    public Universite addUniversite(Universite universite) {
        return universiteService.addUniversite(universite);
    }
    @DeleteMapping("/deleteuniversite")
    public void deleteUniversite(Universite universite) {
        universiteService.deleteUniversite(universite.getIdUniversite());
    }
    @PutMapping("/updateuniversite")
    public Universite updateUniversite(Universite universite) {
        return universiteService.updateUniversite(universite);
    }
    @GetMapping("/{id}")
    public Universite getUniversite(@PathVariable long id) {
        return universiteService.getUniversiteById(id);
    }
    @GetMapping("/all")
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
