package com.sapient.IncomeClassifier;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Recordset;

public interface InputFileInterface {
	
	Recordset excelFileAsInput(String query) throws FilloException;

}
