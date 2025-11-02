package org.example.ellafi_malek84sae7.Controllers;

import org.example.ellafi_malek84sae7.entities.Bloc;
import org.example.ellafi_malek84sae7.entities.Chambre;
import org.example.ellafi_malek84sae7.services.interfaces.IChmbreService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class ChambreController {
    private final IChmbreService chmbreService;
    public ChambreController(IChmbreService chmbreService) {
        this.chmbreService = chmbreService;
    }
    @PostMapping("/addchambre")
    public Chambre addChambre(@RequestBody Chambre chambre) {
        return chmbreService.addChambre(chambre);
    }

    @DeleteMapping("/deleteChambre")
    public void deleteChambre(@RequestBody Chambre chambre) {
        chmbreService.deleteChambre(chambre.getIdChambre());

    }

    @GetMapping("/all")
    public List<Chambre> getAllChambre() {
        return chmbreService.getAllChambres();
    }


    @GetMapping("/{id}")
    public Chambre getChambreById(@PathVariable long id) {
        return chmbreService.getChambreById(id);
    }
    @PutMapping("/updateChambre")
    public Chambre updateChambre(@RequestBody Chambre chambre) {
        return chmbreService.updateChambre(chambre);
    }


}

