package com.github.aimmoth.springBootScalaJs.controller;

import com.github.aimmoth.springBoot3ScalaJs.shared.Logic;
import com.github.aimmoth.springBootScalaJs.controller.request.CalculationRequest;
import com.github.aimmoth.springBootScalaJs.controller.response.CalculationResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BackendController {

	@PostMapping("/calculate")
	public CalculationResponse postCalculate(@RequestBody CalculationRequest request) {
		var logic = new Logic();
		var calculatedResult = logic.calculate(request.getValue());

		var response = new CalculationResponse();
		response.setValue(calculatedResult);
		return response;
	}
}
