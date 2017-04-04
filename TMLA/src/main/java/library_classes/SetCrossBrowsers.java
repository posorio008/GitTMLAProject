package library_classes;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import jxl.Sheet;
import jxl.read.biff.BiffException;
import pf_object_repository.SubmitFeedbackElements;
import pf_or_modules.SubmitFeedBackForms;

public class SetCrossBrowsers {

	public static void ChromeInstance(Integer row, Integer col, SubmitFeedbackElements objProvideFeedback, String FilePath) throws BiffException, IOException {
		SetReadDrivers.readChromeDriver(row,col, FilePath);
		//System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		SetReadWebURLs.readURL(driver,row,col,FilePath);
		SetMethods.Wait_Mseconds(4000);
	    objProvideFeedback = new SubmitFeedbackElements(driver);
	    SubmitFeedBackForms.SubmitFeedBack1("Good Feedback form...Both forms are actually detailed and concise.", driver);
	    SubmitFeedBackForms.SubmitFeedBack2("Good Feedback Recommendation form...", driver);
	  	driver.quit();
	}


	public static void FireFoxInstance(Sheet sh, Integer row, Integer col, SubmitFeedbackElements objProvideFeedback, String FilePath) throws BiffException, IOException {
		String strFFXpath;
		SetReadDrivers.readExcelGeckoPath(row,col, FilePath);
	    strFFXpath = sh.getCell(col+3, row).getContents();
	    System.out.println ("main firefox path: "+ strFFXpath);
	    //Now you can Initialize marionette driver to launch firefox
	    DesiredCapabilities capabilities = DesiredCapabilities.firefox();
	    capabilities.setCapability("marionette", true);
	    //File pathToBinary = new File("C:\\users\\posorio008\\AppData\\Local\\Mozilla Firefox\\firefox.exe");
	    File pathToBinary = new File(strFFXpath);
	    FirefoxBinary ffBinary = new FirefoxBinary(pathToBinary);
	    FirefoxProfile firefoxProfile = new FirefoxProfile(); 
	    WebDriver driver = new FirefoxDriver(ffBinary,firefoxProfile);
	    SetReadWebURLs.readURL(driver,row,col,FilePath);
	    SetMethods.Wait_Mseconds(4000);
	    
	    objProvideFeedback = new SubmitFeedbackElements(driver);
	    SubmitFeedBackForms.SubmitFeedBack1("Good Feedback form...Both forms are actually detailed and concise.", driver);
	    SubmitFeedBackForms.SubmitFeedBack2("Good Feedback Recommendation form...", driver);
	    driver.quit();
	}
	
	public static void IEInstance (Sheet sh, Integer row, Integer col, SubmitFeedbackElements objProvideFeedback, String FilePath) throws BiffException, IOException {
		System.out.println("am here! under IEInstance"+" "+row+" "+" "+col+" "+FilePath);
		
		SetReadDrivers.readIEDriver(row, col, FilePath);
		
		DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
		capabilities.setCapability(InternetExplorerDriver.IE_ENSURE_CLEAN_SESSION, true);
		capabilities.setCapability(InternetExplorerDriver.NATIVE_EVENTS, false);
		capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
		capabilities.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);
		capabilities.setCapability("allow-blocked-content", true);
		capabilities.setCapability("allowBlockedContent", true);
		capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		String strURLContent = sh.getCell(col+5, row).getContents();
		System.out.println("My column URL value: "+strURLContent);
		//capabilities.setCapability(InternetExplorerDriver.INITIAL_BROWSER_URL, "http://13.68.247.161:3030/#/dashboard");
		capabilities.setCapability(InternetExplorerDriver.INITIAL_BROWSER_URL, strURLContent);

		SetMethods.Wait_Mseconds(4000);
		WebDriver driver = new InternetExplorerDriver(capabilities);

		SetReadWebURLs.readURL(driver,row,col,FilePath);
	    objProvideFeedback = new SubmitFeedbackElements(driver);
	    SubmitFeedBackForms.SubmitFeedBack1("Good Feedback form...Both forms are actually detailed and concise.", driver);
	    SubmitFeedBackForms.SubmitFeedBack2("Good Feedback Recommendation form...", driver);
	    driver.quit();
	
	
	}	
}
