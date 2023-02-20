package tn.esprit.centraleachat.service.OtherCharge;

import tn.esprit.centraleachat.entity.OtherCharge;

import java.util.List;

public interface IOtherChargeService {

    //add other charge
    public OtherCharge addOtherCharge(OtherCharge otherCharge);

    //update other charge
    public OtherCharge updateOtherCharge(OtherCharge otherCharge);
    public void deleteOtherCharge(int id);

    public OtherCharge findOtherChargeById(int id);

    public List<OtherCharge> findAllOtherCharge();

}
