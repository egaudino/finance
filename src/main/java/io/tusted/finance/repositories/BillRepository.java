package io.tusted.finance.repositories;

import io.tusted.finance.domain.Bill;
import org.springframework.data.repository.CrudRepository;

public interface BillRepository extends CrudRepository<Bill, Long>{

}
