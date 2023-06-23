package handling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Handlingcalender {

	public static void main(String[] args) throws Exception {

     WebDriver driver = new FirefoxDriver();
     
     driver.manage().window().maximize();
     
     
     driver.get("https://www.redbus.in/");
     driver.findElement(By.xpath(".//*[@id='onward_cal']")).click();
     Thread.sleep(3000);
     
     List<WebElement>daylist = driver.findElements(By.xpath(".//*[@id='rb-calendar_onward_cal']/table/tbody/td"));
     
    int listsize =  daylist.size();
    
    
    for(int i=0;i<listsize;i++){
    	
    	String date = daylist.get(i).getText();
    	
    	if(date.equals("13")){
    		daylist.get(i).click();
    		break;
    	}
    }
    
    
     
     
		
	}

}
