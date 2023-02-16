package tn.esprit.centraleachat.service.Consumer;

import tn.esprit.centraleachat.entity.Consumer;

import java.util.List;

public interface IConsumerService {

    public Consumer addConsumer (Consumer consumer);
    public Consumer UpdateConsumer(Consumer consumer) ;
    public void deleteConsumer(int idConsumer) ;
    public List<Consumer> findAllConsumer() ;
    public Consumer findByIdConsumer(int idConsumer) throws  Exception ;

    }
