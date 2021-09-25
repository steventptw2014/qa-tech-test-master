package testBase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import com.google.common.base.Predicate;
import commonComponents.PropertiesOperations;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

	BrowserFactory bf = new BrowserFactory();
//	WebDriver driver = null;
	
	@BeforeMethod
	public void LaunchChallenage() throws Exception {
		String browser = PropertiesOperations.getPropertyValueByKey("browser");
		String url = PropertiesOperations.getPropertyValueByKey("url");
		
		DriverFactory.getInstance().setDriver(bf.createBrowserInstance(browser));
		WebDriver driver = DriverFactory.getInstance().getDriver();
	//	WebDriverManager.chromedriver().setup();
	//	driver = new ChromeDriver();
		
		driver = DriverFactory.getInstance().getDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to(url);
		
	}

	@AfterMethod
	public void tearDown() {
		DriverFactory.getInstance().closeBrowser();
		// driver.close();
	}
	
	
	public void waitElement(WebElement wElement) {
		 
		WebDriverWait wait = new WebDriverWait( DriverFactory.getInstance().getDriver(),30);   
		wait.until(ExpectedConditions.visibilityOf(wElement));
		
//		wait.until(webDriver -> ((JavascriptExecutor) webDriver).executeScript("return document.readyState").equals("complete"));
		
//		wait.until(wElement.getAttribute("complete").equals("complete"));
		
	}
	
	
	public WebDriver getDriver() {
		return DriverFactory.getInstance().getDriver();
	}
}


