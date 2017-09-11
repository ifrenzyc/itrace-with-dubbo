package com.eshore.itrace.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.eshore.itrace.api.service.CustService;
import com.eshore.itrace.api.entity.Cust;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@EnableAutoConfiguration
public class CustController {

    @Reference(version = "1.0.0")
    private CustService custService;


    @RequestMapping("/cust/get")
    String get(@RequestParam("name") String name) {
        Cust cust = custService.findByCustName(name);

        return cust.getCustId().toString();
    }
}