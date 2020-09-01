package com.sapient.IncomeClassifier;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

public class InputImplementation implements InputFileInterface {

	@Override
	public Recordset excelFileAsInput(String query) throws FilloException {

		Fillo filo = new Fillo();
		Connection connection = filo.getConnection("src/main/resources/Sample input file Assignment 3.xlsx");

		// applying the query on excel table
		Recordset rs = connection.executeQuery(query);

		return rs;
	}

	public AverageIncome populate(String con, String gen) throws FilloException {

		int count = 0;
		float sum = 0;

		// query for specific country and gender
		String query = "select * from Sample_Input where Currency='" + con + "' and Gender='" + gen + "'";
		Recordset rs = excelFileAsInput(query);

		// calculating average of that country and specific gender
		while (rs.next()) {
			sum += Float.parseFloat(rs.getField("Average_Income"));
			count++;
		}

		float ans = sum / count;

		// converting to USD
		if (con == "INR")
			ans /= 66;
		else if (con == "HKD")
			ans /= 8;
		else if (con == "SGP")
			ans /= 1.5;
		else if (con == "GBP")
			ans /= 0.67;

		return new AverageIncome(con, gen, ans);

	}

}
