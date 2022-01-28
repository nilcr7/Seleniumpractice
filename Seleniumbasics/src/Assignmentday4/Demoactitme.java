package Assignmentday4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demoactitme {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
      	ChromeDriver driver = new ChromeDriver();
      	
      	driver.get("https://demo.actitime.com/login.do");
        
      	driver.manage().window().maximize();
         
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        //login
        driver.findElement(By.name("username")).sendKeys("admin");
        driver.findElement(By.name("pwd")).sendKeys("manager");
        WebElement loginbutton=driver.findElement(By.id("loginButton"));
        Thread.sleep(2000);
        loginbutton.click();
        
        //task tab click
        WebElement taskbutton=driver.findElement(By.id("container_tasks"));
        Thread.sleep(2000);
        taskbutton.click();
        
        //validate task page
		 String actualurl=driver.getTitle();
		 String expectedurl="https://demo.actitime.com/tasks/tasklist.do";
		 String actualurl1=driver.getCurrentUrl();
		  if (expectedurl.equals(actualurl1))
		 System.out.println("The url is match");
		  else
	     System.out.println("The url not match");
		 
		//click on add new
		  WebElement addnewbutton=driver.findElement(By.className("addNewContainer"));
	      Thread.sleep(2000);
	      addnewbutton.click();
	    //click on new task
	    WebElement taskbutton1=driver.findElement(By.xpath("//div[@class=\"dropdownContainer addNewMenu\"]"));
	    Thread.sleep(2000);
	    taskbutton1.click();
	    
	   // select customer
	   WebElement selectcustomer=driver.findElement(By.xpath("//div[@class=\"customerSelector customerOrProjectSelector selectorWithPlaceholderContainer\"]"));
	   Thread.sleep(2000);
	   selectcustomer.click();
	
	   WebElement newcustomer=driver.findElement(By.xpath("//div[@class=\\'itemRow \\']"));
	   Thread.sleep(2000);
       newcustomer.click();
	   
      //enter name
	 WebElement name=driver.findElement(By.xpath("//input[@class=\'newCustomer newCustomerProjectField inputFieldWithPlaceholder\']"));
	 name.sendKeys("Nilesh");
	
	 WebElement project=driver.findElement(By.xpath("//input[@class='newProject newCustomerProjectField inputFieldWithPlaceholder']"));
	 project.sendKeys("Andriod Testing");
	
	 WebElement testing=driver.findElement(By.xpath("//input[@placeholder=\"Enter task name\"]"));
	 testing.sendKeys("Testing");
	 

	WebElement createtasks=driver.findElement(By.xpath("//div[@class=\"components_button withPlusIcon\"]//child::div[1]"));
	createtasks.sendKeys("Testing");
	createtasks.click();
	 
	 

	}
	
	
	

}
