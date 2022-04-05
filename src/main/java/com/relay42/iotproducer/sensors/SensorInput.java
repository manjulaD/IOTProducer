package com.relay42.iotproducer.sensors;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import com.relay42.iotproducer.config.KafkaProducerConfig;
import com.relay42.iotproducer.models.SensorData;

@Configuration
@EnableScheduling
public class SensorInput {
	
	@Autowired
	SensorData sensor1;
	
	@Autowired
	SensorData sensor2;
	
	@Autowired
	SensorData sensor3;
	
	@Autowired
	KafkaProducerConfig config;
	
	
	@Autowired
	KafkaTemplate<String, SensorData> kafkaTemplate;
	
	
	
	
	@Scheduled(fixedRate = 10000)
	public void mockSensor1() {
		
	   
	    sensor1.setSource("Thermostat1");
	    java.util.Date date=new java.util.Date();
	    java.sql.Date sqlDate=new java.sql.Date(date.getTime());
	    sensor1.setOriginTime( sqlDate);
	    sensor1.setUnit("C");
	    sensor1.setSensorGroup("Temperature");
	    Random r = new Random();
	    double random = 0 + r.nextDouble() * (100 - 0);
	    sensor1.setSensorValue(String.valueOf(random));
	    config.sensorDataKafkaTemplate().send("sensor",sensor1);
	}
	
	@Scheduled(fixedRate = 10000)
	public void mockSensor2() {
		
	   
	    sensor2.setSource("Thermostat2");
	    java.util.Date date=new java.util.Date();
	    java.sql.Date sqlDate=new java.sql.Date(date.getTime());
	    sensor2.setOriginTime( sqlDate);
	    sensor2.setUnit("C");
	    sensor2.setSensorGroup("Temperature");
	    Random r = new Random();
	    double random = 0 + r.nextDouble() * (100 - 0);
	    sensor2.setSensorValue(String.valueOf(random));
	    config.sensorDataKafkaTemplate().send("sensor",sensor2);
	}
	
	@Scheduled(fixedRate = 10000)
	public void mockSensor3() {
		
	   
	    sensor3.setSource("FuelTank1");
	    java.util.Date date=new java.util.Date();
	    java.sql.Date sqlDate=new java.sql.Date(date.getTime());
	    sensor3.setOriginTime( sqlDate);
	    sensor3.setUnit("ml");
	    sensor3.setSensorGroup("Fuel");
	    Random r = new Random();
	    double random = 0 + r.nextDouble() * (50000 - 0);
	    sensor3.setSensorValue(String.valueOf(random));
	    config.sensorDataKafkaTemplate().send("sensor",sensor3);
	}
}
