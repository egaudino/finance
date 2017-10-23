package io.tusted.finance.services;

import io.tusted.finance.domain.Bill;

public interface BillService  {
        Iterable<Bill> listBills();

        Bill getBillById(Long id);

        Bill saveBill(Bill bill);

        void deleteBill(Long id);
}
