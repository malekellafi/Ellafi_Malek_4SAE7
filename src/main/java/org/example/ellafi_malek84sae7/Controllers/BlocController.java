package org.example.ellafi_malek84sae7.Controllers;
import org.example.ellafi_malek84sae7.entities.Bloc;
import org.example.ellafi_malek84sae7.services.interfaces.IBlocService;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@RequestMapping("/api/bloc")

public class BlocController {
    private final IBlocService blocService;
    public BlocController(IBlocService blocService) {
        this.blocService = blocService;
    }

    @PostMapping("/addbloc")
    public Bloc addBloc(@RequestBody Bloc bloc) {
        return blocService.addBloc(bloc);

    }
    @DeleteMapping("/deletebloc")
    public void deleteBloc(@RequestBody Bloc bloc) {
        blocService.deleteBloc(bloc.getIdBloc());


    }
    @GetMapping("/all")
    public List<Bloc> getAllBloc() {
        return blocService.getAllBlocs();
    }
    @GetMapping("/{id}")
    public Bloc getBlocById(@PathVariable long id) {
        return blocService.getBlocById(id);
    }
    @PutMapping("/updatebloc")
    public void updateBloc(@RequestBody Bloc bloc) {
        blocService.updateBloc(bloc);
    }
    @PostMapping("/affecter-chambre")
    public Bloc affecterChambreABloc(@RequestBody List<Long> numerosChambres , @RequestParam("idBloc") long idBloc) {
        return blocService.affecterChambresABloc(numerosChambres, idBloc);
    }




}