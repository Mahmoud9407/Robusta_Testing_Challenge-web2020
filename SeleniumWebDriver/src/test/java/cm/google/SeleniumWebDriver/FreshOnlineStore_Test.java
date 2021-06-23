package cm.google.SeleniumWebDriver;



import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FreshOnlineStore_Test {
	ChromeDriver driver;

	@BeforeTest

	public void openURL()
	{
		System.setProperty("webdriver.chrome.driver", 
				"D:\\Testing Course\\Automation Course\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.navigate().to("https://fresh.com.eg/");

	}
	@Test
	public void GoogleSearch()
	{
		WebElement search = driver.findElement(By.id("searchInput"));
		search.clear();
		search.sendKeys("Fresh Ice Box 8 liter");
		driver.manage().timeouts().implicitlyWait(3 , TimeUnit.SECONDS);
		WebElement option_1 = driver.findElement(By.xpath("//*[@id=\"app\"]/header/div[2]/div/div[1]/div[2]/div[2]/div[1]/ul/li[1]/button"));
		option_1.click();
		driver.manage().timeouts().implicitlyWait(4 , TimeUnit.SECONDS);
		WebElement wait = driver.findElement(By.xpath("//*[@id=\"app\"]/header/div[1]/ul"));
		wait.click();
		WebElement Pbd = driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/div/div/div[2]/div[4]/div[1]/a/div/div[2]"));
		System.out.println(Pbd.getText());
		WebElement Afd = driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/div/div/div[2]/div[4]/div[1]/a/div/div[1]"));
		System.out.println(Afd.getText());
		WebElement option_2  = driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/div/div/div[2]/div[4]/div[1]/a/picture/img"));
		option_2.click();
		//WebElement qty = driver.findElement(By.xpath("//*[@id=\"qty\"]"));
		//qty.getAttribute("quantity");
		WebElement Add = driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[1]/div[2]/div[3]/div/div/button[2]"));
		Add.click();
		Add.click();
		WebElement Add_tocart = driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[1]/div[2]/div[4]/button[1]"));
		Add_tocart.click();
		WebElement Ptcheckout = driver.findElement(By.xpath("//*[@id=\"app\"]/div[4]/div[2]/div/a[1]"));
		Ptcheckout.click();
		WebElement Rmv_btn = driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[2]/div/div[1]/div/div/div[1]/div[2]/div[1]/button[2]")); 
		Rmv_btn.click();

		//driver.manage().timeouts().implicitlyWait(3 , TimeUnit.SECONDS);
		//Select option = new Select(driver.findElement(By.className("ResultsWrapper")));
		//option.selectByVisibleText("Fresh Ice Box 8 liter");




	}




}
