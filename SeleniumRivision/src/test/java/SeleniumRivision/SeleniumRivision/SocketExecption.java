package SeleniumRivision.SeleniumRivision;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SocketExecption {

	public static void main(String[] args) throws InterruptedException {
//     group id - Organisation name,   artifect id ---project name with domain,
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	//	Thread.sleep(Duration.ofSeconds(4));
		driver.close();
	}

}
