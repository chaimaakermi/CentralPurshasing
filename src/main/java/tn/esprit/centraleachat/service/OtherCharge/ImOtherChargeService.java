package tn.esprit.centraleachat.service.OtherCharge;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.centraleachat.entity.OtherCharge;
import tn.esprit.centraleachat.repository.OtherChargeRepository;

import java.util.List;
@Service
public class ImOtherChargeService implements IOtherChargeService{

    @Autowired
    OtherChargeRepository otherChargeRepository;
    @Override
    public OtherCharge addOtherCharge(OtherCharge otherCharge) {
        return  otherChargeRepository.save(otherCharge);
    }

    @Override
    public OtherCharge updateOtherCharge(OtherCharge otherCharge) {
        return  otherChargeRepository.save(otherCharge);
    }

    @Override
    public void deleteOtherCharge(int id) {

        otherChargeRepository.deleteById(id);
    }

    @Override
    public OtherCharge findOtherChargeById(int id) {
        return otherChargeRepository.findById(id).get();
    }

    @Override
    public List<OtherCharge> findAllOtherCharge() {
        return otherChargeRepository.findAll();
    }
}
