package calculator;

public class GoogleCalculator 
{
		private String calculationOutput=null;
		
		public void submitEquation(String equation) 
		{
			if (equation.contains("+"))
			{
				String[] inputValues = equation.split("\\+");
				int outputValue = Integer.valueOf(inputValues[0]) + Integer.valueOf(inputValues[1]);
				calculationOutput = String.valueOf(outputValue);
			}
			//To Do -other types of calculation
		}
		
		public String getResult() 
		{
			return calculationOutput;
		}
}
