package JavascriptExecuator;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Naukri {
	
	
	@Test
	
	public void task() throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	//	Thread.sleep(2000);
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,5);");
		Thread.sleep(2000);
		
		driver.findElement(By.id("expereinceDD")).click();
		WebElement ss=driver.findElement(By.xpath("//span[contains(text(),'3 years')][1]"));
		js.executeScript("arguments[0].click()", ss);
		
	}

}
