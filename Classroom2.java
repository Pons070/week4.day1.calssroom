package week4.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Classroom2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();

		
		driver.get("https://www.irctc.co.in/nget/train-search");
		WebElement Button = driver.findElement(By.xpath("//button[text()='OK']"));
		Button.click();
		
		driver.findElement(By.linkText("FLIGHTS")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> newWindow = new ArrayList<String>(windowHandles);
		
		driver.switchTo().window(newWindow.get(1));
		
	System.out.print(driver.getTitle());
	
		
		//https://peter.sh/experiments/chromium-command-line-switches/
		
		driver.close();

		
		
	}

}
