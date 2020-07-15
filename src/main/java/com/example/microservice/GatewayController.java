package com.example.microservice;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GatewayController {

    Logger log = LoggerFactory.getLogger(GatewayController.class);

    @RequestMapping("/")
    public String getInfo() {

        log.info("Service 1 - Gateway Service");
        return "Service 1 - Gateway Service";
    }
}
