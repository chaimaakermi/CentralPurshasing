package tn.esprit.centraleachat.service.Supplier;

import tn.esprit.centraleachat.entity.Consumer;
import tn.esprit.centraleachat.entity.Supplier;

import java.util.List;

public interface ISupplierService {

    public Supplier addSupplier (Supplier supplier);
    public Supplier UpdateSupplier(Supplier supplier) ;
    public void deleteSupplier(int idSupplier) ;
    public List<Supplier> findAllSupplier() ;
    public Supplier findByIdSupplier(int idSupplier) throws  Exception ;

    }
