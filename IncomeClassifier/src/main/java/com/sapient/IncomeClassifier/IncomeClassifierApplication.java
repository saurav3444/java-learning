package com.sapient.IncomeClassifier;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IncomeClassifierApplication {

	public static void main(String[] args) throws FilloException {
		SpringApplication.run(IncomeClassifierApplication.class, args);

	}

}
