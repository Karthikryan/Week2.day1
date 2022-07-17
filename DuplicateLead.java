package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/control/login");
	driver.manage().window().maximize();
	driver.findElement(By.id("username")).sendKeys("demosalesmanager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.linkText("CRM/SFA")).click();
	driver.findElement(By.linkText("Leads")).click();
	driver.findElement(By.linkText("Create Lead")).click();
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TCS");
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Karthikeyan");
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Chandrasekaran");
	driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("LocalName");
	driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Software");
	driver.findElement(By.id("createLeadForm_description")).sendKeys("Potential Customer");
	driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("abc@gmail.com");
	WebElement statepro = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
	Select select = new Select (statepro);
	select.selectByVisibleText("Florida");
	driver.findElement(By.className("smallSubmit")).click();
	String title = driver.getTitle();
	System.out.println(title);
	driver.findElement(By.linkText("Duplicate Lead")).click();
	driver.findElement(By.id("createLeadForm_companyName")).clear();
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TATA");
	driver.findElement(By.id("createLeadForm_firstName")).clear();
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Karthik");
	driver.findElement(By.className("smallSubmit")).click();
	String newtitle = driver.getTitle();
	System.out.println(newtitle);
	

	}

}
