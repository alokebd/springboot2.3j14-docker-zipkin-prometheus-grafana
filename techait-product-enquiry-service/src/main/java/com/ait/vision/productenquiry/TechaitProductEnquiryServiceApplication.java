package com.ait.vision.productenquiry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.ait.vision.productenquiry")
//.techaitproductenquiryservice
public class TechaitProductEnquiryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(TechaitProductEnquiryServiceApplication.class, args);
    }

}
