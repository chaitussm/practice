package actionclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "H:\\Selenium WebDriver\\SELENIUM\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
	    driver.manage().window().maximize();
		
		driver.get("http://jqueryui.com/resources/demos/droppable/default.html");
		
		Thread.sleep(5000);
		
		Actions act = new Actions(driver);
		
		
		WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']"));
		
		WebElement drop = driver.findElement(By.xpath("//div[@id='droppable']"));
		
		
		act.dragAndDrop(drag, drop).build().perform();
		
		
		
		
	}

}
