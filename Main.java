package com.lts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.lts.vehilemileage.VehicleDetails;

@SpringBootApplication
public class TrailsApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(TrailsApplication.class, args);
	}


		@Autowired
		ApplicationContext context;
		@Override
		public void run(String... args) throws Exception {

		VehicleDetails vehicleDetails =context.getBean("vehicleDetails",VehicleDetails.class);
		vehicleDetails.getMileage("Car");
		vehicleDetails.getMileage("Bike");
		
	}

}
