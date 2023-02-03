package Test_scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel4_practiceTest {

			public static void main(String[] args) {
			// TODO Auto-generated method stub
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.get(" https://demowebshop.tricentis.com/ ");
			String parentWindow=driver.getWindowHandle();
			driver.switchTo().newWindow(WindowType.TAB);
			driver.get(" https://snowcityblr.com/contact-us/ ");
			driver.switchTo().window(parentWindow);
			driver.manage().window().maximize();
			driver.manage().window().minimize();
		}

	}


