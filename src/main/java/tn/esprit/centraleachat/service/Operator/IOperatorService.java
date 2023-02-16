package tn.esprit.centraleachat.service.Operator;

import tn.esprit.centraleachat.entity.Operator;
import tn.esprit.centraleachat.entity.Operator;

import java.util.List;

public interface IOperatorService {

    public Operator addOperator (Operator operator);
    public List<Operator> findAllOperator() ;
    public Operator UpdateOperator(Operator operator) ;
    public void deleteOperator(int idOperator) ;
    public Operator findByIdOperator(int idOperator) throws  Exception ;
}
