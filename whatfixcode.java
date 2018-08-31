import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WhatFixTest {
	
	public static void waitForLoad(WebDriver driver) {
        ExpectedCondition<Boolean> pageLoadCondition = new
                ExpectedCondition<Boolean>() {
                    public Boolean apply(WebDriver driver) {
                        return ((JavascriptExecutor)driver).executeScript("return document.readyState").equals("complete");
                    }
                };
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(pageLoadCondition);
    }
public static void main(String[] args) {
	String URL = "https://whatfix.com/quickolabs.com/#!flows/how-to-embed-flows-in-my-website-or-applications/12ec5470-746f-11e8-a994-04013d24cd02/";
	String IEDriverPath = "E:\\Softwares\\Selenium\\IEDriverServer_x64_3.13.0\\IEDriverServer.exe";
	String FFDriverPath = "E:\\Softwares\\Selenium\\geckodriver-v0.21.0-win64\\geckodriver.exe";
	System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\Selenium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	WebDriverWait wait = new WebDriverWait(driver, 30);
	
//	System.setProperty("webdriver.ie.driver", IEDriverPath);
//	WebDriver driver = new InternetExplorerDriver();
//	
//	System.setProperty("webdriver.gecko.driver", FFDriverPath);
//	WebDriver driver = new FirefoxDriver();
	
	driver.manage().window().maximize();
	
	driver.get(URL);
//	waitForLoad(driver);
	//Click on Self Help
//	driver.findElement(By.id("_widget_launcher_wfx_")).click();
//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//	driver.findElement(By.id("wfx-dashboard-content-snap-title-text-9dafb5a0-a784-11e8-87a4-04013d24cf02")).click();
//	driver.findElement(By.cssSelector("#wfx-dashboard-content-snap-title-flow-12ec5470-746f-11e8-a994-04013d24cd02")).click();
	driver.findElement(By.cssSelector(".WFEMD1")).click();
	waitForLoad(driver);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//	driver.findElement(By.cssSelector("#wfx-dashboard-content-embed-slideshow")).click();
//	driver.findElement(By.id("wfx-dashboard-self-help-flow-e9db1b40-7aca-11e3-b86f-386077c653fe")).click();
//	wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.id("wfx-dashboard-self-help-flow-12ec5470-746f-11e8-a994-04013d24cd02")));
	
//	driver.findElement(By.id("wfx-dashboard-self-help-flow-12ec5470-746f-11e8-a994-04013d24cd02")).click();
//	ArrayList<String> handles = (ArrayList<String>) driver.getWindowHandles();
//	for(String str : handles)
//	{
//		System.out.println(str);
//	}
	
//	driver.switchTo().frame("WFEMK0 WFEMI1 WFEME5 WFEMC5 WFEMBS WFEMJ1");
//	driver.switchTo().frame("WFEMK0.WFEMI1.WFEME5.WFEMC5.WFEMBS.WFEMJ1");
//	driver.findElement(By.className("WFWIFBB")).sendKeys("How to embed");
//	if(driver.findElement(By.cssSelector(".WFWIOBB"))!=null)
//		if(driver.findElement(By.id("_widget_wfx_"))!=null)
//	{
//		driver.findElement(By.partialLinkText("How to embed flows in my website or applications?")).click();
//		waitForLoad(driver);
//	}

//	driver.findElement(By.partialLinkText("How to embed flows in my website or applications?")).click();

	driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"_widget_launcher_wfx_\"]/iframe")));
	driver.findElement(By.xpath("//*[@id=\"wfx-dashboard-self-help-flow-12ec5470-746f-11e8-a994-04013d24cd02\"]")).click();
	waitForLoad(driver);
	driver.switchTo().defaultContent();
	waitForLoad(driver);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"desktop\"]/div[3]")));
	if(driver.findElement(By.xpath("//*[@id=\"desktop\"]/div[3]")).getSize()!=null)
		System.out.println("Ëmbed Tool Tip STEP 1 of 3 displayed");
	else
		System.out.println("Embed Tool Tip STEP 1 of 3 not displayed");
	//driver.findElement(By.xpath("//*[@id=\"Desktop\"]/div[3]/div/div/table/tbody/tr[2]/td/div/table/tbody/tr[1]/td/table/tbody/tr[1]/td[2]/a")).click();
	driver.switchTo().defaultContent();
	//driver.findElement(By.xpath("//*[@id=\"desktop\"]/div[4]/div/div/table/tbody/tr[2]/td/div/table/tbody/tr[1]/td/table/tbody/tr[1]/td[2]/a")).click();
	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"desktop\"]/div[3]")));
	driver.switchTo().defaultContent();
	driver.findElement(By.id("wfx-dashboard-content-embed")).click();
	driver.switchTo().defaultContent();
	////*[@id="mobile"]/div[4]
	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"desktop\"]/div[4]")));
	if(driver.findElement(By.xpath("//*[@id=\"desktop\"]/div[4]")).getSize()!=null)
		System.out.println("Ëmbed Tool Tip STEP 2 of 3 displayed");
	else
		System.out.println("Embed Tool Tip STEP 2 of 3 not displayed");
	
	driver.switchTo().defaultContent();
	driver.findElement(By.xpath("//*[@id=\"desktop\"]/div[4]/div/div/table/tbody/tr[1]/td/div/table/tbody/tr[1]/td/table/tbody/tr[1]/td[2]/a")).click();
	
	
	driver.findElement(By.id("wfx-dashboard-content-embed")).click();
	driver.findElement(By.id("wfx-dashboard-content-embed")).click();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	wait.until(ExpectedConditions.presenceOfElementLocated(By.id("wfx-dashboard-content-embed-slideshow")));
	
	driver.findElement(By.id("wfx-dashboard-content-embed-slideshow")).click();

	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"desktop\"]/div[5]")));
	
	if(driver.findElement(By.xpath("//*[@id=\"desktop\"]/div[6]")).getSize()!=null)
		System.out.println("Ëmbed Tool Tip STEP 3 of 3 displayed");
	else
		System.out.println("Embed Tool Tip STEP 3 of 3 not displayed");
	
	//driver.findElement(By.cssSelector("wfx-tooltip-next")).click();
	//driver.findElement(By.xpath("//*[@id='wfx-tooltip-next']")).click();
	
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	jse.executeScript("document.getElementById('wfx-tooltip-next').click();");
	
	wait.until(ExpectedConditions.alertIsPresent());
	
	if(driver.findElement(By.cssSelector(".WFENC0"))!= null)
	{
		System.out.println("Pop up is displayed.!");
	}
	else
		System.out.println("Pop up NOT displayed!");
	
//	click on close Pop UP
	driver.findElement(By.cssSelector(".ico-cancel")).click();
}
}
