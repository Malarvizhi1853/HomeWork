package testCase;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class homework2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:/Users/krant/Downloads/Selenium Java/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		//click on search text box and send value
		driver.findElement(By.xpath("//input[@name=\'q\']")).sendKeys("testing");
		driver.findElement(By.xpath("//input[@name=\'btnK\' and @class='gNO89b']")).sendKeys(Keys.ENTER);
		
		//Identify the number of Link on webpage and assign into Webelement List 
		 List<WebElement> links = driver.findElements(By.xpath("//a"));    //Identify the number of Link on webpage and assign into Webelement List 
	        
	        int linkCount = links.size();     // Count the total Link list on Web Page
	        
	        System.out.println("Total Number of link count on webpage = "  + linkCount);    //Print the total count of links on webpage
	      
	               
		driver.close();

	}
}
