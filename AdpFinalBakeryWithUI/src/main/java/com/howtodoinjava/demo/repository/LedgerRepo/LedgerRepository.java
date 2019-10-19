package com.howtodoinjava.demo.repository.LedgerRepo;


import com.howtodoinjava.demo.domain.Ledger.Ledger;
import com.howtodoinjava.demo.repository.IRepository;

import java.util.Set;

public interface LedgerRepository extends IRepository<Ledger, String> {
    Set<Ledger> getAll();
}
