package WebTables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo {
	ChromeDriver driver;
	@BeforeMethod
	public void web() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/tables");	
		
	}
	@Test
	public void method() {
		
	String ss=driver.findElement(By.xpath("//table[@id='table1']/tbody/tr[2]/td[3]")).getText();
	System.out.println(ss);
	
	}
	
	@Test
	
	public void method1() {
		
	int rowcount=driver.findElements(By.xpath("//table[@id='table1']/tbody/tr")).size();
	int columancount=driver.findElements(By.xpath("//table[@id='table1']/tbody/tr[1]/td")).size();
	
	
	for(int i=1;i<=rowcount;i++) {
		
		for(int j=1;j<=columancount;j++) {
			
			System.out.print(driver.findElement(By.xpath("//table[@id='table1']/tbody/tr["+i+"]/td["+j+"]")).getText()+ "    ");
		}
		System.out.println();
	}
		
	}
	
    @Test
    public void method2() {
    	
    	int rowcount=driver.findElements(By.xpath("//table[@id='table1']/tbody/tr")).size();
    	int columancount=driver.findElements(By.xpath("//table[@id='table1']/tbody/tr[1]/td")).size();
    List<WebElement>ss=driver.findElements(By.xpath("//table[@id='table1']/thead/tr/th/span"));
    
    for(int i=0;i<ss.size();i++) {
    	
    	System.out.print(ss.get(i).getText()+"   ");
    }
    	System.out.println();
    	for(int i=1;i<=rowcount;i++ ) {
    		for(int j=1;j<=columancount;j++) {
    		System.out.print(driver.findElement(By.xpath("//table[@id='table1']/tbody/tr["+i+"]/td["+j+"]")).getText()+"  ");	
    		}
    		System.out.println();
    	}
    }

  @Test
  public void method3() {
	  
	  
	  
	  
  }
    
 	
}
