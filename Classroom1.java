package week4.day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Classroom1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.manage().window().maximize();
		
		driver.switchTo().frame("iframeResult");
		
		WebElement tryIt = driver.findElement(By.xpath("//h2[text()='JavaScript Prompt']/following-sibling::button"));
		tryIt.click();
		
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("Ponsangkar");
		alert.accept();
		
		String text = driver.findElement(By.id("demo")).getText();
		
		System.out.println(text);
		
		if(text.contains("Ponsangkar")) {
			System.out.println("Given input name is available");
		}
		else {
			System.out.println("Given input name is not available");
		}
		driver.close();
	}

}
