package com.sapient.feeCalculator;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codoid.products.exception.FilloException;

@RestController
public class FeeController {

	InputFormatImplementation input;

	@GetMapping("/fee")
	public List<FeeSummary> summaryReport() throws FilloException, FileNotFoundException, IOException {

		
		input = new InputFormatImplementation();
		//calling fee details
		List<FeeSummary> summaryList = input.feeSummaryReport();
		
		return summaryList;

	}
}
