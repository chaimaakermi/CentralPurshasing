package tn.esprit.centraleachat.service.Impot;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.centraleachat.entity.Impot;
import tn.esprit.centraleachat.repository.ImpotRepository;

import java.util.List;

@Service("Impot")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class IImpotService implements ImpotService{

    @Autowired
    ImpotRepository impotRepository;
    @Override
    public Impot addImpot(Impot impot) {
        return impotRepository.save(impot);
    }

    @Override
    public List<Impot> findAllImpot() {
        return impotRepository.findAll();
    }

    @Override
    public Impot UpdateImpot(Impot impot) {
            return impotRepository.save(impot);

    }

    @Override
    public void deleteImpot(int idImpot) {

         impotRepository.deleteById(idImpot);
    }
}
