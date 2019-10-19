package com.howtodoinjava.demo.repository.LedgerRepo;


import com.howtodoinjava.demo.domain.Ledger.CreditorsLedger;
import com.howtodoinjava.demo.repository.IRepository;

import java.util.Set;

public interface CreditorsLedgerRepository extends IRepository<CreditorsLedger, String> {
    Set<CreditorsLedger> getAll();
}
