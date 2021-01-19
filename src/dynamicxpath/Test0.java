package dynamicxpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0 {
	

	public static void main(String[] args) {
	String productName="New Apple iPhone 12 Mini (128GB) - Blue";
	System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in/");
    driver.manage().window().maximize();
    driver.findElement(By.xpath("//span[text()='+productName+']/./../../../../../../../div[2]/div/div/div/div/div/div/a/span/span/span[@class='a-price-whole']"));
    
	

	}

}
