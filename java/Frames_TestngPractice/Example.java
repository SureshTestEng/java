package Frames_TestngPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
 
public class Example {

	ChromeDriver driver;
	@BeforeMethod
	public void IframeExample() {
	driver=new ChromeDriver();
	   driver.manage().window().maximize();
	}	
	@Test
	public void verifyingiFrames() {
	driver.get("https://the-internet.herokuapp.com/iframe"); 
	WebElement text=driver.findElement(By.tagName("h3"));
	System.out.println(text.getText());
	driver.switchTo().frame(0);
	WebElement para=driver.findElement(By.tagName("p"));
	System.out.println(para.getText());
	
	}
	
@Test

public void nestedFrames() {
	
	driver.get("https://the-internet.herokuapp.com/nested_frames");
	  driver.switchTo().frame(1);
    System.out.println(driver.findElement(By.xpath("//body[contains(text(),'BOTTOM')]")).getText());

}

@Test
public void NestedFrameNasted() {
	
	driver.get("https://the-internet.herokuapp.com/nested_frames");
    driver.switchTo().frame(0);
    driver.switchTo().frame(1);
    
System.out.println(driver.findElement(By.id("content")).getText());    
    driver.switchTo().defaultContent();
    driver.switchTo().frame(1);
System.out.println(driver.findElement(By.xpath("//body[contains(text(),'BOTTOM')]")).getText());

	
}
	
	

}
