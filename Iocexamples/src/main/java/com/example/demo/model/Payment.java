package com.example.demo.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Payment {
	@Autowired

	private long triId;
	
	private PartnerDriver driverName;
	@Autowired

	private double amount;
	
	public Payment () {
		super();
		System.out.println("==== Payment constructer called =====");
	}
	public Payment(long triId, PartnerDriver driverName, double amount) {
		super();
		this.triId = triId;
		this.driverName = driverName;
		this.amount = amount;
	}
	
	public long getTriId() {
		return triId;
	}
	public void setTriId(long triId) {
		this.triId = triId;
		System.out.println("set trip id");
	}
	public PartnerDriver getDriverName() {
		return driverName;
	}
	@Autowired
	public void setDriverName(PartnerDriver driverName) {
		this.driverName = driverName;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "Payment [triId=" + triId + ", driverName=" + driverName + ", amount=" + amount + "]";
	}
	

}
