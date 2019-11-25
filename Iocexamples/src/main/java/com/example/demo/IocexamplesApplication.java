package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.model.PartnerDriver;
import com.example.demo.model.Payment;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication

@Slf4j
public class IocexamplesApplication {

	public static void main(String[] args) {
//		SpringApplication.run(IocexamplesApplication.class, args);
		ConfigurableApplicationContext ctx =SpringApplication.run(IocexamplesApplication.class, args);
		
		Payment payment =ctx.getBean(Payment.class);
		
		PartnerDriver driver =ctx.getBean(PartnerDriver.class);
		
		driver.setDriveId(123);
		driver.setDriverName("Abi");
		driver.setMobileNumber(801515098);
		driver.setRating(10.05);
		log.info(payment.toString());
		log.info(driver.toString());
		
		
		
	}

}
