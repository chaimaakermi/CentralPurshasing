package tn.esprit.centraleachat.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.centraleachat.entity.OtherCharge;
import tn.esprit.centraleachat.service.OtherCharge.ImOtherChargeService;

import java.util.List;

@RestController
@RequestMapping("/otherCharge")
public class OtherChargeController {

    @Autowired
    ImOtherChargeService imOtherChargeService;


    @GetMapping("/getAll")
    public List<OtherCharge> getAllOtherCharge(){
        return imOtherChargeService.findAllOtherCharge();}

    @PostMapping("/add")
    public OtherCharge addOtherCharge(@RequestBody  OtherCharge otherCharge){
        return imOtherChargeService.addOtherCharge(otherCharge);}

    @PutMapping("/update")
    public OtherCharge updateOtherCharge(@RequestBody OtherCharge otherCharge){
        return imOtherChargeService.updateOtherCharge(otherCharge);}

    @DeleteMapping("/delete/{id}")
    public void deleteOtherCharge(@PathVariable int id){
        imOtherChargeService.deleteOtherCharge(id);}

    @GetMapping("/get/{id}")
    public OtherCharge getOtherCharge(@PathVariable int id){
        return imOtherChargeService.findOtherChargeById(id);}
    }
