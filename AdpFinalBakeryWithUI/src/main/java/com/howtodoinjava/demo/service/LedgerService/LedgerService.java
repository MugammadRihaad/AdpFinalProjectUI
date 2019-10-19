package com.howtodoinjava.demo.service.LedgerService;


import com.howtodoinjava.demo.domain.Ledger.Ledger;
import com.howtodoinjava.demo.service.IService;

import java.util.Set;

public interface LedgerService extends IService<Ledger, String> {
    Set<Ledger> getAll();
}
