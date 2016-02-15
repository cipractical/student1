package features.calculator;

import calculator.GoogleCalculator;

public class GoogleCalculatorTester 
{
	private GoogleCalculator myCalc;
	
	public void launchGoogleCalculator()
	{
		myCalc = new GoogleCalculator();
	}
	
	public void submitEquation( String equation )
	{
		myCalc.submitEquation( equation );
	}
	
	public String getResult()
	{
		return myCalc.getResult();
	}
}
