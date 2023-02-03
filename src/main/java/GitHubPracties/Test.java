package GitHubPracties;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		WebElement Textbox = driver.findElement(By.name("q"));
		Textbox.sendKeys("amazon");
		Textbox.submit();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@class='x2VHCd OSrXXb qzEoUe']")).click();
		driver.close();
	}
}
