package org.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Wikipedia {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.wikipedia.org/");
		List<WebElement> elements = driver
				.findElements(By.xpath("//div[@class='central-featured-lang lang1']//following::a//strong"));
		int size = elements.size();
		System.out.println(size);

		for (int i = 0; i < elements.size(); i++) {
			WebElement webElement = elements.get(i);
			String text = webElement.getText();

			System.out.println(text);

		}

	}
}
