package org.example.ellafi_malek84sae7.Controllers;


import org.example.ellafi_malek84sae7.entities.Chambre;
import org.example.ellafi_malek84sae7.entities.TypeChambre;
import org.example.ellafi_malek84sae7.services.interfaces.IChmbreService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class ChambreController {
    private IChmbreService chambreService;
    private ChambreController chambreController;

    public ChambreController(IChmbreService chambreService) {
        this.chambreService = chambreService;
    }
    @PostMapping("/addchambre")
    public Chambre addChambre(@RequestBody Chambre chambre) {
        return chambreService.addChambre(chambre);
    }

    @DeleteMapping("/deleteChambre")
    public void deleteChambre(@RequestBody Chambre chambre) {
        chambreService.deleteChambre(chambre.getIdChambre());

    }

    @GetMapping("/all")
    public List<Chambre> getAllChambre() {
        return chambreService.getAllChambres();
    }


    @GetMapping("/{id}")
    public Chambre getChambreById(@PathVariable long id) {
        return chambreService.getChambreById(id);
    }
    @PutMapping("/updateChambre")
    public Chambre updateChambre(@RequestBody Chambre chambre) {
        return chambreService.updateChambre(chambre);
    }
    @GetMapping("/par-universite")
    public List<Chambre> getChambresParNomUniversite(@RequestParam("nomUniversite") String nomUniversite) {
        return chambreService.getChambresParNomUniversite(nomUniversite);
    }
    @GetMapping("/par-bloc-et-type")
    public List<Chambre> getChambresParBlocEtType(@RequestParam("idBloc") long idBloc,
                                                  @RequestParam("type") TypeChambre typeC) {
        return chambreService.getChambresParBlocEtType(idBloc, typeC);
    }
    @GetMapping("/non-reservees")
    public List<Chambre> getChambresNonReserveParNomUniversiteEtTypeChambre(@RequestParam("nomUniversite") String nomUniversite,
                                                                            @RequestParam("type") TypeChambre type) {
        return chambreService.getChambresNonReserveParNomUniversiteEtTypeChambre(nomUniversite, type);
    }



}

