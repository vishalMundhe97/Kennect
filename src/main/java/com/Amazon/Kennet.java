package com.Amazon;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Kennet {
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://gor-pathology.web.app");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
		WebElement pass = driver.findElement(By.xpath("//input[@name='password']"));
		email.sendKeys("test@kennect.io");
		pass.sendKeys("Qwerty@1234");
		pass.submit();


		WebElement patientBtn = driver.findElement(By.xpath("//span[normalize-space()='Patients']"));
		patientBtn.click();

		WebElement addPatient = driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[1]/a/button/span[1]"));
		addPatient.click();

		WebElement enterName = driver.findElement(By.xpath("//input[@name='name']"));
		WebElement enterEmail = driver.findElement(By.xpath("//input[@name='email']"));
		WebElement enterPhone = driver.findElement(By.xpath("//input[@name='phone']"));
		enterName.sendKeys("GSm");
		enterEmail.sendKeys("vmundhe58@gmail.com");
		enterPhone.sendKeys("9766534282");

		WebElement generalDetails = driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[2]/div/div[2]/div[2]/button[2]"));
		generalDetails.click();

		WebElement enterHeight = driver.findElement(By.xpath("//input[@name='height']"));
		WebElement enterWeight = driver.findElement(By.xpath("//input[@name='weight']"));
		WebElement selectGender = driver.findElement(By.xpath("//*[@id='mui-component-select-gender']"));
		System.out.println("Script Run");

		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(selectGender));

		try {
			Select select = new Select(selectGender);
			select.selectByVisibleText("Female");
		} catch (Exception e) {
			System.out.println("Exception Handled");
		}

		System.out.println("class is selected");
		WebElement enterAge = driver.findElement(By.xpath("//input[@name='age']"));
		enterHeight.clear();
		enterHeight.sendKeys("150");
		enterWeight.clear();
		enterWeight.sendKeys("50");
		enterAge.clear();
		enterAge.sendKeys("20");
		// input[@name='systolic']

		WebElement enterSystolic = driver.findElement(By.xpath("//input[@name='systolic']"));
		WebElement enterDiastolic = driver.findElement(By.xpath("//input[@name='diastolic']"));
		enterSystolic.clear();
		enterSystolic.sendKeys("110");
		enterDiastolic.clear();
		enterDiastolic.sendKeys("100");

		System.out.println("Find Webelement addTestbtn");

		WebElement addTestBtn = driver.findElement(By.xpath("//*[@type='button'][2]/child::span[1]"));

		System.out.println("Find Webelement addtobtn");

		Actions act = new Actions(driver);
		act.click(addTestBtn).build().perform();

		WebElement SelectCost = driver.findElement(By.xpath("//div[@class='MuiBox-root jss1577']"));
		Select s = new Select(SelectCost);
		s.selectByIndex(1);

		WebElement SelectDiscount = driver.findElement(
				By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[2]/div/div[1]/div[1]/div[2]/div[2]/div/div"));
		Select v = new Select(SelectDiscount);
		v.selectByIndex(2);

		WebElement SelectRefery = driver.findElement(By.xpath("//input[@id='mui-1656']"));
		Select f = new Select(SelectRefery);
		f.selectByIndex(3);

		WebElement SelectCommision = driver
				.findElement(By.xpath("//div[@id='mui-component-select-doctor_commission']"));
		Select C = new Select(SelectCommision);
		C.selectByIndex(2);

		WebElement AddEquipment = driver.findElement(By.xpath("//span[@class='material-icons MuiIcon-root']"));
		AddEquipment.click();

		WebElement SelectEqipment = driver.findElement(By.xpath(" //div[@aria-label='Eqipment Name']"));
		Select E = new Select(SelectEqipment);
		E.selectByIndex(0);

		// span[@class='MuiButton-label jss1390']
		WebElement AddPatient = driver.findElement(By.xpath("//span[@class='MuiButton-label jss1390']"));
		AddPatient.click();

	}
}
