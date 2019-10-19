package com.howtodoinjava.demo.service.LedgerService;


import com.howtodoinjava.demo.domain.Ledger.BusinessLedger;
import com.howtodoinjava.demo.service.IService;

import java.util.Set;

public interface BusinessLedgerService extends IService<BusinessLedger, String> {
    Set<BusinessLedger> getAll();
}
