package com.eshore.itrace.provider;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
@EntityScan("com.eshore.itrace")
public class ItraceWithDubboProviderApplication implements ApplicationRunner {

    public static void main(String[] args) {
        new SpringApplicationBuilder().sources(ItraceWithDubboProviderApplication.class)
                .web(false)  // 使用非 web 环境
                .run(args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {

        // dubbo 底层netty服务也是异步的，所以需要在ApplicationContext构建后阻塞
        Thread.currentThread().join();
    }
}
