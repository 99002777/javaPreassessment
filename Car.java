package com.lts.vehilemileage;

import org.springframework.stereotype.Component;

@Component
public class Car implements MileCal{

	@Override
	public void showMileage() {
		// TODO Auto-generated method stub
		System.out.println("car mileage is ");
	}

}
