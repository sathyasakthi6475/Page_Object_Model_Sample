package seleniumeasysite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Orangehrm {
	@Test
	public void logincorrect() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials");
		WebElement username =driver.findElement(By.id("txtUsername"));
		username.sendKeys("Admin");
		WebElement password = driver.findElement(By.id("txtPassword"));
		password.sendKeys("admin123");
		WebElement click = driver.findElement(By.id("btnLogin"));
		click.click();
		Thread.sleep(3000);
		WebElement leave = driver.findElement(By.xpath("//span[@class='quickLinkText']"));
		leave.click();
	}
}
