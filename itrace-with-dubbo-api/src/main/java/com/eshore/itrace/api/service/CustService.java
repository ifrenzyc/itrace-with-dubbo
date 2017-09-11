package com.eshore.itrace.api.service;

import com.eshore.itrace.api.entity.Cust;

public interface CustService {

    Cust findByCustName(String name);
}
