package Assignmentday4;

import org.openqa.selenium.chrome.ChromeDriver;

public class Actitime 
{

	public static void main(String[] args) {
			
    System.setProperty("webdriver.chrome.driver", "E:\\Software testing\\Eclipse workspace\\Seleniumbasics\\executable\\chromedriver.exe");
	     //launch chrome //
	ChromeDriver driver = new ChromeDriver();
     
	// open actitime //
      driver.get("http://demo.actitime.com");
     
      // get page title name and title length //
      int currentpagetitle=driver.getTitle().length();
	System.out.println ("Current page title: "+currentpagetitle);
	 
	  // get page url verify it //
	  System.out.println("Current page URL: "+driver.getCurrentUrl());
	  
	  // get page source and page source length //
	  System.out.println("Page source: "+driver.getPageSource().length());
	  
	  
	  //close the browser //
	  driver.close();
	  
	  
	  
      
      
      
	}

	

}
