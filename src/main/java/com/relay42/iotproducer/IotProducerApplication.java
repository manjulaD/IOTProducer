package com.relay42.iotproducer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;



@SpringBootApplication
@ComponentScan({"com.relay42.iotproducer"})
public class IotProducerApplication {
	
	
	public static void main(String[] args) {
		SpringApplication.run(IotProducerApplication.class, args);
	}

}
