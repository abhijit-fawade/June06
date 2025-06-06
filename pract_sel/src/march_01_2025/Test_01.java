package march_01_2025;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test_01 {
	@Test(invocationCount=10)
	public void exe() throws InterruptedException {

		WebDriver driver =new ChromeDriver();
		driver.get("https://www.knowledgeware.in/final.html");
		driver.findElement(By.name("name")).sendKeys("Shree Ganesha");
		Thread.sleep(5000);
		driver.findElement(By.name("password")).sendKeys("12345");
		driver.findElement(By.name("confirmpassword")).sendKeys("12345");
		driver.findElement(By.name("insert")).click();
		driver.close();
		
		
		
		
	}

}
