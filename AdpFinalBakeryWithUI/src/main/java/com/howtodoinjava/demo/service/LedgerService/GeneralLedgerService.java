package com.howtodoinjava.demo.service.LedgerService;


import com.howtodoinjava.demo.domain.Ledger.GeneralLedger;
import com.howtodoinjava.demo.service.IService;

import java.util.Set;

public interface GeneralLedgerService extends IService<GeneralLedger, String> {
    Set<GeneralLedger> getAll();
}
