package All;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sob{
	
	public static void main(String[]args){
		//initialize with firefoxdriver
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://store.demoqa.com/");
		
		driver.findElement(By.partialLinkText("All Product")).click();
		
		
	    
		
		
	}
}