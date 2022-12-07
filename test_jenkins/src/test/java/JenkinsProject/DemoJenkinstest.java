package JenkinsProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoJenkinstest {
		@Test
		public void TC02() {
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://demowebshop.tricentis.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			driver.findElement(By.className("ico-register")).click();
			driver.findElement(By.id("gender-female")).click();
			driver.findElement(By.id("FirstName")).sendKeys("tommy");
			driver.findElement(By.id("LastName")).sendKeys("xxx");
			driver.findElement(By.id("Email")).sendKeys("ffff123@gmail.com");
			driver.findElement(By.id("Password")).sendKeys("chin@123");
			driver.findElement(By.id("ConfirmPassword")).sendKeys("chin@123");
			driver.findElement(By.id("register-button")).click();
			driver.close();
		}
	}


