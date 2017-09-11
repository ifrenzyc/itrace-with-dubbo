package com.eshore.itrace.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com.eshore.itrace")
public class ItraceWithDubboConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ItraceWithDubboConsumerApplication.class, args);
	}
}