package JenkinsProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Snippet {
	@Test
	public void demo() {
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.geeksforgeeks.org/reading-writing-data-excel-file-using-apache-poi/?ref=lbp");
			System.out.println(driver.getTitle());
			driver.close();
}
}

