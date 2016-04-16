package com.mobile.app.rest;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mobile.app.controller.model.ui.Car;

@Controller
public class CarRestWebService {
	private Map<String, Car> carGarage = new HashMap<>();

	public CarRestWebService() {
		Car c1 = new Car("C1001", "Chevrolet Camaro", "Z06", "Locksmith", "V8", "camaro.jpg");
		Car c2 = new Car("C1002", "Dodge Challenger", "Hellcat", "Hennessey", "V8", "challenger.jpg");
		Car c3 = new Car("C1003", "Ford Mustang", "Shelby", "Edmund", "V8", "mustang.jpg");
		Car c4 = new Car("C1004", "Toyota Prius", "Prius C", "Edmund", "4 cylinder", "prius.jpg");
		Car c5 = new Car("C1005", "BMW", "i8", "autoexpress", "3 cylinder", "bmwi8.jpg");
		Car c6 = new Car("C1006", "Mercedes-Benz", "AMG C63 Coupe", "Carscoops", "V8 Biturbo engine",
				"mercedescoupe.jpg");

		carGarage.put("C1001", c1);
		carGarage.put("C1002", c2);
		carGarage.put("C1003", c3);
		carGarage.put("C1004", c4);
		carGarage.put("C1005", c5);
		carGarage.put("C1006", c6);
	}

	@RequestMapping(value = "/carDetails", method = RequestMethod.GET)
	@ResponseBody
	public Car addCar(@RequestParam("cid") String cid) {
		Car car = carGarage.get(cid);
		return car;
	}
}
