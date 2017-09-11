package com.eshore.itrace.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.eshore.itrace.api.service.CustGroupService;

@Service(version = "1.0.0", protocol = { "rest", "dubbo" })
public class CustGroupServiceImpl implements CustGroupService {
}
