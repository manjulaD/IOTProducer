package com.relay42.iotproducer.config;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.relay42.iotproducer.models.SensorData;

public interface SensorDataRepository extends CrudRepository<SensorData, Integer> {

	//Average
	 @Query(value = "SELECT AVG(sensor_value) FROM ioint.sensor_data s WHERE  s.sensor_group = ?1 AND s.source  = ?2", nativeQuery = true)
	  String findAverageBySourceAndGroup(@Param("sensor_group") String sensor_group,@Param("source") String source);
	 
	 @Query(value = "SELECT AVG(sensor_value) FROM ioint.sensor_data s WHERE  s.source = ?1", nativeQuery = true)
	  String findAverageBySource(@Param("source") String source);
	 
	 @Query(value = "SELECT AVG(sensor_value) FROM ioint.sensor_data s WHERE  s.sensor_group = ?1 ", nativeQuery = true)
	  String findAverageByGroup(@Param("sensor_group") String sensor_group);
	 
	 @Query(value = "SELECT AVG(sensor_value) FROM ioint.sensor_data  ", nativeQuery = true)
	  String findAverage();
	 
	 //Max
	 @Query(value = "SELECT MAX(sensor_value) FROM ioint.sensor_data s WHERE  s.sensor_group = ?1 AND s.source  = ?2", nativeQuery = true)
	  String findMaxBySourceAndGroup(@Param("sensor_group") String sensor_group,@Param("source") String source);
	 
	 @Query(value = "SELECT MAX(sensor_value) FROM ioint.sensor_data s WHERE  s.source = ?1", nativeQuery = true)
	  String findMaxBySource(@Param("source") String source);
	 
	 @Query(value = "SELECT MAX(sensor_value) FROM ioint.sensor_data s WHERE  s.sensor_group = ?1 ", nativeQuery = true)
	  String findMaxByGroup(@Param("sensor_group") String sensor_group);
	 
	 @Query(value = "SELECT MAX(sensor_value) FROM ioint.sensor_data  ", nativeQuery = true)
	  String findMax();
	 
	 
	 //Min
	 @Query(value = "SELECT MIN(sensor_value) FROM ioint.sensor_data s WHERE  s.sensor_group = ?1 AND s.source  = ?2", nativeQuery = true)
	  String findMinBySourceAndGroup(@Param("sensor_group") String sensor_group,@Param("source") String source);
	 
	 @Query(value = "SELECT MIN(sensor_value) FROM ioint.sensor_data s WHERE  s.source = ?1", nativeQuery = true)
	  String findMinBySource(@Param("source") String source);
	 
	 @Query(value = "SELECT MIN(sensor_value) FROM ioint.sensor_data s WHERE  s.sensor_group = ?1 ", nativeQuery = true)
	  String findMinByGroup(@Param("sensor_group") String sensor_group);
	 
	 @Query(value = "SELECT MIN(sensor_value) FROM ioint.sensor_data  ", nativeQuery = true)
	  String findMin();
}
