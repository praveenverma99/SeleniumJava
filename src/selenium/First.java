package selenium;

import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.By.ByName;

import java.awt.Window;

import org.bouncycastle.crypto.signers.ISOTrailers;
import org.openqa.selenium.SessionNotCreatedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Sleeper;

public class First {

	public static void main(String[] args) throws InterruptedException, SessionNotCreatedException
	{
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "E://Driver//geckodriver.exe");
	//	ChromeDriver driver = new ChromeDriver();
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
        Thread.sleep(10000);		
	
        driver.getTitle();
        System.out.println(driver.getTitle());
	   
        driver.getCurrentUrl();
        System.out.println(driver.getCurrentUrl());

        driver.close();
        
        
	}

}
