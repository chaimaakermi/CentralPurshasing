package tn.esprit.centraleachat.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.centraleachat.entity.Operator;
import tn.esprit.centraleachat.entity.Operator;
import tn.esprit.centraleachat.entity.Operator;
import tn.esprit.centraleachat.service.Operator.OperatorService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/operator")
public class OperatorController {

    OperatorService operatorService;

    @PostMapping("/ajouterOperator")
    public Operator ajouterOperator (@RequestBody Operator operator){
        return operatorService.addOperator(operator);

    }
    @PutMapping("/modifierOperator")
    public Operator UpdateOperator (@RequestBody Operator operator){

        return operatorService.UpdateOperator(operator);
    }

    @DeleteMapping("/supprimerOperator")
    public void deleteOperator (@PathVariable int idOperator){
        operatorService.deleteOperator(idOperator);

    }

    @GetMapping("/afficherAllOperator")
    public List<Operator> findAllOperator(){

        return operatorService.findAllOperator() ;
    }
    @GetMapping("/afficherOperator/{idC}")

    public Operator findByIdOperator(@PathVariable("idC") int idOperator) throws Exception{
        return operatorService.findByIdOperator(idOperator)  ;

    }
}
