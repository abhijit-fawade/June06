package webelements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;



public class Actions_class {

	@Test(enabled=false)
	public void pract01() {
		System.out.println("shree ganesha");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.knowledgeware.in/final.html");
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Abhijit");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Pune1@");
		driver.findElement(By.xpath("//input[@name='confirmpassword']")).sendKeys("Pune1@");
		driver.findElement(By.linkText("LOGIN")).click();
		
		String actual=driver.findElement(By.xpath("//h1[text()='Selenium Automation Testing']")).getText();
		String exp="Seleni4um Automation Testing";
			
		Assert.assertEquals(exp, actual);
		driver.close();
		
	}
	
	@Test
	public void pract02() {
		System.out.println("shree ganesha");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.knowledgeware.in/final.html");
		WebElement name = driver.findElement(By.xpath("//input[@name='name']"));
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		WebElement confirmpassword = driver.findElement(By.xpath("//input[@name='confirmpassword']"));
		WebElement login = driver.findElement(By.linkText("LOGIN"));
		

		Actions act=new Actions(driver);
	
		act.click().sendKeys(name, "Abhiji").sendKeys(password,"Ama1@").sendKeys(confirmpassword,"Ama1@").click(login);
	
		String actual=driver.findElement(By.xpath("//h1[text()='Selenium Automation Testing']")).getText();
		String exp="Selenium Automation Testing";
		Assert.assertEquals(exp, actual);
		driver.close();
	}
	
	
}
