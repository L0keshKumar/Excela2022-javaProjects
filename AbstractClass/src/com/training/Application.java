package com.training;

import com.training.model.HealthInsurance;
import com.training.model.Insurance;
import com.training.model.LifeInsurance;
import com.training.model.VehicleInsurance;

public class Application {

	public static void printPremium(Insurance object) {
		System.out.println("Premium:-"+object.calculatePremium());
	}
	public static void main(String[] args) {
		VehicleInsurance car = new VehicleInsurance(1001, "lokesh",
													"car", 2018);
		printPremium(car);
		LifeInsurance life = new LifeInsurance(1010, "Lokesh", 50);
		printPremium(life);
		String[] illness= {"thyroid"};
		HealthInsurance health=new HealthInsurance(2020, "loki",illness);
		printPremium(health);
	}

}
