package Cfa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;


public class CfaHome {

	public static void main(String[] args) throws FindFailed, InterruptedException {
		WebDriver driver = null; 
		//Browser initialization
		System.setProperty("webdriver.chrome.driver", "E:\\Scripts\\Selenium/chromedriver.exe");
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
		//Guest Page

		Screen screen = new Screen();

		// Create object of Pattern class and specify the images path


		Pattern image = new Pattern("E:\\Scripts\\images/First_Name.png");

		Pattern image1 = new Pattern("E:\\Scripts\\images/Last_Name.png");

		Pattern image2 = new Pattern("E:\\Scripts\\images/Email.png");

		Pattern image3 = new Pattern("E:\\Scripts\\images/Phone Number.png");

		Pattern image4 = new Pattern("E:\\Scripts\\images/Order.png");

		//First Name
		screen.type(image, "Faisal");
		//driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/section/div/div[2]/div[1]/div/input")).sendKeys("faisal");
		//Last Name
		screen.type(image1, "Nawaz");			
		//driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/section/div/div[2]/div[2]/div/input")).sendKeys("nawaz");
		//Email
		screen.type(image2, "codedsk013@gmail.com");
		//driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/section/div/div[3]/div[1]/div/input")).sendKeys("codedsk013@gmail.com");
		//Phone Number
		screen.type(image3, "000 000 0000");
		//driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/section/div/div[3]/div[2]/div/input")).sendKeys("00000000000");

		//Click on Details
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div[2]/div[2]/div/div[2]/a/button")).click();

		Boolean Display6 = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div[2]/div[2]/div/div[2]/a/button")).isDisplayed();
		if(Display6)
			System.out.println("Details Page Displayed");
		else
			System.out.println("Details page not Displayed");

		//Select Date
		driver.findElement(By.xpath("//*[@id=\"date\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/section/div/div[1]/div[1]/div/div/div/div[2]/div/div/div/div[2]/div[2]/div/div[2]/div/table/tbody/tr[3]/td[6]")).click();

		//Select Time
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/section/div/div[1]/div[2]/select")).sendKeys("10");
		//#Guest
		driver.findElement(By.name("guestCount")).sendKeys("5");
		///Special Instruction
		driver.findElement(By.className("specials")).sendKeys("Special Persons Guest");
		//Click On In This a Delivery Order
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[3]/button")).click();

		//Delivery Location Section Open 
		Boolean Display7 = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/section[2]")).isDisplayed();
		if(Display7)
			System.out.println("Delivery Location Section Displayed");
		else
			System.out.println("Delivery Location Section not Displayed");

		//Company
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/section[2]/div/div[3]/input")).sendKeys("Unit B-40");
		//Str Number
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/section[2]/div/div[4]/div[1]/input")).sendKeys("225");
		//Street Address
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/section[2]/div/div[4]/div[2]/input")).sendKeys("Peachtree Street Northeast");
		//City
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/section[2]/div/div[5]/div[1]/input")).sendKeys("Atlanta");
		//State
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/section[2]/div/div[5]/div[2]/input")).sendKeys("GA");
		//Zip
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/section[2]/div/div[5]/div[3]/input")).sendKeys("30303-1701");

		//Menu Page
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div[2]/div[2]/div/div[3]/a/button")).click();
		//Menu Page Displayed
		Boolean Display8 = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[3]/div[1]/button[2]")).isDisplayed();
		if(Display8)
			System.out.println("Menu Page Displayed");
		else
			System.out.println("Menu Page not Displayed");

		//Select Menu
		screen.click(image4);
		//driver.findElement(By.xpath("error-input Input-sc-12crgjx-0 kKIqNE")).click();
		//Cart Page Displayed
		Boolean Display9 = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[6]")).isDisplayed();
		if(Display9)
			System.out.println("Cart Page Displayed");
		else
			System.out.println("Cart Page not Displayed");

		Thread.sleep(5000);

		driver.quit();

	}


}
