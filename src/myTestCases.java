import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class myTestCases {

	String theWebsiteURL ="http://www.saucedemo.com/";
	
	WebDriver driver = new ChromeDriver();
	
	@BeforeTest
	
	public void myBeforeTest() {
		
		driver.get(theWebsiteURL);
		WebElement emailInput = driver.findElement(By.xpath("//*[@id=\"user-name\"]"));
		emailInput.sendKeys("standard_user");
		
		WebElement passInput = driver.findElement(By.xpath("//*[@id=\"password\"]"));
		passInput.sendKeys("secret_sauce");
		
		WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"login-button\"]"));
		loginButton.click();
		
	}
	
	@Test
	
	public void AddAllItemsToTheCart() {
		
		List <WebElement>AddtoCartButtons =  driver.findElements(By.className("btn"));
		
		for(int i = 0; i< AddtoCartButtons.size(); i++) {
			AddtoCartButtons.get(i).click();
			
			
		}
		}
	
	
	@AfterTest
	
	public void myAfterTest() {}
}
