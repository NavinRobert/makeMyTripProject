package org.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Hdfc {
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hdfcbank.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		WebElement al = driver.findElement(By.xpath("//div[@id='onetrust-close-btn-container']//button"));
		al.click();
		WebElement move = driver.findElement(By.xpath("(//a[@title='Pay'])[2]"));
		Actions action = new Actions(driver);
		action.moveToElement(move).perform();

		WebElement neft = driver.findElement(By.xpath(
				"((//div[@class='row full-width-bg ng-scope']//descendant::div[@class='row']//following::ul[@class='sub-menu'])[1]//descendant::a)[1]"));
		neft.click();
		driver.switchTo().alert();

	}

}
