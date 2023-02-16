package tn.esprit.centraleachat.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.centraleachat.entity.Admin;
import tn.esprit.centraleachat.service.Admin.IAdminService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/admin")
public class AdminController {

   IAdminService adminService;
        @GetMapping("/afficherAllAdmin")
        public List<Admin> findAllAdmin(){

            return adminService.findAllAdmin() ;
        }

        @GetMapping("/afficherAdmin/{idC}")

        public Admin findByIdAdmin(@PathVariable("idC") int idAdmin) throws Exception{
            return adminService.findByIdAdmin(idAdmin)  ;
        }

    /*@GetMapping("/afficherAdminByEmailAndPass/{email,password}")

    public Admin findByEmailAndPassword(@PathVariable("email,password") String email, String password) {
        return adminService.findByEmailAndPassword(email,password)  ;

    }*/

    }
