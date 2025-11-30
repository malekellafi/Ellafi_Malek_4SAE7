package org.example.ellafi_malek84sae7.controllers;

import org.example.ellafi_malek84sae7.entities.Foyer;
import org.example.ellafi_malek84sae7.services.interfaces.IFoyerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class FoyerController {
    private final IFoyerService foyerService;
    public FoyerController(IFoyerService foyerService) {

        this.foyerService = foyerService;
    }
    @PostMapping("/addfoyer")
    public Foyer addFoyer(@RequestBody Foyer foyer) {

        return foyerService.addFoyer(foyer);
    }
    @DeleteMapping("/deletefoyer")
    public void deleteFoyer(@RequestBody Foyer foyer) {

        foyerService.deleteFoyer(foyer.getIdFoyer());
    }
    @PutMapping("/updatefoyer")
    public Foyer updateFoyer(@RequestBody Foyer foyer) {
        return foyerService.updateFoyer(foyer);
    }
    @GetMapping("/{id}")
    public Foyer getFoyer(@PathVariable long id) {
        return foyerService.getFoyerById(id);
    }
    @GetMapping("/all")
    public List<Foyer> getAllFoyer() {
        return foyerService.getAllFoyers();
    }
    @PostMapping("/ajouter-aafecter")
    public Foyer ajouterFoyerEtAffecterAUniversite(@RequestBody Foyer foyer,
                                                   @RequestParam("idUniversite") long idUniversite) {
        return foyerService.ajouterFoyerEtAffecterAUniversite(foyer, idUniversite);
    }

}
