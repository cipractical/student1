package features.calculator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import java.util.concurrent.TimeUnit;
//import calculator.GoogleCalculator;

public class GoogleCalculatorTester 
{
	//private GoogleCalculator myCalc;
	private WebDriver driver;
	
	public void launchGoogleCalculator()
	{
		driver = new FirefoxDriver();
		//Set implicit wait of 5 seconds and launch google
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.google.co.uk");
		//myCalc = new GoogleCalculator();
	}
	
	public void submitEquation( String equation )
	{
		//Write term in google textbox
		WebElement googleTextBox= driver.findElement(By.id("lst-ib"));
		googleTextBox.sendKeys(equation);
		//Click on searchButton
		WebElement searchButton= driver.findElement(By.name("btnG"));
		searchButton.click();
		//myCalc.submitEquation( equation );
	}
	
	public String getResult()
	{
		//Get result from calculator
		WebElement calculatorTextBox= driver.findElement(By.id("cwos"));
		String actualResult= calculatorTextBox.getText();
		driver.quit();
		return (actualResult);
		//return myCalc.getResult();
	}
}
