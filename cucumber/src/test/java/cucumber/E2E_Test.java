package cucumber;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class E2E_Test {
	private static WebDriver driver;
	
	

			//WebDriver driver = new ChromeDriver (handErr);

	public static void main(String[] args) throws InterruptedException {
		DesiredCapabilities handErr = DesiredCapabilities.chrome ();
				handErr.setCapability (CapabilityType.ACCEPT_SSL_CERTS, true);
				
				
	handErr.setCapability("chrome.switches", Arrays.asList("--ignore-certificate-errors"));

				
				
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver(handErr);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://automationpractice.com/index.php");
		

		driver.quit();
	}
}