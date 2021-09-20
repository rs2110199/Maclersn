import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScrollBt {
	  public WebDriver driver;
	  @Test
	public void scrollBy() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\om\\Desktop\\93\\chrome33\\chromedriver.exe");
		  driver = new ChromeDriver();
          driver.navigate().to("http://www.google.com/");
          Thread.sleep(15000);
          
          driver.navigate().to("http://omayo.blogspot.com/");
          Thread.sleep(10000);
          driver.manage().window().maximize();
          Thread.sleep(10000);
		  JavascriptExecutor js = (JavascriptExecutor)driver; 
    	 /* js.executeScript("window.scrollBy(0,document.body.scrollHeight)"); */
          js.executeScript("window.scrollBy(0,1500)","");
      
    	 
         /* WebElement Element = driver.findElement(By.className("dropdown"));
            
		/*js.executeScript("arguments[0].scrollIntoView();", Element);
           Thread.sleep(15000);
    	 /* driver.findElement(By.xpath("//*[@id=\"HTML34\"]/div[1]/div/button")).click();  */
    	  Thread.sleep(15000);
    	   
		
           
           
		
	}
	  
	  
}
