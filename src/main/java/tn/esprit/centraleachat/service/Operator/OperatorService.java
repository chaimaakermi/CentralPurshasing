package tn.esprit.centraleachat.service.Operator;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.centraleachat.entity.Operator;
import tn.esprit.centraleachat.entity.Operator;
import tn.esprit.centraleachat.repository.OperatorRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class OperatorService implements IOperatorService {
    @Autowired
    OperatorRepository operatorRepository ;

    @Override
    public Operator addOperator(Operator operator) {
        return operatorRepository.save(operator);
    }

    @Override
    public Operator UpdateOperator(Operator operator) {

        return operatorRepository.save(operator);
    }

    @Override
    public void deleteOperator(int idOperator) {

        operatorRepository.deleteById(idOperator);
    }

    @Override
    public List<Operator> findAllOperator() {
        return operatorRepository.findAll() ;    }

    @Override
    public Operator findByIdOperator(int idOperator) throws  Exception {
        return operatorRepository.findById(idOperator).orElseThrow(()-> new Exception("Operator n'existe pas"))  ;
    }
}
