package seleniumbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:/Users/Surya/Downloads/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("9535868286");
		driver.findElement(By.id("pass")).sendKeys("undisputed");
		driver.findElement(By.id("u_0_s")).sendKeys("Mani");
		driver.findElement(By.id("u_0_u")).sendKeys("surya");
		driver.findElement(By.id("u_0_x")).sendKeys("9535868286");
		driver.findElement(By.id("u_0_14")).sendKeys("amma143");
		
		


		
	}

}
