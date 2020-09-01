package com.sapient.IncomeClassifier;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Recordset;

@RestController
public class Controller {

	InputImplementation input;

	@GetMapping("/avg")
	public List<AverageIncome> averageController() throws FilloException {

		List<AverageIncome> list = new ArrayList<AverageIncome>();
		input = new InputImplementation();

		// adding average income of specific country's gender to list
		list.add(input.populate("INR", "F"));
		list.add(input.populate("INR", "M"));
		list.add(input.populate("GBP", "F"));
		list.add(input.populate("GBP", "M"));
		list.add(input.populate("HKD", "F"));
		list.add(input.populate("HKD", "M"));
		list.add(input.populate("SGP", "F"));
		list.add(input.populate("SGP", "M"));
		list.add(input.populate("USD", "F"));
		list.add(input.populate("USD", "M"));

		return list;
	}

}
