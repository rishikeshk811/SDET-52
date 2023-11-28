package SeleniumRivision.SeleniumRivision;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class CommandLineParameterTest {
@Test
public void parameterByCmd() {
	String browser=  System.getProperty("browser");
	String url  =  System.getProperty("url");
	 String username= System.getProperty("username");
	   String password=  System.getProperty("password");

	   
	   System.out.println(browser);
	   System.out.println(url);
	   System.out.println(username);
	   System.out.println(password);

	   
	   
	   
	   /*   WebDriver driver=new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get(url);
	   driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
	   dri   */

}
}
