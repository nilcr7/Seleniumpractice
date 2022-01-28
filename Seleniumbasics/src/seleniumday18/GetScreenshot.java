package screenshot;



import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import reusables.Utils;

public class GetScreenshot {

	public static void main(String[] args) throws IOException  {
		WebDriver driver=Utils.setUp("chrome", "https://www.google.com");
		
//		TakesScreenshot ts=(TakesScreenshot)driver;
//		File file=ts.getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(file,new File("./screenshots/GoogleSearchPage.jpg"));
		Utils.getScreenShot(driver, "./screenshots/GoogleSearchPage2.png");
	}

}
