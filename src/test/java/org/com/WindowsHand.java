package org.com;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowsHand {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");

		WebElement findElement = driver.findElement(By.id("twotabsearchtextbox"));
		findElement.sendKeys("iphone");

		WebElement btn = driver.findElement(By.xpath("//input[@type='submit']"));
		btn.click();

		WebElement images = driver.findElement(By.xpath("//div[@class='a-section aok-relative s-image-fixed-height']"));
		images.click();
		images.click();
		images.click();
		images.click();

		images.click();
		images.click();
		images.click();
		images.click();

		String parentWindow = driver.getWindowHandle();

		Set<String> allWindow = driver.getWindowHandles();
		int size = allWindow.size();
		System.out.println(size);
		int count = 0;
		for (String x : allWindow) {
			if (!x.equals(parentWindow)) {
				count++;
				System.out.println(count);
				if (count == 4) {
					driver.switchTo().window(x);
					driver.close();
					System.out.println("4th window is closed");
				}

			}

		}

	}
}