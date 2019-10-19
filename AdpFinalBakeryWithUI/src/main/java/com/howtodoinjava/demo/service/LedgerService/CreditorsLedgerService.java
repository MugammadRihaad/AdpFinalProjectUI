package com.howtodoinjava.demo.service.LedgerService;


import com.howtodoinjava.demo.domain.Ledger.CreditorsLedger;
import com.howtodoinjava.demo.service.IService;

import java.util.Set;

public interface CreditorsLedgerService extends IService<CreditorsLedger, String> {
    Set<CreditorsLedger> getAll();
}
