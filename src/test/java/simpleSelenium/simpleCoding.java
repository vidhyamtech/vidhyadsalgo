package simpleSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class simpleCoding {
	
	public static void main(String[] args) {
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		
		WebElement userName = driver.findElement(By.name("user-name"));
		userName.sendKeys("standard_user");
		
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("secret_sauce");
		
		WebElement loginBtn = driver.findElement(By.id("login-button"));
		loginBtn.click();
		
		
		WebElement add2Cart = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
		add2Cart.click();
		
		
		
		
	}

}
