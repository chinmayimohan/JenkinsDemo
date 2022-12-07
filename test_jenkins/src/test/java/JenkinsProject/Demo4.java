package JenkinsProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo4 {
	@Test
	public void demo() {
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.w3schools.com/sql/trysql.asp?filename=trysql_select_union");
			System.out.println(driver.getTitle());
			driver.close();
}

}
