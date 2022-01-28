package Assignmentday4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Vtiger {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", ".\\executable\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
	
		// login page title //
		String loginpagetitle = driver.getTitle();
		 System.out.println("login page title: "+ driver.getTitle());
	
		 //Username clear //
		 WebElement login=driver.findElement (By.id("username"));
		 login.clear();
	
		 // login username //
    	 driver.findElement(By.id("username")).sendKeys("admin");
	
    	 //password clear// 
		 WebElement login1=driver.findElement (By.id("password"));
		login1.clear();
	
		// login password //
		driver.findElement(By.id("password")).sendKeys("Test@123");
	
		//login //	
	    WebElement loginButton=driver.findElement(By.className("button"));
	    loginButton.click();
	 

	 // SignOut manually // 
	    WebElement logoutButton=driver.findElement(By.className("userName"));
	    logoutButton.click();
	    WebElement logoutButton1=driver.findElement(By.id("menubar_item_right_LBL_SIGN_OUT"));
	    logoutButton1.click();
	//close the browser//
	   // driver.close();
	    }

}
