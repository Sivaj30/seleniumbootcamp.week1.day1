package week1.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditTask {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(options);
		
		driver.manage().window().maximize();
		
		driver.get("https://login.salesforce.com");
		driver.findElement(By.id("username")).sendKeys("mars@testleaf.com");
		driver.findElement(By.id("password")).sendKeys("BootcampSel$123");
		driver.findElement(By.id("Login")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		driver.findElement(By.xpath("//button[@class='slds-button']")).click();
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
		WebElement ele = driver.findElement(By.xpath("(//span[text()='Tasks'])[1]"));
		driver.executeScript("arguments[0].click();",ele);
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Thread.sleep(5000);
		WebElement ele1 = driver.findElement(By.xpath("//span[text()='Display as Split View']"));
		driver.executeScript("arguments[0].click();",ele1);
		//span[@data-aura-rendered-by='1343:0']
		WebElement status=driver.findElement(By.xpath("//span[text()='Table']"));
		
		
		Actions action = new Actions(driver); 
		action.moveToElement(status).click().build().perform();
		//driver.findElement(By.xpath("//span[text()='Display as Split View']")).click();
		//button[@title='Display as Split View']
		WebElement ele2 = driver.findElement(By.xpath("//span[text()='Select a List View']"));
		driver.executeScript("arguments[0].click();",ele2);
		
WebElement viewed=driver.findElement(By.xpath("(//span[text()='Recently Viewed'])[4]"));
		
		
		Actions action1 = new Actions(driver); 
		action1.moveToElement(viewed).click().build().perform();
		//driver.findElement(By.xpath("//span[text()='Show more actions']")).click();
		WebElement ele3 = driver.findElement(By.xpath("//span[text()='Show more actions']"));
		driver.executeScript("arguments[0].click();",ele3);
		
WebElement edit=driver.findElement(By.xpath("//a[@title='Edit']"));
		
		
		Actions action3 = new Actions(driver); 
		action3.moveToElement(edit).click().build().perform();
		driver.findElement(By.xpath("(//a[@class='select'])[2]")).click();
		
WebElement priority=driver.findElement(By.xpath("(//a[text()='Low'])[1]"));
		
		
		Actions action4 = new Actions(driver); 
		action4.moveToElement(priority).click().build().perform();
		
		
		//a[@title='Edit']
		//span[text()='Show more actions']
		//(//span[text()='Recently Viewed'])[4]
		
		//span[text()='Select a List View']

	}

}
