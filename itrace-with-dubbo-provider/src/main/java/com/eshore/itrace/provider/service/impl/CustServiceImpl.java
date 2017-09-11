package com.eshore.itrace.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.eshore.itrace.api.entity.Cust;
import com.eshore.itrace.api.service.CustService;
import com.eshore.itrace.provider.dao.CustRepo;
import org.springframework.beans.factory.annotation.Autowired;

@Service(version = "1.0.0", protocol = { "rest", "dubbo" })
public class CustServiceImpl implements CustService {

    @Autowired
    private CustRepo custRepo;

    public Cust findByCustName(String name) {
        return custRepo.findByCustName(name);
    }
}
