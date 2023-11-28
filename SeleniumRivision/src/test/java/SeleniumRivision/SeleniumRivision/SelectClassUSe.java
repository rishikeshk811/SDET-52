package SeleniumRivision.SeleniumRivision;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectClassUSe {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().window().fullscreen();
driver.get("");
driver.getPageSource();
driver.getCurrentUrl();
//   driver.findElement(By.)
	}

}
