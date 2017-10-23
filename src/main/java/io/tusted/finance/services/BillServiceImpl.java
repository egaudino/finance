package io.tusted.finance.services;

import io.tusted.finance.domain.Bill;
import io.tusted.finance.repositories.BillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BillServiceImpl implements BillService {

    @Autowired
    private BillRepository billRepository;

    @Override
    public Iterable<Bill> listBills() {
        return billRepository.findAll();
    }

    @Override
    public Bill getBillById(Long id) {
        return billRepository.findOne(id);
    }

    @Override
    public Bill saveBill(Bill bill) {
        return billRepository.save(bill);
    }

    @Override
    public void deleteBill(Long id) {
        billRepository.delete(id);
    }
}
