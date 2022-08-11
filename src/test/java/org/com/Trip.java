package org.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

class Trip {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get(
				"https://www.makemytrip.com/flights/?cmp=SEM|D|DF|G|Brand|B_M_Makemytrip_Variants|Brand-Variants-Exact|RSA|Regular|V2|274470846615&s_kwcid=AL!1631!3!274470846615!e!!g!!make%20my%20trip-&ef_id=Cj0KCQiAjJOQBhCkARIsAEKMtO0X3NyO1eBuiIrVJmjeCSLCO6O0UbYTmliVyuSfvVwqyNAli3fz7bAaAvDQEALw_wcB:G:s&gclid=Cj0KCQiAjJOQBhCkARIsAEKMtO0X3NyO1eBuiIrVJmjeCSLCO6O0UbYTmliVyuSfvVwqyNAli3fz7bAaAvDQEALw_wcB");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//li[@data-cy='account']")).click();

		WebElement element = driver.findElement(
				By.xpath("(//li[@class='menu_Hotels']//following::span[@class='false chNavText darkGreyText'])[1]"));
		String text = element.getText();
		System.out.println(text);

		// WebElement btnclicklog = driver.findElement(By.xpath("//li[@class='makeFlex
		// hrtlCenter font10 makeRelative lhUser userLoggedOut']"));
		// btnclicklog.click();
		// WebElement cancel =
		// driver.findElement(By.xpath("//span[@class='langCardClose']"));
		// cancel.click();
		// driver.findElement(By.xpath("//label[@for='departure']")).click();
		// Thread.sleep(5000);
		// List<WebElement> pickdate =
		// driver.findElements(By.xpath("//div[text()='January
		// 2022']//following::div[@class='DayPicker-Body'][1]//descendant::div[@class='DayPicker-Day'
		// or class='DayPicker-Day DayPicker-Day--selected' or class='DayPicker-Day
		// DayPicker-Day--selected DayPicker-Day--today']//p[2]"));
		// List<Integer> li = new ArrayList<>();
		// for (int i = 0; i <pickdate.size(); i++) {
		// WebElement date = pickdate.get(i);
		// String text = date.getText();
		// System.out.println(text);
		// int parseInt = Integer.parseInt(text);
		// li.add(parseInt);
		// }
		// Integer min = li.get(0);
		// for (int j = 1; j < li.size(); j++) {
		//
		// Integer c = li.get(j);
		//
		// if (c<min) {
		//
		// min=c;
		// }
	}
}
