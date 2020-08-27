package com.sapient.calculator.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.sapient.calculator.dao.CalculatorRepo;
import com.sapient.calculator.model.Calculator;

@Controller
public class MyController {

	@Autowired
	CalculatorRepo repo;
	@Autowired
	Calculator calculator;

	@RequestMapping("/")
	public String home() {
		return "home.jsp";
	}

	@RequestMapping("/Calculator")
	public String addNumbers(Calculator calc) {

		calculator = calc;
		return "home.jsp";

	}

	@RequestMapping("/add")
	public String add(Model model) {

		int res = 0;
		res = calculator.getNum1() + calculator.getNum2();
		model.addAttribute("res", res);

		calculator.setVal(res);
		calculator.setOpr("+");
		repo.save(calculator);

		try {

		} catch (Exception e) {
			return "error.jsp";
		}

		return "add.jsp";
	}

	@RequestMapping("/div")
	public String div(Model model) {

		int res = 0;
		try {

			res = calculator.getNum1() / calculator.getNum2();
			model.addAttribute("res", res);
			calculator.setVal(res);
			calculator.setOpr("/");
			repo.save(calculator);

		} catch (Exception e) {
			return "error.jsp";
		}

		return "div.jsp";
	}

	@RequestMapping("/mul")
	public String mul(Model model) {

		int res = 0;
		try {

			res = calculator.getNum1() * calculator.getNum2();
			model.addAttribute("res", res);
			calculator.setVal(res);
			calculator.setOpr("*");
			repo.save(calculator);

		} catch (Exception e) {
			return "error.jsp";
		}

		return "mul.jsp";
	}

	@RequestMapping("/sub")
	public String sub(Model model) {

		int res = 0;
		try {

			res = calculator.getNum1() - calculator.getNum2();
			model.addAttribute("res", res);
			calculator.setVal(res);
			calculator.setOpr("-");
			repo.save(calculator);

		} catch (Exception e) {

			return "error.jsp";
		}

		return "sub.jsp";
	}
	
	@RequestMapping("/history")
	public String history(Model model) {
		
		
		
		 System.out.println("heloo");
		try {
			
			String s="";
			List<Calculator> list = (List<Calculator>) repo.findAll();
		    
			for (Calculator temp : list) {
	            s+=(temp.toString());
	            s+="\n";
	            
	            System.out.println(s);
	        }
			
			model.addAttribute("str", s);
			
		} catch (Exception e) {

			return "error.jsp";
		}

		  return "history.jsp";
	        
	}

}
