package tn.esprit.centraleachat.service.Impot;

import tn.esprit.centraleachat.entity.Impot;

import java.util.List;

public interface ImpotService {

    public Impot addImpot(Impot impot);


    public List<Impot> findAllImpot();

    public  Impot UpdateImpot(Impot impot);

    public void deleteImpot(int idImpot);


}
