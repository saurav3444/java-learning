package com.sapient.Numbers;

public class Fig_to_Words {
	
	
	public static void figToWords(String fig)
	{		
		int n = fig.length();
		
		String[] place = {"ones", "tens", "Hundred", "Thousand"};
		String[] tens = {"ten","twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
		
		String[] digit = {"", "one", "two", "three", "four", "five", "six",
						"seven", "eight", "nine" };
		
		String word="";
		
		for(int i=0;i<n;i++)
		{
			int num = fig.charAt(i) - 48;
			
			if(place[n-1-i]=="ones")
			{
				word=word+digit[num]+" only";
			}
			else
			if(num!=0 && place[n-1-i]=="tens")
			{
				word=word+"and "+ tens[num-1]+" ";
			}
			else if(num!=0)
			word=word+digit[num]+" "+place[n-1-i]+" ";
		}
		
		System.out.println(word);
	}

}
