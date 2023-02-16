package tn.esprit.centraleachat.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.centraleachat.entity.Consumer;
import tn.esprit.centraleachat.service.Consumer.IConsumerService;

import java.util.List;
@RestController
@AllArgsConstructor
@RequestMapping("/consumer")
public class ConsumerController {

   IConsumerService consumerService;


        @PostMapping("/ajouterConsumer")
        public Consumer ajouterConsumer (@RequestBody Consumer consumer){
                return consumerService.addConsumer(consumer);

        }

       @PutMapping("/modifierConsumer")
        public Consumer UpdateConsumer (@RequestBody Consumer consumer){

            return consumerService.UpdateConsumer(consumer);
        }

        @DeleteMapping("/supprimerConsumer")
        public void deleteConsumer (@PathVariable int idConsumer){
            consumerService.deleteConsumer(idConsumer);

        }

        @GetMapping("/afficherAllConsumer")
        public List<Consumer> findAllConsumer(){

            return consumerService.findAllConsumer() ;
        }

        @GetMapping("/afficherConsumer/{idC}")

        public Consumer findByIdConsumer(@PathVariable("idC") int idConsumer) throws Exception{
            return consumerService.findByIdConsumer(idConsumer)  ;

        }

    }
