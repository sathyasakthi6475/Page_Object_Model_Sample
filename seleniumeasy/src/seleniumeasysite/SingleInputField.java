package seleniumeasysite;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SingleInputField {
	
		@Test
	public void simple() throws InterruptedException {
			System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\selenium\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
			WebElement checkbox = driver.findElement(By.xpath("//button[contains(text(),'Click for Prompt Box')]"));
			checkbox.click();
			Thread.sleep(3000);
			Alert alert = driver.switchTo().alert();
			alert.sendKeys("sakthi");
			Thread.sleep(3000);
			alert.accept();
			
		
			/*Actions action = new Actions(driver);
			action.keyDown(Keys.CONTROL).click(checkbox.get(0)).build().perform();
			Thread.sleep(3000);
			action.keyDown(Keys.CONTROL).click(checkbox.get(2)).build().perform();
			Thread.sleep(3000);*/
			//action.build().perform();
			/*int total = checkbox.size();
			System.out.println(total);*/
			/*Select drop = new Select(checkbox);
			drop.selectByIndex(4);*/
			
			
			
			/*WebElement uncheck= driver.findElement(By.xpath("//*[@value='Male'][@name='gender']/following::input[4]"));
			uncheck.click();*/
			
//			message.sendKeys("Hi Hello");
//			WebElement show=driver.findElement(By.xpath("//button[contains(text(),'Show Message')]"));
//			show.click();
		
	}

}
