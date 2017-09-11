package com.eshore.itrace.provider.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.eshore.itrace.api.entity.Cust;

public interface CustRepo extends JpaRepository<Cust, Long> {

    Cust findByCustName(String custName);


    @Query("from Cust c where cust_name=:name")
    Cust findUser(@Param("name") String name);
}
