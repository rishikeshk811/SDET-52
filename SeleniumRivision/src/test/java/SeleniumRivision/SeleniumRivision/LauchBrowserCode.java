package SeleniumRivision.SeleniumRivision;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class LauchBrowserCode {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.facebook.com/");
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.nationalgeographic.com/");
		    String nationalTitle = driver.getTitle();
		    driver.switchTo().newWindow(WindowType.TAB);
		    driver.navigate().to("https://www.myntra.com/");
		       String myntraTitle = driver.getTitle();
		  Set<String> allwinId=     driver.getWindowHandles();
		  for(String wid:allwinId) {
			  driver.switchTo().window(wid);
				Thread.sleep(2000);
           if(driver.getTitle().equals(nationalTitle)) {
        	  System.out.println("we are on this page : Url  "+driver.getCurrentUrl()+" , Title : "+driver.getTitle());
        	
           }
           else {		driver.manage().window().minimize();

        	   driver.close();
           }
			 // driver.close();
		  }
		
		
	}
		  
		  

	}

	
	
	
	
	
	
	