package tn.esprit.centraleachat.service.Admin;

import tn.esprit.centraleachat.entity.Admin;

import java.util.List;

public interface IAdminService {


    public List<Admin> findAllAdmin() ;
    public Admin findByIdAdmin(int idAdmin) throws  Exception ;
    public Admin findByEmailAndPassword(String email, String password)  ;

    }
