package week1.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateTask {

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
		//driver.findElement(By.xpath("//span[text()='Tasks Menu']")).click();
		//span[text()='Tasks Menu']
		WebElement ele = driver.findElement(By.xpath("//span[text()='Tasks Menu']"));
		driver.executeScript("arguments[0].click();",ele);
		
		WebElement ele1 = driver.findElement(By.xpath("//span[text()='New Task']"));
		driver.executeScript("arguments[0].click();",ele1);
		
		
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//WebElement status=driver.findElement(By.xpath("//div[@data-proxy-id='aura-pos-lib-1']//a[1]"));
		WebElement status=driver.findElement(By.xpath("//div[@data-proxy-id='aura-pos-lib-1']//a[1]"));
		//input[@title='Search Contacts']
		//driver.findElement(By.xpath("//div[@data-proxy-id='aura-pos-lib-1']//a[1]")).click();
		
		Actions action = new Actions(driver); 
		action.moveToElement(status).click().build().perform();
		driver.findElement(By.xpath("//input[@class='slds-combobox__input slds-input']")).sendKeys("Bootcamp3");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//String subject=driver.findElement(By.xpath("//input[@class='slds-combobox__input slds-input']")).getText();
		
		/*driver.findElement(By.xpath("//span[text()='Save']")).click();
		String message=driver.findElement(By.xpath("//span[@class='toastMessage slds-text-heading--small forceActionsText']")).getText();
		System.out.println(message);
		if (message.contains("Bootcamp3"))
		{
			System.out.println("Task Bootcamp3 created successfully ");
		}
		
		else
		{
			System.out.println("task not created");
		}
		//span[@class='toastMessage slds-text-heading--small forceActionsText']
		
		//span[text()='Save']*/
		
		
		
		
		
		
	}

}
