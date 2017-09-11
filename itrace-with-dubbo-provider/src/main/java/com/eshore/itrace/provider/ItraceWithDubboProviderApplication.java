package com.eshore.itrace.provider;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
@EntityScan("com.eshore.itrace.api.entity")
public class ItraceWithDubboProviderApplication implements ApplicationRunner {

    public static void main(String[] args) {
        new SpringApplicationBuilder().sources(ItraceWithDubboProviderApplication.class)
                .web(false).run(args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        // 需要在 ApplicationContext 构建后阻塞
        Thread.currentThread().join();
    }
}
