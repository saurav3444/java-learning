package com.sapient.feeCalculator;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class InputFormatImplementation implements InputFormat {
	
	
	//populating transaction table 
	@Override
	public List<Transaction> excelFileAsInput() {

		String csvFile = "src/main/resources/Sample_Data_Fee_Calculator.csv";
		String line = "";
		
		List<Transaction> list = new ArrayList<Transaction>();

		try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

			line = br.readLine();

			while ((line = br.readLine()) != null) {

				// use comma as separator
				String[] data = line.split(",");

				list.add(new Transaction(data[0], data[1], data[2], data[3], data[4], data[5], data[6]));

			}
			return list;

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	
	//accepting transaction details and calculating fee and returning fee Details
	public List<FeeSummary> feeSummaryReport() {

		List<Transaction> listTransaction = excelFileAsInput();
		List<FeeSummary> feeSummaries = new ArrayList<FeeSummary>();

		for (Transaction t : listTransaction) {

			float fees = 0;

			if (t.getTransaction_Type().equals("BUY") || t.getTransaction_Type().contentEquals("SELL")) {

				fees = 10f;
			} else {

				if (t.getPriority_Flag().equals("Y")) {

					fees = 500f;
				} else {

					if (t.getTransaction_Type().equals("WITHDRAW")) {
						fees = 100f;
					} else if (t.getTransaction_Type().contentEquals("DEPOSIT")) {

						fees = 50f;
					}
				}
			}

			FeeSummary feeSummary = new FeeSummary(t.getClient_Id(), t.getTransaction_Type(), t.getTransaction_Date(),
					fees, t.getPriority_Flag());

			feeSummaries.add(feeSummary);

		}

		return feeSummaries;

	}
}
