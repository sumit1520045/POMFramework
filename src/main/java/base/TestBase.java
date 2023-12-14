package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	private static TestBase testBase;
	private static WebDriver driver;
	private TestBase() {
		String strBrowser= "chrome";
				if (strBrowser.equalsIgnoreCase("chrome")){
			 		driver= new ChromeDriver();
		}
		
	}
	
	public static void inItDriver() {
		if(testBase==null) {
			testBase= new TestBase();
		}
	public static void getDriver() {
		
		}
}
