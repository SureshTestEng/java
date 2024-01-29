package JavascriptExecuator;


import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import net.bytebuddy.asm.Advice.Argument;

public class Amazon {
	
	@Test
	
	public void example() throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	//	Thread.sleep(2000);
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500);");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,500);");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,500);");
		WebElement ss=driver.findElement(By.xpath("//span[@class='action-inner']"));
		js.executeScript("arguments[0].click()", ss);
		
		
	}

}
