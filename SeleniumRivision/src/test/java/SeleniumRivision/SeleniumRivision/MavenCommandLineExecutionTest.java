package SeleniumRivision.SeleniumRivision;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MavenCommandLineExecutionTest {
/*	@Test
	public void readDataformMaven() {
		System.out.println("executing SCript from Cmd line by Maven");
	}
	@Test
	public void readData() {
		System.out.println("executing SCript from Cmd line by Maven readData and Hello");
	}
	@Test
	public void writeData() {
		System.out.println("executing SCript from Cmd line by Maven");
	}   */
	@Test
	public void parameterFromCmd() {
	
		String browser=  System.getProperty("browser");
		String url  =  System.getProperty("url");
		 String username= System.getProperty("username");
		   String password=  System.getProperty("password");
	/*	   System.out.println(browser);
		   System.out.println(url);
		   System.out.println(username);
		   System.out.println(password);  */
	//for Execution from commandLine mvn -Dkey=value -Dkey2=value2 ..... -Dkeyn=valuen	 -Dtest=className test   
		  WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get(url);
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		  
		  driver.findElement(By.xpath("//a[text()='/ Sign In']")).click();
		  
		  
		    WebElement un= driver.findElement(By.xpath("//input[@placeholder='Enter your Email']"));
		    un.click();
		    un.sendKeys(username);
		  
		  
		    WebElement pwd=  driver.findElement(By.xpath("//input[@placeholder='Password' and @id='password']"));
		    pwd.click();
		    pwd.sendKeys(password);
		  driver.findElement(By.xpath("//input[@name='signin']")).click();

		  
		  
		  
		  
		  
		  
		  
		  
		  
		
	}
}
