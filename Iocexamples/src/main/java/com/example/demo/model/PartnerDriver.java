package com.example.demo.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
@Component
public class PartnerDriver {
	
	private long driveId;
	private String driverName;
	private long mobileNumber;
	public double rating;
	
	public PartnerDriver() {
		super();
		log.info("Parter Driver initialised");
	}

	public PartnerDriver(long driveId, String driverName, long mobileNumber, double rating) {
		super();
		this.driveId = driveId;
		this.driverName = driverName;
		this.mobileNumber = mobileNumber;
		this.rating = rating;
	}
	
	


}
