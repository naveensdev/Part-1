package com.assignment;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
/*check to see if they show up after clicking “Filter Plays” on this page . If ALL of the filters listed below show up, then the test passes*/
public class listOfPlayers {

	public static void main(String[] args) {
		
		/*System.setProperty("webdriver.gecko.driver", "C:\\geckodriver-v0.13.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();*/
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://v2-pre-prod-app.krossover.com/intelligence/games/9603/breakdown");
		
		//String[] listToVerify = {"Free Throws","Defense","Rebounds","Time Period","Top Searches","Shooting","Fouls","Turnovers"}; 
		driver.findElement(By.xpath("//*[@id='plays-filter-dropdown-toggle-cta']/span[2]/i")).click();
		ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
		  list.add("P. Brar");//Adding object in arraylist  
		  list.add("A. Singh");  
		  list.add("R. Pethani");  
		  list.add("A. Pari");
		  list.add("N. Grewal");
		  list.add("J. Smith");
		  list.add("V. Kohli");
		  //System.out.println(list);  	
		ArrayList<String> list2=new ArrayList<String>();
		java.util.List<WebElement> List = driver.findElements(By.xpath("//li[3][@class='force-scrollbar']/div"));
 		for(int i=0;i<List.size();i++)
 		{
 			list2.add(List.get(i).getText());
 			//System.out.println(List.get(i).getText());
 		}
	
 			   /* String orig[] = { "a", "b", "b", "c" };
 			    String act[] = { "x", "b", "b", "y" };*/
 			    List origList = new ArrayList(Arrays.asList(List));
 			    List actList = Arrays.asList(list);
 			    origList.retainAll(actList);
 			    System.out.println(origList);
 			    boolean flag=list2.containsAll(list);
 			    System.out.println(flag);
 			    
 	  }
	
  		
 		
} 		

 		
 		
 		/*boolean contains(List<?> List, List<?> list) 
	 		{
	 			boolean flag=Collections.indexOfSubList(List, list) != -1;
	 			System.out.println(flag);
				return flag;
				
	 		}*/
 		/*
 		boolean contains = true;
		int l2 = list.size();
		int currIndex = -1;
		for(int j=0;j<l2;j++) {
			String e2 = list.get(j);
		}
		int i1 = List.indexOf(e2);
		if(i1 == -1) {
	        contains = false;
	        break;
	        }
	    if(i1 > currIndex) {
	        currIndex = i1;
	    	}
	
	    System.out.println(contains);
	    }*/
			
	
