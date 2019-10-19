package com.howtodoinjava.demo.repository.LedgerRepo;


import com.howtodoinjava.demo.domain.Ledger.GeneralLedger;
import com.howtodoinjava.demo.repository.IRepository;

import java.util.Set;

public interface GeneralLedgerRepository extends IRepository<GeneralLedger, String> {
    Set<GeneralLedger> getAll();
}