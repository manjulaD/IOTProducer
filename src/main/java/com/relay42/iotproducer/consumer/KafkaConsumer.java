package com.relay42.iotproducer.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import com.relay42.iotproducer.config.SensorDataRepository;
import com.relay42.iotproducer.models.SensorData;

@Component
public class KafkaConsumer {
	
	@Autowired
	private SensorDataRepository sensorDataRepository;
	
	@KafkaListener(
			  topics = "sensor", 
			  groupId = "webapp",
			  containerFactory = "sensorListener")
			public void greetingListener(SensorData sensorData) {
			    // process SensorData message
		        System.out.println("Consuming"+sensorData.getSource());
		        sensorDataRepository.save(sensorData);
			}

}
