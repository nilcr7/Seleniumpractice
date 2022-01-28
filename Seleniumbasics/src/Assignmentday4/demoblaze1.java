package Assignmentday4;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demoblaze1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
      	ChromeDriver driver = new ChromeDriver();
      
        driver.manage().window().maximize();
       
        driver.get("https://www.demoblaze.com/");
       
        driver.manage().window().maximize();
        
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
      //for mobile
        List<WebElement> mobiles=driver.findElements(By.xpath("//div[@id='tbodyid']/div/div/div/h4"));
	    System.out.println("Options count: "+mobiles.size());
	    for(int i=0;i<mobiles.size();i++) {
		WebElement option=mobiles.get(i);
		System.out.println(option.getText());}
	   
	    //for prize
		 List<WebElement> mobileprize=driver.findElements(By.xpath("//div[@id='tbodyid']/div/div/div/h5"));
		 System.out.println("Optionscount:"+mobileprize.size());
		 for(int j=0;j<mobileprize.size();j++){
	     WebElement option1=mobileprize.get(j);
				System.out.println(option1.getText());}	    
		//for button click
		 WebElement button=driver.findElement(By.xpath("//button[@id='next2']"));
		 System.out.println("buttonisdisplayed:"+button.isDisplayed());
		 button.click();
		 Thread.sleep(5000);
		 
		 //for pc names
		 List<WebElement> pc=driver.findElements(By.xpath("//div[@id='tbodyid']/div/div/div/h4"));
		    System.out.println("Options count: "+pc.size());
		    for(int i=0;i<pc.size();i++) {
			WebElement option=pc.get(i);
			System.out.println(option.getText());}
		    Thread.sleep(5000);
		    
	    //for pc prize
		     List<WebElement> pc1=driver.findElements(By.xpath("//div[@id='tbodyid']/div/div/div/h5"));
		    System.out.println("Options count: "+pc1.size());
		    for(int i=0;i<pc1.size();i++) {
			WebElement option=pc1.get(i);
			System.out.println(option.getText());}
		    Thread.sleep(5000);
		    driver.close();
		 
		 }
  

	
	    }
	
	
