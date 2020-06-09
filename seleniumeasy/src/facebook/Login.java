package facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("https://www.facebook.com/");
		WebElement name=driver.findElement(By.id("email"));
		name.sendKeys("9790890479");
		WebElement pword=driver.findElement(By.id("pass"));
		pword.sendKeys("sathya_03");
		WebElement click =driver.findElement(By.id("u_0_b"));
		click.click();
		WebElement text=driver.findElement(By.xpath("//input[@id='pass']"));
		System.out.println(text.getText());;
	}

}
