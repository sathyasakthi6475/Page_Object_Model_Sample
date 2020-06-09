package seleniumeasysite;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Windows {
	
	@Test
	public void simple() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://demo.automationtesting.in/Windows.html");
		String oldwindow=driver.getWindowHandle();
		WebElement checkbox = driver.findElement(By.xpath("//*[contains(text(),'Open New Seperate Windows')]"));
		checkbox.click();
		WebElement checkbox1 = driver.findElement(By.xpath("//div[@id='Multiple']/preceding::button[1]"));
		checkbox1.click();
		Set <String> newwindow=	driver.getWindowHandles();
		for (String allwindow : newwindow) {
			driver.switchTo().window(allwindow);
				}
		driver.close();
	}
}
