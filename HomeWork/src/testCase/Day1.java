package testCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class Day1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Users/krant/Downloads/Selenium Java/chromedriver_win32/chromedriver.exe");
		//System.setProperty("webdriver.ie.driver","C:/Users/krant/Downloads/Selenium Java/IEDriverServer_x64_3.150.1/IEDriverServer.exe");
		//System.setProperty("webdriver.gecko.driver","C:/Users/krant/Downloads/Selenium Java/geckodriver-v0.26.0-win64/geckodriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//WebDriver driver = new InternetExplorerDriver();
		//WebDriver driver = new FirefoxDriver(); 
		driver.get("https://opensource-demo.orangehrmlive.com/");
		System.out.println("Title of the page is  "+ driver.getTitle());
		driver.close();
	}

}
