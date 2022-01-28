package Assignmentday4;

import org.openqa.selenium.firefox.FirefoxDriver;

public class facebook 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "E:\\Software testing\\Eclipse workspace\\Seleniumbasics\\executable\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		// open facebook //
		driver.get("http://facebook.com");
		
		// get home page title //
	    String homepagetitle=driver.getTitle();
        System.out.println("home page Title: "+driver.getTitle());
		  
		// actual title //
		  String actualTitle=driver.getTitle();
		  System.out.println("actualTitle: "+driver.getTitle());
		  String expectedTitle="Facebook – log in or sign up";
		
		  //comparing //
		  if (actualTitle.equals(expectedTitle))
			  System.out.println("The title is MATCH");
		  else
			  System.out.println("The title not MATCH"); 
		  
		  //close browser//
	  driver.close();
	}
}

