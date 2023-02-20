package tn.esprit.centraleachat.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.centraleachat.entity.Impot;
import tn.esprit.centraleachat.service.Impot.ImpotService;

import java.util.List;

@RestController
@RequestMapping("/impot")
public class ImpotController {

    @Autowired
    ImpotService impotService;


    @PostMapping("/addImpot")
    public Impot addImpot(@RequestBody Impot impot){
      return   impotService.addImpot(impot);
    }

    @GetMapping("/afficherAllImpot")
    public List<Impot> findAllImpot(){
      return  impotService.findAllImpot();
    }

    @PutMapping("/updateImpot")
    public Impot UpdateImpot(@RequestBody Impot impot){
      return   impotService.UpdateImpot(impot);
    }

    @DeleteMapping("/deleteImpot/{idImpot}")
    public void deleteImpot(@PathVariable("idImpot") int idImpot){
      impotService.deleteImpot(idImpot);
    }
}
