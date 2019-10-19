package com.howtodoinjava.demo.repository.LedgerRepo;


import com.howtodoinjava.demo.domain.Ledger.BusinessLedger;
import com.howtodoinjava.demo.repository.IRepository;

import java.util.Set;

public interface BusinessLedgerRepository extends IRepository<BusinessLedger, String> {
    Set<BusinessLedger> getAll();
}
