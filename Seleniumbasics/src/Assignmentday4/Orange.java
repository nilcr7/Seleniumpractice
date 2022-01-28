package Assignmentday4;

import org.openqa.selenium.chrome.ChromeDriver;

public class Orange {
	public static void main(String[] args) {
		
		//set path //
		System.setProperty("webdriver.chrome.driver", "E:\\Software testing\\Eclipse workspace\\Seleniumbasics\\executable\\chromedriver.exe");
		
		// create object //
		ChromeDriver driver=new ChromeDriver();
		
		// open url //
		driver.get("https://opensource-demo.orangehrmlive.com");
		
		//close the browser //
		
		driver.close();

}
}