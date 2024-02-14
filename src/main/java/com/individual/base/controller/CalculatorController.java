package com.individual.base.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class CalculatorController {

	@GetMapping(value = "/calculate")
	public String calculate(@RequestParam Integer num1, @RequestParam Integer num2, @RequestParam String operation) {
		int result;
		switch (operation) {
			case "add":
				result = num1 + num2;
				return "The addition of " + num1 + " and " + num2 + " is " + result;
			case "subtract":
				result = num1 - num2;
				return "The subtraction of " + num1 + " and " + num2 + " is " + result;
			case "multiply":
				result = num1 * num2;
				return "The multiplication of " + num1 + " and " + num2 + " is " + result;
			case "divide":
				if (num2 == 0) {
					return "Division by zero is not allowed.";
				}
				result = num1 / num2;
				return "The division of " + num1 + " and " + num2 + " is " + result;
			default:
				return "Invalid operation.";
		}
	}

}