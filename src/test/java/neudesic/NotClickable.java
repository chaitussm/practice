package neudesic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NotClickable {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:/Users/Surya/Downloads/chromedriver_win32/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//li[1]/span[@class = '_1QZ6fC _3Lgyp8']"));
	driver.findElement(By.xpath("//li[2]/a[@title='Mi']"));
	
	}

}
