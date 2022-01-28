package Assignmentday4;

import java.awt.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class flipkart {

	public static void main(String[] args)throws InterruptedException {
		//Step1: open browser
		//System.setProperty("webdriver.chrome.driver","E:\\Software testing\\Eclipse workspace\\Seleniumbasics\\executable\\chromedriver.exe");
	         //	or
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		//full screen browser 
		driver.manage().window().maximize();
		/**Step2: enter required URL */
		driver.get("https://www.flipkart.com/");
		//implicit wait: Interface->Interface->Interface->abstract method*/
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		java.util.List<WebElement> catOptions=driver.findElements(By.cssSelector("div[class=\"InyRMC _3Il5oO\"] div>div>a"));
								//or
		//List<WebElement> catOptions=driver.findElements(By.cssSelector("div[class='block block-category-navigation'] ul>li>a"));
		System.out.println("Options count: "+catOptions.size());
		for(int i=0;i<catOptions.size();i++) {
			WebElement option=catOptions.get(i);
			System.out.println(option.getText());
					//or
			//System.out.println(catOptions.get(i).getText());
		}
	}

}



