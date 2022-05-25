package form;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

class Form_sel {

	@Test
	//basic information
	public void Account() throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", "C:\\sel\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.get("http://localhost/activity");
		driver.manage().window().maximize();
		//url of the web page
		System.out.println(driver.getCurrentUrl());
		//title of web page
		System.out.println(driver.getTitle());
		//email testcases
		WebElement houve= driver.findElement(By.id("email"));
		Actions actions = new Actions(driver);
		actions.moveToElement(houve).perform();
		actions.click().build().perform();
		Thread.sleep(2000);
		driver.findElement(By.id("reset")).click();
		driver.findElement(By.id("email"));
		driver.findElement(By.id("submit")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("reset")).click();
		driver.findElement(By.id("email")).sendKeys("bhavanagmail.com");
		driver.findElement(By.id("submit")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("reset")).click();
		driver.findElement(By.id("email")).sendKeys("bhavana$gmail.com");
		driver.findElement(By.id("submit")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("reset")).click();
		driver.findElement(By.id("email")).sendKeys("bhavana@gmailcom");
		driver.findElement(By.id("submit")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("reset")).click();
		driver.findElement(By.id("email")).sendKeys("bhavana@gmail.com");
		driver.findElement(By.id("submit")).click();
		driver.findElement(By.id("reset")).click();
		Thread.sleep(4000);
		//password & retypepassword
		driver.findElement(By.id("email")).sendKeys("bhavana@gmail.com");
		driver.findElement(By.id("password1"));
		driver.findElement(By.id("submit")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("reset")).click();
		driver.findElement(By.id("email")).sendKeys("bhavana@gmail.com");
		driver.findElement(By.id("password1")).sendKeys("tree");
		driver.findElement(By.id("submit")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("reset")).click();
		driver.findElement(By.id("email")).sendKeys("bhavana@gmail.com");
		driver.findElement(By.id("password1")).sendKeys("1234567890");
		driver.findElement(By.id("submit")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("reset")).click();
		driver.findElement(By.id("email")).sendKeys("bhavana@gmail.com");
		driver.findElement(By.id("password1")).sendKeys("1234567890");
		driver.findElement(By.id("Retypepassword")).sendKeys("1234");
		driver.findElement(By.id("submit")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("reset")).click();
		driver.findElement(By.id("email")).sendKeys("bhavana@gmail.com");
		driver.findElement(By.id("password1")).sendKeys("1234567890");
		driver.findElement(By.id("Retypepassword")).sendKeys("1234567890");
		driver.findElement(By.id("submit")).click();
		Thread.sleep(4000);
		//firstname
		driver.findElement(By.id("reset")).click();
		driver.findElement(By.id("email")).sendKeys("bhavana@gmail.com");
		driver.findElement(By.id("password1")).sendKeys("1234567890");
		driver.findElement(By.id("Retypepassword")).sendKeys("1234567890");
		driver.findElement(By.id("fname"));
		driver.findElement(By.id("submit")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("reset")).click();
		driver.findElement(By.id("email")).sendKeys("bhavana@gmail.com");
		driver.findElement(By.id("password1")).sendKeys("1234567890");
		driver.findElement(By.id("Retypepassword")).sendKeys("1234567890");
		driver.findElement(By.id("fname")).sendKeys("bhavanadonthi");
		driver.findElement(By.id("submit")).click();
		Thread.sleep(4000);
		//lastname
		driver.findElement(By.id("reset")).click();
		driver.findElement(By.id("email")).sendKeys("bhavana@gmail.com");
		driver.findElement(By.id("password1")).sendKeys("1234567890");
		driver.findElement(By.id("Retypepassword")).sendKeys("1234567890");
		driver.findElement(By.id("fname")).sendKeys("bhavanadonthi");
		driver.findElement(By.id("lname"));
		driver.findElement(By.id("submit")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("reset")).click();
		driver.findElement(By.id("email")).sendKeys("bhavana@gmail.com");
		driver.findElement(By.id("password1")).sendKeys("1234567890");
		driver.findElement(By.id("Retypepassword")).sendKeys("1234567890");
		driver.findElement(By.id("fname")).sendKeys("bhavanadonthi");
		driver.findElement(By.id("lname")).sendKeys("reddy");
		driver.findElement(By.id("submit")).click();
		Thread.sleep(4000);
		//phone number
				driver.findElement(By.id("reset")).click();
				driver.findElement(By.id("email")).sendKeys("bhavana@gmail.com");
				driver.findElement(By.id("password1")).sendKeys("1234567890");
				driver.findElement(By.id("Retypepassword")).sendKeys("1234567890");
				driver.findElement(By.id("fname")).sendKeys("bhavanadonthi");
				driver.findElement(By.id("lname")).sendKeys("reddy");
				driver.findElement(By.id("pno"));
				driver.findElement(By.id("submit")).click();
				Thread.sleep(4000);
				driver.findElement(By.id("reset")).click();
				driver.findElement(By.id("email")).sendKeys("bhavana@gmail.com");
				driver.findElement(By.id("password1")).sendKeys("1234567890");
				driver.findElement(By.id("Retypepassword")).sendKeys("1234567890");
				driver.findElement(By.id("fname")).sendKeys("bhavanadonthi");
				driver.findElement(By.id("lname")).sendKeys("reddy");
				driver.findElement(By.id("pno")).sendKeys("1234567898");
				driver.findElement(By.id("submit")).click();
				Thread.sleep(4000);
				driver.findElement(By.id("reset")).click();
				driver.findElement(By.id("email")).sendKeys("bhavana@gmail.com");
				driver.findElement(By.id("password1")).sendKeys("1234567890");
				driver.findElement(By.id("Retypepassword")).sendKeys("123456ab90");
				driver.findElement(By.id("fname")).sendKeys("bhavanadonthi");
				driver.findElement(By.id("lname")).sendKeys("reddy");
				driver.findElement(By.id("pno")).sendKeys("123-456-7898");
				driver.findElement(By.id("submit")).click();
				//Address
				Thread.sleep(4000);
				driver.findElement(By.id("reset")).click();
				driver.findElement(By.id("email")).sendKeys("bhavana@gmail.com");
				driver.findElement(By.id("password1")).sendKeys("1234567890");
				driver.findElement(By.id("Retypepassword")).sendKeys("123456ab90");
				driver.findElement(By.id("fname")).sendKeys("bhavanadonthi");
				driver.findElement(By.id("lname")).sendKeys("reddy");
				driver.findElement(By.id("pno")).sendKeys("123-456-7898");
				driver.findElement(By.id("add"));
				driver.findElement(By.id("submit")).click();
				Thread.sleep(4000);
				driver.findElement(By.id("reset")).click();
				driver.findElement(By.id("email")).sendKeys("bhavana@gmail.com");
				driver.findElement(By.id("password1")).sendKeys("1234567890");
				driver.findElement(By.id("Retypepassword")).sendKeys("123456ab90");
				driver.findElement(By.id("fname")).sendKeys("bhavanadonthi");
				driver.findElement(By.id("lname")).sendKeys("reddy");
				driver.findElement(By.id("pno")).sendKeys("123-456-7898");
				driver.findElement(By.id("add")).sendKeys("4390downtown");
				driver.findElement(By.id("submit")).click();
				//City
				Thread.sleep(4000);
				driver.findElement(By.id("reset")).click();
				driver.findElement(By.id("email")).sendKeys("bhavana@gmail.com");
				driver.findElement(By.id("password1")).sendKeys("1234567890");
				driver.findElement(By.id("Retypepassword")).sendKeys("123456ab90");
				driver.findElement(By.id("fname")).sendKeys("bhavanadonthi");
				driver.findElement(By.id("lname")).sendKeys("reddy");
				driver.findElement(By.id("pno")).sendKeys("123-456-7898");
				driver.findElement(By.id("add")).sendKeys("4390downtown");
				driver.findElement(By.id("city"));
				driver.findElement(By.id("submit")).click();
				Thread.sleep(4000);
				driver.findElement(By.id("reset")).click();
				driver.findElement(By.id("email")).sendKeys("bhavana@gmail.com");
				driver.findElement(By.id("password1")).sendKeys("1234567890");
				driver.findElement(By.id("Retypepassword")).sendKeys("123456ab90");
				driver.findElement(By.id("fname")).sendKeys("bhavanadonthi");
				driver.findElement(By.id("lname")).sendKeys("reddy");
				driver.findElement(By.id("pno")).sendKeys("123-456-7898");
				driver.findElement(By.id("add")).sendKeys("4390downtown");
				driver.findElement(By.id("city")).sendKeys("Montreal");
				driver.findElement(By.id("submit")).click();
				//Province
				Thread.sleep(4000);
				driver.findElement(By.id("reset")).click();
				driver.findElement(By.id("email")).sendKeys("bhavana@gmail.com");
				driver.findElement(By.id("password1")).sendKeys("1234567890");
				driver.findElement(By.id("Retypepassword")).sendKeys("123456ab90");
				driver.findElement(By.id("fname")).sendKeys("bhavanadonthi");
				driver.findElement(By.id("lname")).sendKeys("reddy");
				driver.findElement(By.id("pno")).sendKeys("123-456-7898");
				driver.findElement(By.id("add")).sendKeys("4390downtown");
				driver.findElement(By.id("city")).sendKeys("Montreal");
				Select province = new Select(driver.findElement(By.id("myList")));
				province.selectByVisibleText("BC");
				System.out.println(province);
				driver.findElement(By.id("submit")).click();
				//Country
				Thread.sleep(4000);
				driver.findElement(By.id("reset")).click();
				driver.findElement(By.id("email")).sendKeys("bhavana@gmail.com");
				driver.findElement(By.id("password1")).sendKeys("1234567890");
				driver.findElement(By.id("Retypepassword")).sendKeys("123456ab90");
				driver.findElement(By.id("fname")).sendKeys("bhavanadonthi");
				driver.findElement(By.id("lname")).sendKeys("reddy");
				driver.findElement(By.id("pno")).sendKeys("123-456-7898");
				driver.findElement(By.id("add")).sendKeys("4390downtown");
				driver.findElement(By.id("city")).sendKeys("Montreal");
				Select province1 = new Select(driver.findElement(By.id("myList")));
				province1.selectByVisibleText("BC");
				driver.findElement(By.id("country"));
				driver.findElement(By.id("submit")).click();
				Thread.sleep(4000);
				driver.findElement(By.id("reset")).click();
				driver.findElement(By.id("email")).sendKeys("bhavana@gmail.com");
				driver.findElement(By.id("password1")).sendKeys("1234567890");
				driver.findElement(By.id("Retypepassword")).sendKeys("123456ab90");
				driver.findElement(By.id("fname")).sendKeys("bhavanadonthi");
				driver.findElement(By.id("lname")).sendKeys("reddy");
				driver.findElement(By.id("pno")).sendKeys("123-456-7898");
				driver.findElement(By.id("add")).sendKeys("4390downtown");
				driver.findElement(By.id("city")).sendKeys("Montreal");
				Select province2 = new Select(driver.findElement(By.id("myList")));
				province2.selectByVisibleText("BC");
				driver.findElement(By.id("country")).sendKeys("Canada");
				driver.findElement(By.id("submit")).click();
				driver.close();
	}
	@Test
	public void Education() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\sel\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.get("http://localhost/activity");
		driver.manage().window().maximize();
		//School box
		driver.findElement(By.id("email")).sendKeys("bhavana@gmail.com");
		driver.findElement(By.id("password1")).sendKeys("1234567890");
		driver.findElement(By.id("Retypepassword")).sendKeys("123456ab90");
		driver.findElement(By.id("fname")).sendKeys("bhavanadonthi");
		driver.findElement(By.id("lname")).sendKeys("reddy");
		driver.findElement(By.id("pno")).sendKeys("123-456-7898");
		driver.findElement(By.id("add")).sendKeys("4390downtown");
		driver.findElement(By.id("city")).sendKeys("Montreal");
		Select province1 = new Select(driver.findElement(By.id("myList")));
		province1.selectByVisibleText("BC");
		driver.findElement(By.id("country")).sendKeys("Canada");
		driver.findElement(By.id("school"));
		driver.findElement(By.id("submit")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("reset")).click();
		driver.findElement(By.id("email")).sendKeys("bhavana@gmail.com");
		driver.findElement(By.id("password1")).sendKeys("1234567890");
		driver.findElement(By.id("Retypepassword")).sendKeys("123456ab90");
		driver.findElement(By.id("fname")).sendKeys("bhavanadonthi");
		driver.findElement(By.id("lname")).sendKeys("reddy");
		driver.findElement(By.id("pno")).sendKeys("123-456-7898");
		driver.findElement(By.id("add")).sendKeys("4390downtown");
		driver.findElement(By.id("city")).sendKeys("Montreal");
		Select province2 = new Select(driver.findElement(By.id("myList")));
		province2.selectByVisibleText("BC");
		driver.findElement(By.id("country")).sendKeys("Canada");
		driver.findElement(By.id("school")).sendKeys("Cegep");
		driver.findElement(By.id("submit")).click();
		//Program
		Thread.sleep(4000);
		driver.findElement(By.id("reset")).click();
		driver.findElement(By.id("email")).sendKeys("bhavana@gmail.com");
		driver.findElement(By.id("password1")).sendKeys("1234567890");
		driver.findElement(By.id("Retypepassword")).sendKeys("123456ab90");
		driver.findElement(By.id("fname")).sendKeys("bhavanadonthi");
		driver.findElement(By.id("lname")).sendKeys("reddy");
		driver.findElement(By.id("pno")).sendKeys("123-456-7898");
		driver.findElement(By.id("add")).sendKeys("4390downtown");
		driver.findElement(By.id("city")).sendKeys("Montreal");
		Select province3 = new Select(driver.findElement(By.id("myList")));
		province3.selectByVisibleText("BC");
		driver.findElement(By.id("country")).sendKeys("Canada");
		driver.findElement(By.id("school")).sendKeys("Cegep");
		driver.findElement(By.id("program"));
		driver.findElement(By.id("submit")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("reset")).click();
		driver.findElement(By.id("email")).sendKeys("bhavana@gmail.com");
		driver.findElement(By.id("password1")).sendKeys("1234567890");
		driver.findElement(By.id("Retypepassword")).sendKeys("123456ab90");
		driver.findElement(By.id("fname")).sendKeys("bhavanadonthi");
		driver.findElement(By.id("lname")).sendKeys("reddy");
		driver.findElement(By.id("pno")).sendKeys("123-456-7898");
		driver.findElement(By.id("add")).sendKeys("4390downtown");
		driver.findElement(By.id("city")).sendKeys("Montreal");
		Select province4 = new Select(driver.findElement(By.id("myList")));
		province4.selectByVisibleText("BC");
		driver.findElement(By.id("country")).sendKeys("Canada");
		driver.findElement(By.id("school")).sendKeys("Cegep");
		driver.findElement(By.id("program")).sendKeys("CST");
		//driver.findElement(By.id("submit")).click();
		//Educationlevel
		Thread.sleep(4000);
		driver.findElement(By.id("reset")).click();
		driver.findElement(By.id("email")).sendKeys("bhavana@gmail.com");
		driver.findElement(By.id("password1")).sendKeys("1234567890");
		driver.findElement(By.id("Retypepassword")).sendKeys("123456ab90");
		driver.findElement(By.id("fname")).sendKeys("bhavanadonthi");
		driver.findElement(By.id("lname")).sendKeys("reddy");
		driver.findElement(By.id("pno")).sendKeys("123-456-7898");
		driver.findElement(By.id("add")).sendKeys("4390downtown");
		driver.findElement(By.id("city")).sendKeys("Montreal");
		Select province5 = new Select(driver.findElement(By.id("myList")));
		province5.selectByVisibleText("BC");
		driver.findElement(By.id("country")).sendKeys("Canada");
		driver.findElement(By.id("school")).sendKeys("Cegep");
		driver.findElement(By.id("program")).sendKeys("CST");
		Select province6 = new Select(driver.findElement(By.xpath("//*[@id=\"myList2\"]")));
		province6.selectByVisibleText("b.tech");
		//driver.findElement(By.id("submit")).click();
		//Education_status
		Thread.sleep(4000);
		driver.findElement(By.id("reset")).click();
		driver.findElement(By.id("email")).sendKeys("bhavana@gmail.com");
		driver.findElement(By.id("password1")).sendKeys("1234567890");
		driver.findElement(By.id("Retypepassword")).sendKeys("123456ab90");
		driver.findElement(By.id("fname")).sendKeys("bhavanadonthi");
		driver.findElement(By.id("lname")).sendKeys("reddy");
		driver.findElement(By.id("pno")).sendKeys("123-456-7898");
		driver.findElement(By.id("add")).sendKeys("4390downtown");
		driver.findElement(By.id("city")).sendKeys("Montreal");
		Select province7 = new Select(driver.findElement(By.id("myList")));
		province7.selectByVisibleText("BC");
		driver.findElement(By.id("country")).sendKeys("Canada");
		driver.findElement(By.id("school")).sendKeys("Cegep");
		driver.findElement(By.id("program")).sendKeys("CST");
		Select province8 = new Select(driver.findElement(By.xpath("//*[@id=\"myList2\"]")));
		province8.selectByVisibleText("diploma");
		WebElement radio1 = driver.findElement(By.xpath("//*[@id=\"dataform\"]/fieldset/label[1]"));
		radio1.click();
		Thread.sleep(4000);
		WebElement radio2 = driver.findElement(By.xpath("//*[@id=\"dataform\"]/fieldset/label[2]"));
		radio2.click();
		Thread.sleep(4000);
		WebElement radio3 = driver.findElement(By.xpath("//*[@id=\"dataform\"]/fieldset/label[3]"));
		radio3.click();
		Thread.sleep(4000);
		//Graduation date
		WebElement ele = driver.findElement(By.name("graduationdate"));
		ele.sendKeys("10june2020");
		Thread.sleep(2000);
		ele.clear();
		Thread.sleep(2000);
		ele.sendKeys("10june2022");
		//driver.findElement(By.id("submit")).click(); 
		driver.close();
	}
		@Test
		public void WorkExperience() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\sel\\drivers\\chromedriver.exe");
			WebDriver driver = new ChromeDriver(); 
			driver.get("http://localhost/activity");
			driver.manage().window().maximize();
			driver.findElement(By.id("email")).sendKeys("bhavana@gmail.com");
			driver.findElement(By.id("password1")).sendKeys("1234567890");
			driver.findElement(By.id("Retypepassword")).sendKeys("123456ab90");
			driver.findElement(By.id("fname")).sendKeys("bhavanadonthi");
			driver.findElement(By.id("lname")).sendKeys("reddy");
			driver.findElement(By.id("pno")).sendKeys("123-456-7898");
			driver.findElement(By.id("add")).sendKeys("4390downtown");
			driver.findElement(By.id("city")).sendKeys("Montreal");
			Select province7 = new Select(driver.findElement(By.id("myList")));
			province7.selectByVisibleText("BC");
			driver.findElement(By.id("country")).sendKeys("Canada");
			driver.findElement(By.id("school")).sendKeys("Cegep");
			driver.findElement(By.id("program")).sendKeys("CST");
			Select province8 = new Select(driver.findElement(By.xpath("//*[@id=\"myList2\"]")));
			province8.selectByVisibleText("diploma");
			WebElement radio1 = driver.findElement(By.xpath("//*[@id=\"dataform\"]/fieldset/label[1]"));
			radio1.click();
			Thread.sleep(4000);
			WebElement radio2 = driver.findElement(By.xpath("//*[@id=\"dataform\"]/fieldset/label[2]"));
			radio2.click();
			Thread.sleep(4000);
			WebElement radio3 = driver.findElement(By.xpath("//*[@id=\"dataform\"]/fieldset/label[3]"));
			radio3.click();
			Thread.sleep(4000);
			WebElement ele = driver.findElement(By.name("graduationdate"));
			ele.sendKeys("10june2020");
			Thread.sleep(2000);
			ele.clear();
			Thread.sleep(2000);
			ele.sendKeys("10june2022");
			//employer
			WebElement ele1 = driver.findElement(By.name("employer"));
			ele1.sendKeys("parttime");
			Thread.sleep(2000);
			ele1.clear();
			Thread.sleep(2000);
			ele1.sendKeys("fulltime");
			//JobTitle
			WebElement ele2 = driver.findElement(By.name("jobtitle"));
			ele2.sendKeys("software testing");
			Thread.sleep(2000);
			ele2.clear();
			Thread.sleep(2000);
			ele2.sendKeys("web development front end ");
			//JobDuty
			WebElement ele3 = driver.findElement(By.name("jobduty"));
			ele3.sendKeys("$$$$$$$$$$$$");
			Thread.sleep(2000);
			ele3.clear();
			Thread.sleep(2000);
			ele3.sendKeys("developing the websites with the react and vue js");
			Thread.sleep(2000);
			//Workedyear
			WebElement work = driver.findElement(By.id("workedyear"));
			work.sendKeys(Keys.UP);
			Thread.sleep(2000);
			work.sendKeys(Keys.UP);
			Thread.sleep(2000);
			work.sendKeys(Keys.DOWN);
			Thread.sleep(2000);
			driver.close();
		}
		@Test
		public void Upload() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\sel\\drivers\\chromedriver.exe");
			WebDriver driver = new ChromeDriver(); 
			driver.get("http://localhost/activity");
			driver.manage().window().maximize();
			driver.findElement(By.id("email")).sendKeys("bhavana@gmail.com");
			driver.findElement(By.id("password1")).sendKeys("1234567890");
			driver.findElement(By.id("Retypepassword")).sendKeys("123456ab90");
			driver.findElement(By.id("fname")).sendKeys("bhavanadonthi");
			driver.findElement(By.id("lname")).sendKeys("reddy");
			driver.findElement(By.id("pno")).sendKeys("123-456-7898");
			driver.findElement(By.id("add")).sendKeys("4390downtown");
			driver.findElement(By.id("city")).sendKeys("Montreal");
			Select province7 = new Select(driver.findElement(By.id("myList")));
			province7.selectByVisibleText("BC");
			driver.findElement(By.id("country")).sendKeys("Canada");
			driver.findElement(By.id("school")).sendKeys("Cegep");
			driver.findElement(By.id("program")).sendKeys("CST");
			Select province8 = new Select(driver.findElement(By.xpath("//*[@id=\"myList2\"]")));
			province8.selectByVisibleText("diploma");
			WebElement radio1 = driver.findElement(By.xpath("//*[@id=\"dataform\"]/fieldset/label[1]"));
			radio1.click();
			Thread.sleep(4000);
			WebElement radio2 = driver.findElement(By.xpath("//*[@id=\"dataform\"]/fieldset/label[2]"));
			radio2.click();
			Thread.sleep(4000);
			WebElement radio3 = driver.findElement(By.xpath("//*[@id=\"dataform\"]/fieldset/label[3]"));
			radio3.click();
			Thread.sleep(4000);
			WebElement ele = driver.findElement(By.name("graduationdate"));
			ele.sendKeys("10june2020");
			Thread.sleep(2000);
			ele.clear();
			Thread.sleep(2000);
			ele.sendKeys("10june2022");
			//employer
			WebElement ele1 = driver.findElement(By.name("employer"));
			ele1.sendKeys("parttime");
			Thread.sleep(2000);
			ele1.clear();
			Thread.sleep(2000);
			ele1.sendKeys("fulltime");
			//JobTitle
			WebElement ele2 = driver.findElement(By.name("jobtitle"));
			ele2.sendKeys("software testing");
			Thread.sleep(2000);
			ele2.clear();
			Thread.sleep(2000);
			ele2.sendKeys("web development front end ");
			//JobDuty
			WebElement ele3 = driver.findElement(By.name("jobduty"));
			ele3.sendKeys("$$$$$$$$$$$$");
			Thread.sleep(2000);
			ele3.clear();
			Thread.sleep(2000);
			ele3.sendKeys("developing the websites with the react and vue js");
			Thread.sleep(2000);
			//Workedyear
			WebElement work = driver.findElement(By.id("workedyear"));
			work.sendKeys(Keys.UP);
			Thread.sleep(2000);
			work.sendKeys(Keys.UP);
			Thread.sleep(2000);
			work.sendKeys(Keys.DOWN);
			Thread.sleep(2000);
			//Attachments
			WebElement upload = driver.findElement(By.xpath("//*[@id=\"bfile\"]"));
			upload.sendKeys("C:\\Users\\donth\\OneDrive\\Desktop\\ISTQB-CTFL_Syllabus_2018_V3.1.pdf");
			Thread.sleep(4000);
			driver.findElement(By.id("submit")).click();
			
		}
		
		
		
		
	
	


}

