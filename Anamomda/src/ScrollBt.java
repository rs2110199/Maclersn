

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScrollBt {
	  public static WebDriver driver;
	  @Test
	public static void scrollBy() throws InterruptedException {
		
	/*	System.setProperty("webdriver.chrome.driver", "C:\\Users\\om\\Desktop\\93\\chrome33\\chromedriver.exe");
		  driver = new ChromeDriver();
          driver.navigate().to("http://www.google.com/");
          Thread.sleep(15000);
          
          driver.navigate().to("http://omayo.blogspot.com/");
          Thread.sleep(10000);
          driver.manage().window().maximize();
          Thread.sleep(10000);
		  JavascriptExecutor js = (JavascriptExecutor)driver; 
    	  
          js.executeScript("window.scrollBy(0,1500)","");
      
            WebElement upload = driver.findElement(By.id("uploadfile"));
            upload.sendKeys("C:\\\\Users\\\\om\\\\Documents\\\\noman123.csv");
	        Thread.sleep(10000);  
	        
              driver.close();     */
          
          
          
	        }
	  @Test()
	  public static void Calender() throws InterruptedException {
		
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\om\\Desktop\\93\\chrome33\\chromedriver.exe");
		  driver = new ChromeDriver();
          driver.navigate().to("http://www.google.com/");
          Thread.sleep(15000);
          driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
  		  driver.manage().window().maximize();
          Thread.sleep(15000);
          
           
          
          
          driver.findElement(By.id("datepicker")).click();
		  Thread.sleep(15000);
 ArrayList<WebElement> allDates= (ArrayList<WebElement>) driver.findElements(By.xpath("//table/tbody/tr/td"));
		  String Som= ((WebElement) allDates).getText();
	        System.out.println("the list "+ " "+ Som);
		  
	  }
           
              
            
           
            
		
	}

	  
	  

