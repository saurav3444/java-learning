package com.sapient.feeCalculator;

public class Transaction {

	private String External_Transaction_Id, Client_Id, Security_Id, Transaction_Type;
	private String Transaction_Date;
	private String Marke_Value;
	private String Priority_Flag;
	
	public Transaction() {
		
	}
	
	public Transaction(String external_Transaction_Id, String client_Id, String security_Id, String transaction_Type,
			String transaction_Date, String marke_Value, String priority_Flag) {
		super();
		External_Transaction_Id = external_Transaction_Id;
		Client_Id = client_Id;
		Security_Id = security_Id;
		Transaction_Type = transaction_Type;
		Transaction_Date = transaction_Date;
		Marke_Value = marke_Value;
		Priority_Flag = priority_Flag;
	}

	public String getExternal_Transaction_Id() {
		return External_Transaction_Id;
	}

	public String getClient_Id() {
		return Client_Id;
	}

	public String getSecurity_Id() {
		return Security_Id;
	}

	public String getTransaction_Type() {
		return Transaction_Type;
	}

	public String getTransaction_Date() {
		return Transaction_Date;
	}

	public String getMarke_Value() {
		return Marke_Value;
	}

	public String getPriority_Flag() {
		return Priority_Flag;
	}

	@Override
	public String toString() {
		return "Transaction [External_Transaction_Id=" + External_Transaction_Id + ", Client_Id=" + Client_Id
				+ ", Security_Id=" + Security_Id + ", Transaction_Type=" + Transaction_Type + ", Transaction_Date="
				+ Transaction_Date + ", Marke_Value=" + Marke_Value + ", Priority_Flag=" + Priority_Flag + "]";
	}
	
	
	
	
}
