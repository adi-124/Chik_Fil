package Cfa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CfaHome {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = null; 

		//Browser initialization
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\Chrome Webdriver\\chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver(); 
		driver.get("https://qa.order-management.cfahome.com/");

		driver.manage().window().maximize();
		Thread.sleep(3000);

		//Validation On User_Name Page
		Boolean Display = driver.findElement(By.xpath("//*[@id=\"form32\"]/div[1]/div[2]/div[1]/div[1]/label")).isDisplayed();

		if (Display) {
			System.out.println("User_Name Page Will be Displayed");
		}else {
			System.out.println("User_Name Page not  Displayed");
		}

		
		//User Name
		driver.findElement(By.id("okta-signin-username")).sendKeys("faisal.nawaz");
		driver.findElement(By.id("okta-signin-submit")).click();

//		Thread.sleep(3000);
//		//Validation On Correct User_Name
//		
//		//Boolean Display1 = driver.findElement(By.xpath("//*[@id=\"form32\"]/div[1]/div[1]/div/div/p")).isDisplayed();
//		Boolean Display1 = driver.findElement(By.xpath("//*[@id=\"input-container-error59\"] | //*[@id=\\\"input-container-error895\\\"]")).isDisplayed();
//
//		if (Display1) {
//			System.out.println("Please Enter Correct User name");
//		}else {
//			System.out.println("User_Name is Correct");
//		}

		Thread.sleep(3000);
		//Validation On Password Page
		Boolean Display3 = driver.findElement(By.xpath("//*[@id=\"signin-container\"]")).isDisplayed();

		if (Display3) {
			System.out.println("Password Page Will be Displayed");
		}else {
			System.out.println("Password Page not  Displayed");
		}
		Thread.sleep(3000);
		//Password
		driver.findElement(By.id("input72")).sendKeys("bphMRkAucVLX");
		//Click On Verify Button
		driver.findElement(By.xpath("/html/body/div[2]/div/main/div[2]/div/div/form/div[2]/input")).click();

//		//Validation On Correct Password
//		Boolean Display4 = driver.findElement(By.xpath("/html/body/div[2]/div/main/div[2]/div/div/form/div[1]/div[1]/div/div")).isDisplayed();
//
//		if (Display4) {
//			System.out.println("Please Enter Correct Password");
//		}else {
//			System.out.println("User Name & Password is Verified");
//		}

		Thread.sleep(3000);
		//DashBoard
		Boolean Display5 = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]")).isDisplayed();
		if(Display5)
			System.out.println("Login is Successfully");
		else
			System.out.println("Login Not Successfull");
		
		Thread.sleep(5000);
		driver.quit();

		//Successfully
	}

}
