package org.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");

		WebElement findElement = driver.findElement(By.id("twotabsearchtextbox"));
		findElement.sendKeys("mob");

		Thread.sleep(8000);
		List<WebElement> elements = driver.findElements(By.xpath(
				"//div[@id='nav-flyout-searchAjax']//div//following-sibling::div[@class='s-suggestion s-suggestion-ellipsis-direction']//span"));
		int size = elements.size();
		System.out.println(size);

		for (int i = 0; i < elements.size(); i++) {
			WebElement webElement = elements.get(i);
			String text = webElement.getText();

			System.out.println(text);

		}

	}
}
