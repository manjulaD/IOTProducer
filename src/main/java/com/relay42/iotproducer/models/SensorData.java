package com.relay42.iotproducer.models;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Entity
@Component
public class SensorData {
 @Id
 @GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String source;
	private Date originTime;
	private String sensorValue;
	private String unit;
	private String sensorGroup;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public Date getOriginTime() {
		return originTime;
	}
	public void setOriginTime(Date originTime) {
		this.originTime = originTime;
	}
	public String getSensorValue() {
		return sensorValue;
	}
	public void setSensorValue(String sensorValue) {
		this.sensorValue = sensorValue;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public String getSensorGroup() {
		return sensorGroup;
	}
	public void setSensorGroup(String sensorGroup) {
		this.sensorGroup = sensorGroup;
	}
	
}
