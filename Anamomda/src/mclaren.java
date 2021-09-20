import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import com.tutorialsninja.automation.framework.Elements;
import com.tutorialsninja.automation.pages.ForgottenPasswordPage;

import org.openqa.selenium.support.ui.Select;




public class mclaren {

         public WebDriver driver;
         String application = "http://omayo.blogspot.com/";
	     
         
		@BeforeClass
		public  void testclass() {
		
          System.setProperty("webdriver.chrome.driver", "C:\\Users\\om\\Desktop\\93\\chrome33\\chromedriver.exe");
		  driver = new ChromeDriver();
		 
          driver.navigate().to("http://www.google.com/");
          driver.manage().window().maximize(); 
          driver.get(application);
	     
		}
	     @Test(priority=1)
	      public void test2() throws InterruptedException {
	    		
             /*   Thread.sleep(15000); */
                driver.findElement(By.xpath("//*[@id=\"ta1\"]")).sendKeys("Rajat sharma how sir how are you");
             /*   Thread.sleep(15000);  */
                driver.findElement(By.xpath("//*[@id=\"HTML11\"]/div[1]/textarea")).clear();
              /*  Thread.sleep(15000); */
                driver.findElement(By.xpath("//*[@id=\"HTML11\"]/div[1]/textarea")).sendKeys("My name is Khan");
               /* Thread.sleep(15000); */
	     }
	     

              @Test(priority=2)
              public void test31() throws InterruptedException {
	          driver.findElement(By.xpath("//*[@id=\"prompt\"]")).click();
	          /* Thread.sleep(15000); */
	          driver.switchTo().alert().sendKeys("My name is rajat sharma");
	          /* Thread.sleep(15000); */
	          driver.switchTo().alert().accept();
	          /* Thread.sleep(15000); */

	
}      
              @Test(priority=3)
              public void test32() throws InterruptedException {
	          driver.findElement(By.cssSelector("#alert1")).click();
	          /* Thread.sleep(15000); */
	          String expected="Hello";
	          String  actual  = driver.switchTo().alert().getText();
	          Assert.assertEquals(actual,expected); 
              driver.switchTo().alert().accept();
              /* Thread.sleep(15000); */
	     }
              @Test(priority=4)
              public void test33() throws InterruptedException {
	          driver.findElement(By.xpath("//*[@id=\"HTML22\"]/div[1]/input")).sendKeys("shubham");
	          Thread.sleep(10000);
              } 
              @Test(priority=5)
              public void test34() throws InterruptedException {
            	  
            	   List <WebElement>  row =  (List<WebElement>) driver.findElements(By.xpath("//*[@id=\"table1\"]/tbody/tr"));
	               System.out.println("the number of row"+ " "+ row.size());
	               Thread.sleep(10000);
	               
	               List<WebElement> col =(List<WebElement>) driver.findElements(By.xpath("//*[@id=\"table1\"]/tbody/tr[2]/td"));
	               System.out.println("the number of col"+ " "+ col.size());
	               Thread.sleep(10000);
	               
	           
	               for (WebElement tdata: driver.findElements(By.tagName("tr"))) {
	            	
	            	   System.out.println(tdata.getText()); 
	               
	               }
	               
	               for(WebElement OrderList: driver.findElements(By.tagName("li")))
	            		   {
	            	      System.out.println(OrderList.getText());
	            		   }
	              
              }
	               
              @Test(priority=6)
              public  void delaydropdown() throws InterruptedException
              
              {   
            	  
            	  JavascriptExecutor js = (JavascriptExecutor)driver; 
            	  js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
                  js.executeScript("window.scrollBy(0,1500)","");
                  Thread.sleep(30000);
            	 System.out.println("Rajatsharma");
                 /* WebElement Element = driver.findElement(By.className("dropdown"));
                    
				/*js.executeScript("arguments[0].scrollIntoView();", Element);  */
                  Thread.sleep(15000);
            	 driver.findElement(By.xpath("//*[@id=\"HTML34\"]/div[1]/div/button")).click();
            	  Thread.sleep(30000);
                  driver.findElement(By.xpath("//*[@id=\"myDropdown\"]/a[1]")).click();  
                  Thread.sleep(15000);   	  
            	  
              }
              
	             @Test(priority=7)  
             public void doubleclick() throws InterruptedException {
	            	
	            	 driver.navigate().back(); 
	            	 Thread.sleep(15000);
	            	 Actions act = new Actions(driver);
	                 WebElement dclick = driver.findElement(By.xpath("//*[@id=\"testdoubleclick\"]"));			 
	            	 act.doubleClick(dclick).perform();
	            	 Thread.sleep(15000);
	             }
	             
	             
	             @Test(priority=8)
	           	 public  void selectmultpleoption() throws InterruptedException {
	            	 Thread.sleep(15000);
	            		  Select ref = new Select(driver.findElement(By.xpath("//*[@id=\"multiselect1\"]")));
	            		  System.out.println(ref.isMultiple());
	            		  if (ref.isMultiple())
	            		 {
	            			 ref.selectByIndex(0);
	            			 ref.selectByIndex(1);
	            			 ref.selectByIndex(2);
	            			
	
	            	     }
	            	 
	            	 Thread.sleep(15000);
	            	 
	             }
	                  @Test(priority=9)
	                  public void textverification() {
	                	  String actual = driver.findElement(By.xpath("//p[@id='pah']")).getText();
	                	/*  System.out.println(actual);  */
	                	  String expected = "PracticeAutomationHere";
	                	  Assert.assertEquals(expected,actual);
	                	  
	                	  
	                	  String real = driver.findElement(By.xpath("//*[@id=\"Text1\"]/div[1]")).getText();
	                	  String complex ="This is a sample Text on this page. This is a sample Text on this page. This is a sample Text on this page.";
	                	  Assert.assertEquals(real,complex);
	                	  
	                	  
	                	  
	                  }
	                  
	                  @Test(priority=10)
	                  public void iframe() throws InterruptedException {
	                	  driver.switchTo().frame("iframe2");
	                	  Thread.sleep(15000);
	                /*  String expect= driver.findElement(By.xpath("/html/body/h1")).getText();
	                	  System.out.println(expect);
	                	  */
	                	  
	                	  
	                	  
	                  }
	                  
	            
              
              
	      @AfterClass
	      public void test3() throws InterruptedException {
	       driver.close();

}
}
