package com.sapient.IncomeClassifier;

public class AverageIncome {

	private String Country, Gender;
	private float Average_Income;
	
	public AverageIncome( String Country, String Gender, float Average_Income) {
		
		this.Average_Income = Average_Income;
		this.Country = Country;
		this.Gender = Gender;
	}

	public AverageIncome( ) {
		
	}
	public String getCountry() {
		return Country;
	}

	public String getGender() {
		return Gender;
	}

	public float getAverage_Income() {
		return Average_Income;
	}
	
	
}