package Frames_TestngPractice;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Task {
	
	ChromeDriver driver;
	@BeforeMethod
	public void IframeExample() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/nested_frames");
	}
	      
		
	@Test
	
	  public void Work_1() {
		
			driver.switchTo().frame(1);
	System.out.println(driver.findElement(By.xpath("//body[contains(text(),'BOTTOM')]")).getText());
			
			driver.switchTo().defaultContent();
			
			driver.switchTo().frame(0);
			driver.switchTo().frame(2);
		System.out.println(driver.findElement(By.xpath("//body[contains(text(),'RIGHT')]")).getText());
		
	     	driver.switchTo().defaultContent();
	     	
		    driver.switchTo().frame(0);
		    driver.switchTo().frame(0);
		System.out.println(driver.findElement(By.xpath("//body[contains(text(),'LEFT')]")).getText());
	  

		}
	
	      @Test
		
		  public void Work_2() {
			 
			    driver.switchTo().frame(0);
			    driver.switchTo().frame(0);
			System.out.println(driver.findElement(By.xpath("//body[contains(text(),'LEFT')]")).getText());
		  
		 	    driver.switchTo().defaultContent();

		 		driver.switchTo().frame(1);
		 		System.out.println(driver.findElement(By.xpath("//body[contains(text(),'BOTTOM')]")).getText());
		 				
		 	    driver.switchTo().defaultContent();

		 		driver.switchTo().frame(0);
				driver.switchTo().frame(1);
			System.out.println(driver.findElement(By.id("content")).getText());
			  
			  
		  }
	      
	
	
		  
	  }
	


