package Base;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class TestBase {

	
    
    public static Properties Pro;
    public static WebDriver driver;
    public  TestBase() throws IOException {
    	
    	Pro=new Properties();
    FileInputStream Fil=new FileInputStream("/Users/ahmedshuily/"
    		+ "eclipse-workspace/WelmertBDDPOM/src/main/java/Properties/Config.Properties");
    	
    		Pro.load(Fil);
    				
    }
    public void initialization() {
    System.setProperty("webdriver.chrome.driver", "/Users/ahmedshuily/Documents/Driver/chromedriver");
    	driver=new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.manage().deleteAllCookies();
    	driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
    	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    	driver.get(Pro.getProperty("Url"));
    	
    }
    
	public void TearDown() {
		driver.close();
	}
}
