package tn.esprit.centraleachat.service.Admin;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.centraleachat.entity.Admin;
import tn.esprit.centraleachat.repository.AdminRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class AdminService implements IAdminService {
    @Autowired
    AdminRepository adminRepository;

    @Override
    public List<Admin> findAllAdmin() {

        return adminRepository.findAll() ;
    }

    @Override
    public Admin findByIdAdmin(int idAdmin) throws  Exception {
        return adminRepository.findById(idAdmin).orElseThrow(()-> new Exception("Admin n'existe pas"))  ;
    }

    @Override
    public Admin findByEmailAndPassword(String email, String password){
        return adminRepository.findByEmailAndPassword(email,password) ;
    }
}
