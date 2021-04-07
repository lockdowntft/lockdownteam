package Base;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestBase {
	public static Properties Prop;
	public static WebDriver driver;

	public  TestBase() throws IOException {
		
		 Prop= new Properties() ;
		FileInputStream File=new FileInputStream ("/Users/ahmedshuily/eclipse-workspace"
				+ "/AmazonBDDPOM/src/main/java/Properties/config.properties");
		
	Prop.load(File);
	}
	
	
	public void initialization() {
		
	System.setProperty("webdriver.chrome.driver", "/Users/ahmedshuily/Documents/Driver/chromedriver");
	
	
	 driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get(Prop.getProperty("Url"));
	
	}
	public void TearDown() {
		driver.close();
	}
	
	
}
