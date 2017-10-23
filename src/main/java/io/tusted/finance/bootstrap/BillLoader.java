package io.tusted.finance.bootstrap;

import io.tusted.finance.domain.Bill;
import io.tusted.finance.repositories.BillRepository;
import io.tusted.finance.services.BillService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class BillLoader implements ApplicationListener<ContextRefreshedEvent> {

    @Autowired
    private BillRepository billRepository;

    private Logger log = Logger.getLogger(BillLoader.class);


    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
     /*   log.info("Criando conta");
        Bill bill = new Bill();
        bill.setId(1L);
        bill.setDescription("Conta de luz");
        bill.setDueDate("30/12/2017");
        bill.setValue(100);
        bill.setPaid(false);

        if (bill != null) {
            billRepository.save(bill);
            log.info("Conta "+ bill.getDescription() + " criada com sucesso");
        } else {
            log.info("Erro ao criar conta");
        }

        Bill bill2 = billRepository.findOne(bill.getId());
        log.info("Conta encontrada: " + bill2.getId() + " " + bill2.getDescription());*/

    }

}
