package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase1 {
	public static WebDriver driver;
	
	@BeforeTest
	public void setup() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
	}
	
	@Test
	public void doLogin() {
		
		driver.get("http://gmail.com");
		driver.findElement(By.id("identifierId")).sendKeys("asdcsadc");
		driver.findElement(By.id("identifierNext")).click();
		System.out.println(driver.getTitle());
		/*
		 * added comments
		 * 
		 */
	}
	
	@AfterTest
	public void tearDown() {
		
		driver.quit();
	}

	public static void main(String[] args) {

	}

}
