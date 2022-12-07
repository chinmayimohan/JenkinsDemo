package JenkinsProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo5 {
	@Test
	public void demo() {
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.irctc.co.in/nget/train-search");
			System.out.println(driver.getTitle());
			driver.close();
}

}
