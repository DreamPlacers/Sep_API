package com.Kaviraj;

import java.net.HttpURLConnection;
import java.net.URI;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Kaviraj {
	
	public static void main (String [] args) {
		
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	
	List <WebElement> FBLINKS = driver.findElements(By.tagName("link"));
	Iterator <WebElement> it = FBLINKS.iterator();
	int i = 1;
	
	while (it.hasNext()) {
		WebElement HSlinks = it.next();
		String HREF = HSlinks.getAttribute("href");
		
		if (HREF == null || HREF.isEmpty()) {
			System.out.println("these links are empty :"+HREF);
		}
		
		else if (!HREF.startsWith("http") ) {
			System.out.println("these are nor https links:"+HREF);
		}
		else {
			try {
				HttpURLConnection var = (HttpURLConnection) (new URI(HREF).toURL().openConnection());
				var.setRequestMethod("HEAD");
				var.connect();
				int Rcodes = var.getResponseCode();
				
				if (Rcodes >=200 && Rcodes<300) {
					System.out.println(i+"these are not broken Links "+HREF);
				}
				else if (Rcodes >=300 && Rcodes <500) {
					System.out.println("these are broken Links"+HREF);
				}
				
			}
			catch (Exception e) {
				System.out.println("an exception occured");
				e.printStackTrace();
			}
			i++;
		}
		
	}
	driver.close();
	}	
}
