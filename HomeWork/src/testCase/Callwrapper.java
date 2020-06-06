package testCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Callwrapper {

	public static void main(String[] args) {
				// TODO Auto-generated method stub
		String strchromedriver="C:/Users/krant/Downloads/Selenium Java/chromedriver_win32/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",strchromedriver);
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@id=\'btnLogin\']")).click();
		driver.findElement(By.className("firstLevelMenu")).click();
		driver.findElement(By.id("searchSystemUser_userName")).sendKeys("Geetha");
		//driver.findElement(By.id("searchSystemUser_userType")).click();
		Select drpall = new Select(driver.findElement(By.name("searchSystemUser[userType]")));
		drpall.selectByVisibleText("ESS");
		driver.findElement(By.xpath("//*[@type='text' and @name=\'searchSystemUser[employeeName][empName]\']")).sendKeys("Geetha Kaliyannan");
		//driver.findElement(By.xpath("//input[@type='text' and @name='firstname']")).sendKeys("geetha");
		Select status = new Select(driver.findElement(By.id("searchSystemUser_status")));
		status.selectByVisibleText("Enabled");
		driver.findElement(By.xpath("//input[@id=\'searchBtn\' or @name='_search' ]")).click();

		



		

	}

}
