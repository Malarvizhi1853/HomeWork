package testCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsTest {

			public static void main(String[] args) {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver", "C:/Users/krant/Downloads/Selenium Java/chromedriver_win32/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.facebook.com/");
			driver.findElement(By.id("email")).sendKeys("abcd@gmail.com");
			driver.findElement(By.id("pass")).sendKeys("malar123");
			//xpath
			//driver.findElement(By.xpath("//*[@id=\'u_0_b\']")).click();
			
            //linktext
			//driver.findElement(By.linkText("Forgot account?")).click();
			
			//partiallink
			//driver.findElement(By.partialLinkText("Forgot")).click();
			
			//relative xpath
			//driver.findElement(By.xpath("//*[@id=\'u_0_b\']")).click();
			
			//absolute path
			//driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[2]/form/table/tbody/tr[2]/td[3]/label/input")).click();
			
			//and condition
			driver.findElement(By.xpath("//input[@type='text' and @name='firstname']")).sendKeys("aaaaaa");
			
			//or condition
			driver.findElement(By.xpath("//input[@name='lastname' or @id='u_0_o']")).sendKeys("bbbbb");
			
			//contains
			driver.findElement(By.xpath("//input[contains(@name, 'reg_email__')]")).sendKeys("11111111");
			
			//startswith
			driver.findElement(By.xpath("//input[starts-with(@name, 'reg_p')]")).sendKeys("ggdgagd");
			
			}

}
