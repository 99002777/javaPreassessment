package com.lts.vehilemileage;

import org.springframework.stereotype.Component;

@Component
public class Bike implements MileCal{

	@Override
	public void showMileage() {
		// TODO Auto-generated method stub
		System.out.println("Bike Mileage is ");
	}

}
