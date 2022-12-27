package Selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot 
{
	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		TakesScreenshot tss=(TakesScreenshot)driver;
		File src = tss.getScreenshotAs(OutputType.FILE);
		File dst=new File("./Screenshot/a1.png");
		FileUtils.copyFile(src,dst);
	}
}
