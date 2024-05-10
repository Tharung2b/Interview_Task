package baa.post_a_job;

import java.awt.AWTException;


import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Pageobjects.Budget_timeline;
import Pageobjects.Contact_info;
import Pageobjects.Design;
import Pageobjects.Project_details;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Testsele {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://hireanartist.com.au/hire/graffiti-artists");
		Thread.sleep(3000);
		List<WebElement> names=driver.findElements(By.id("artist_first_name_sp_py"));
		Thread.sleep(3000);
		List<WebElement> citynames=driver.findElements(By.xpath("//p[@class='p-s-txt mb-0 artist__info-location-txt']"));
		Thread.sleep(3000);
		HashMap<String,String> map=new HashMap<>();
		for(int i=0;i<names.size();i++) {
			map.put(names.get(i).getText(), citynames.get(i).getText());
			
		}
		for(Map.Entry<String, String> m:map.entrySet()) {
			System.out.println("Artist Name:"+m.getKey()+" "+"City Name:"+m.getValue());
			
		}
		
		System.out.println("Done");
		
		/*String givenurl="https://hireanartist.com.au/post-a-job";
		String url=driver.getCurrentUrl();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		if(url.equals(givenurl)) {
			// Test case 1
			System.out.println("Welcome you are ready to post a job, Test Case 1 passed");
			
			//Test case 2
			Project_details pd=new Project_details(driver);
			pd.getcoockie().click();
			Thread.sleep(3000);
			pd.getprojectname().click();			
			pd.getprojectname().sendKeys("Public Window Mural – Canada.");
			Thread.sleep(3000);
			pd.getmuralgo().click();
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,1000)");
			pd.getlocation().click();
			pd.getlocation().sendKeys("h");
			Thread.sleep(3000);
			Actions act=new Actions(driver);
			act.keyDown(Keys.ARROW_DOWN).build().perform();
			Thread.sleep(3000);
			act.keyDown(Keys.ENTER).build().perform();
			pd.gettype_of_property().click();
			Thread.sleep(3000);
			pd.getprojectdetails_continuebtn().click();
			System.out.println("Test Case 2 passed");
			
			
			// Test Case 3
			
			Design d = new Design(driver);
			d.getwhere_in_design().click();
			String text="We are seeking an experienced mural artist to create\r\n"
					+ "a captivating mural for a public window space measuring 5ft x 5ft in Canada";

			//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Adjust the timeout as needed

			// Wait for provide details element to be clickable
			wait.until(ExpectedConditions.elementToBeClickable(d.getprovide_details())).sendKeys(text);

			String filepath = System.getProperty("user.dir") + "\\src\\main\\java\\Resources\\baa.html.txt";

			// Using robot class
			d.getattatch().click();
			wait.until(ExpectedConditions.elementToBeClickable(d.getattatch())); // Wait for attachment element to be clickable

			Robot rb = new Robot();
			rb.delay(2000);
			StringSelection ss = new StringSelection(filepath);
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
			rb.keyPress(KeyEvent.VK_CONTROL);
			rb.keyPress(KeyEvent.VK_V);
			rb.keyRelease(KeyEvent.VK_CONTROL);
			rb.keyRelease(KeyEvent.VK_V);
			rb.keyPress(KeyEvent.VK_ENTER);
			rb.keyRelease(KeyEvent.VK_ENTER);

			// Wait for design continue button to be clickable
			wait.until(ExpectedConditions.elementToBeClickable(d.getdesign_continue())).click();

			System.out.println("Test Case 3 Passed");
			
			//Testcase 4
			Thread.sleep(3000);
			 Budget_timeline bt=new Budget_timeline(driver);
			bt.getbudget().click();
			Thread.sleep(3000);
			bt.getbudget().sendKeys("100.50");
			Thread.sleep(3000);
			//bt.getbudget_symbol().click();
			js.executeScript("arguments[0].click();", bt.getbudget_symbol());
			Thread.sleep(3000);
			bt.getbudget_symbol().sendKeys("CAD");
			Thread.sleep(2000);
			act.keyDown(Keys.ENTER).build().perform();
			bt.getbdate().click();
			Thread.sleep(2000);
			//WebElement leftarr=driver.findElement(By.cssSelector(".ant-picker-header>button:nth-child(2)"));
			WebElement date_30=driver.findElement(By.xpath("//td[@title='2024-05-03']"));// Please mention correct date don't mention already completed date
			//leftarr.click();
			date_30.click();
			bt.getbudget_timeline_continue().click();
			System.out.println("Test Case 4 Passed");
			
			//Test Case 5
			
			Contact_info ci = new Contact_info(driver);
			ci.getOrg_or_person().click();
			ci.getenter_ph_num().click();
			// Wait for enter phone number element to be clickable
			wait.until(ExpectedConditions.elementToBeClickable(ci.getenter_ph_num())).sendKeys("123456789");

			ci.getfirst_Name().sendKeys("John1");
			ci.getlast_Name().sendKeys("Doe1");
			ci.getemail().sendKeys("abc123@gmail.com");
			ci.getpassword().sendKeys("p12345p");
			ci.getterms_condn().click();

			System.out.println("Please Validate captcha manually and press enter here to continue executing the script");

			Scanner scanner = new Scanner(System.in);
			scanner.nextLine();
			
			ci.getsave_submit().click();

			System.out.println("Test case 5 completed");
			System.out.println("You have successfully posted the job");
			
		}
		else {
			System.out.println("Please check your URL");
		}
*/
	}

}
