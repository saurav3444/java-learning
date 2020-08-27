package com.sapient.calculator.dao;

import org.springframework.data.repository.CrudRepository;

import com.sapient.calculator.model.Calculator;

public interface CalculatorRepo extends CrudRepository<Calculator, Integer>{
	
}
