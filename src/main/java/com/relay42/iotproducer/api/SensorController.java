package com.relay42.iotproducer.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.relay42.iotproducer.config.SensorDataRepository;


@RestController
@RequestMapping(path = "/sensordata")
public class SensorController {
	@Autowired
	private SensorDataRepository sensorDataRepository;
	
	@GetMapping(path = "/average")
	  public String getAverage(@RequestParam (name ="source",required=false)String source,@RequestParam(name="sensor_group", required =false) String sensor_group) {
        
	   if(null != source && null != sensor_group) {
		   return sensorDataRepository.findAverageBySourceAndGroup(sensor_group, source);
	   }else if(null == source && null != sensor_group) {
		   return sensorDataRepository.findAverageByGroup(sensor_group);
			  
	   }else if(null != source && null == sensor_group) {
		   return sensorDataRepository.findAverageBySource(source);
			  
	   }else {
	   // return sensorDataRepository.findAverage();
		   return "provide atleast one from source/sensor_group";
	   }
	  }
	
	
	@GetMapping(path = "/max")
	  public String getMax(@RequestParam (name ="source",required=false)String source,@RequestParam(name="sensor_group", required =false) String sensor_group) {
      
	   if(null != source && null != sensor_group) {
		   return sensorDataRepository.findMaxBySourceAndGroup(sensor_group, source);
	   }else if(null == source && null != sensor_group) {
		   return sensorDataRepository.findMaxByGroup(sensor_group);
			  
	   }else if(null != source && null == sensor_group) {
		   return sensorDataRepository.findMaxBySource(source);
			  
	   }else {
	   // return sensorDataRepository.findAverage();
		   return "provide atleast one from source/sensor_group";
	   }
	  }
	
	
	@GetMapping(path = "/min")
	  public String getMin(@RequestParam (name ="source",required=false)String source,@RequestParam(name="sensor_group", required =false) String sensor_group) {
    
	   if(null != source && null != sensor_group) {
		   return sensorDataRepository.findMaxBySourceAndGroup(sensor_group, source);
	   }else if(null == source && null != sensor_group) {
		   return sensorDataRepository.findMaxByGroup(sensor_group);
			  
	   }else if(null != source && null == sensor_group) {
		   return sensorDataRepository.findMaxBySource(source);
			  
	   }else {
	   // return sensorDataRepository.findAverage();
		   return "provide atleast one from source/sensor_group";
	   }
	  }
	
	
	
	

}
