package testCase;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownloadFile {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	

		System.setProperty("webdriver.chrome.driver", "C:/Users/krant/Downloads/Selenium Java/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.selenium.dev/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body/section[2]/div/div[1]/div[2]/a/div/b")).click();
		driver.findElement(By.partialLinkText("64 bit Windows IE")).click();
		
				//downloadtime
		Thread.sleep(4000);
		File file = new File("C:/Users/krant/Downloads/IEDriverServer_x64_3.150.1.zip");
		boolean check=file.exists();
		System.out.println(check);
	
	
	}

}
