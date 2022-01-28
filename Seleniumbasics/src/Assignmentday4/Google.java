package Assignmentday4;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class Google
{
	public static void main(String[] args) {
	
	System.setProperty("webdriver.ie.driver", "E:\\Software testing\\Eclipse workspace\\Seleniumbasics\\executable\\IEDriverServer.exe");
    // launch ie //
	InternetExplorerDriver edriver=new InternetExplorerDriver();
    edriver.get("http://google.com");
  
   
    // url //
    System.out.println("Current page URL: "+edriver.getCurrentUrl());
    
    //page source //
 	System.out.println("Page source: "+edriver.getPageSource());
 	
 	//close //
 	edriver.close();
 	  
	
	
	}
}
