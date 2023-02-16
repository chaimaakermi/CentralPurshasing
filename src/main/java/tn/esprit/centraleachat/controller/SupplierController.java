package tn.esprit.centraleachat.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.centraleachat.entity.Supplier;
import tn.esprit.centraleachat.entity.Supplier;
import tn.esprit.centraleachat.service.Supplier.ISupplierService;
import tn.esprit.centraleachat.service.Supplier.ISupplierService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/Supplier")
public class SupplierController {

   ISupplierService supplierService;


        @PostMapping("/ajouterSupplier")
        public Supplier ajouterSupplier (@RequestBody Supplier supplier){
                return supplierService.addSupplier(supplier);

        }

       @PutMapping("/modifierSupplier")
        public Supplier UpdateSupplier (@RequestBody Supplier supplier){

            return supplierService.UpdateSupplier(supplier);
        }

        @DeleteMapping("/supprimerSupplier")
        public void deleteSupplier (@PathVariable int idSupplier){
            supplierService.deleteSupplier(idSupplier);

        }

        @GetMapping("/afficherAllSupplier")
        public List<Supplier> findAllSupplier(){

            return supplierService.findAllSupplier() ;
        }

        @GetMapping("/afficherSupplier/{idC}")

        public Supplier findByIdSupplier(@PathVariable("idC") int idSupplier) throws Exception{
            return supplierService.findByIdSupplier(idSupplier)  ;

        }

    }
