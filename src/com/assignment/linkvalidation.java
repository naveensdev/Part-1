
package com.assignment;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class linkvalidation {
 
	public static void main(String[] args) {
 
/*		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver-v0.13.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();*/
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.krossover.com/basketball");
 		java.util.List<WebElement> links = driver.findElements(By.tagName("a"));
 		System.out.println(links.size());
 		for (int i = 1; i<=links.size(); i=i+1)
 		{ 
 			
 			try {
 				System.out.println(links.get(i).getText());
 				links.get(i).click();
 			
 			}
 			catch(Exception e)
 			{
 			 e.printStackTrace();
 			 System.out.println("Count  the of Link is not working: "+ i ) ;
 			 //System.out.println("Name of  link is not working: "+links.get(i).getText() );
 			 break;
 			}
 		}
 	}
 }
