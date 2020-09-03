package com.sapient.feeCalculator;

public class FeeSummary {
	
	private String Client_Id, Transaction_Type;
	private String Transaction_Date;
	private float Processing_Fee;
	private String Priority_Flag;
	public FeeSummary(String client_Id, String transaction_Type, String transaction_Date,
			float processing_Fee, String priority_Flag) {
		super();
		Client_Id = client_Id;
		Transaction_Type = transaction_Type;
		Transaction_Date = transaction_Date;
		Priority_Flag = priority_Flag;
		Processing_Fee = processing_Fee;
		
	}
	public String getClient_Id() {
		return Client_Id;
	}

	public String getTransaction_Type() {
		return Transaction_Type;
	}
	public String getTransaction_Date() {
		return Transaction_Date;
	}
	public float getProcessing_Fee() {
		return Processing_Fee;
	}
	public String getPriority_Flag() {
		return Priority_Flag;
	}
	@Override
	public String toString() {
		return "FeeSummary [Client_Id=" + Client_Id + ", Transaction_Type="
				+ Transaction_Type + ", Transaction_Date=" + Transaction_Date + ", Processing_Fee=" + Processing_Fee
				+ ", Priority_Flag=" + Priority_Flag + "]";
	}
	
	
}
