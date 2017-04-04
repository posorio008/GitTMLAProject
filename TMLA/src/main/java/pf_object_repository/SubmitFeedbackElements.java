package pf_object_repository;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import library_classes.SetMethods;

public class SubmitFeedbackElements {

	WebDriver driver;

	//Feedback Open - Initial Button.
	@FindBy(id="btn-feedback-open")
	static
    WebElement ButtonOpenBTN;
	

	//What would you like to do dropdown
	@FindBy(id="select_do")
	static
    WebElement SelProvOrSubDDN;

	
	//What would you like to do dropdown -> First Selection
	@FindBy(id="select_provide")
	static
	WebElement ProvOrSubDDN1;
	
	//What would you like to do dropdown -> Second Selection
	@FindBy(id="select_submit")
	static
	WebElement ProvOrSubDDN2;

	//Dashboard useful rate
	@FindBy(id="select_dashboard_useful_very_good")
	static
    WebElement UsefulInfoCBX;

	//Easy Navigation rate
	@FindBy(id="select_easy_navigate_good")
	static
    WebElement EasyNavCBX;
	
	//Able to complete your task
	@FindBy(id="select_complete_task_somewhat")
	static
    WebElement AbleTaskCBX;
	
	//Recommend product to a colleague or friend
	@FindBy(id="select_recommend_product_8")
	static
    WebElement RecoProdCBX;

	//Overall Experience rate
	@FindBy(id="select_overall_experience_very_good")
	static
	WebElement OverallExpCBX;

	//Feedback Notes
	@FindBy(id="suggestion")
	static
    WebElement FBackNotesTXT;
	
	//Recommendation Notes (Second form)
	@FindBy(id="recommendation")
	static
    WebElement FBackRecomTXT;
	
	//Submit Feedback Button
	@FindBy(id="submit_feedback")
	static
    WebElement SubmitFBBTN;
	
	//Close Feedback 
	@FindBy(id="btn-feedback-close")
	static
    WebElement ButtonCloseBTN;

		

	public static void ClickOpenBTN(WebDriver driver){
		SetMethods.Wait_Mseconds(2000);
		
		WebDriverWait wait = new WebDriverWait(driver, 6000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("btn-feedback-open")));
		
    	//WebElement myDynamicElement0 = (new WebDriverWait(driver, 60))
		//  .until(ExpectedConditions.presenceOfElementLocated(By.id("btn-feedback-open")));
    	ButtonOpenBTN.click();
    }
 
    public static void SetSelProvOrSubDDN(WebDriver driver){
    	SetMethods.Wait_Mseconds(1000);
		WebDriverWait wait = new WebDriverWait(driver, 40);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("select_do")));
    	SelProvOrSubDDN.click();
    	
    }
    
    public static void SetProvOrSubDDN1(WebDriver driver){
    	SetMethods.Wait_Mseconds(1000);
		WebDriverWait wait = new WebDriverWait(driver, 40);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("select_provide")));
    	ProvOrSubDDN1.click();  //id= select_provide
    }

    public static void SetProvOrSubDDN2(WebDriver driver){
    	SetMethods.Wait_Mseconds(1000);
		WebDriverWait wait = new WebDriverWait(driver, 40);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("select_submit")));
    	ProvOrSubDDN2.click();  //id= select_submit
    }
    
    
    public static void SetUsefulInfoCBX(WebDriver driver){
    	SetMethods.Wait_Mseconds(1000);
		WebDriverWait wait = new WebDriverWait(driver, 40);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("select_dashboard_useful_very_good")));
    	UsefulInfoCBX.click();
    }

    public static void SetEasyNavCBX(WebDriver driver){
    	SetMethods.Wait_Mseconds(1000);
		WebDriverWait wait = new WebDriverWait(driver, 40);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("select_easy_navigate_good")));
    	EasyNavCBX.click();
    }    

    public static void SetAbleTaskCBX(WebDriver driver){
    	SetMethods.Wait_Mseconds(1000);
		WebDriverWait wait = new WebDriverWait(driver, 400);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("select_complete_task_somewhat")));
    	String strdriver = driver.toString();
    	if  (strdriver.substring(0,6).equals("Chrome"))
    	   	AbleTaskCBX.sendKeys(Keys.BACK_SPACE);
    	else
    	    AbleTaskCBX.click();
    	
    }  
 
    public static void SetRecoProdCBX(WebDriver driver){
    	SetMethods.Wait_Mseconds(1000);
		WebDriverWait wait = new WebDriverWait(driver, 40);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("select_recommend_product_8")));
    	RecoProdCBX.click();
    }  

    public static void SetOverallExpCBX(WebDriver driver){
    	SetMethods.Wait_Mseconds(1000);
		WebDriverWait wait = new WebDriverWait(driver, 40);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("select_overall_experience_very_good")));
    	OverallExpCBX.click();
    }    

    public static void SetFBackNotesTXT(String strNotes, WebDriver driver){
    	SetMethods.Wait_Mseconds(1000);
		WebDriverWait wait = new WebDriverWait(driver, 40);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("suggestion")));
    	FBackNotesTXT.sendKeys(strNotes);
    } 
 
    public static void SetFBackRecomTXT(String strNotes, WebDriver driver){
    	SetMethods.Wait_Mseconds(1000);
		WebDriverWait wait = new WebDriverWait(driver, 40);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("recommendation")));
     	FBackRecomTXT.sendKeys(strNotes);
    } 
    
    public static void ClickSubmitFBBTN(WebDriver driver){
    	SetMethods.Wait_Mseconds(2000);
    	WebDriverWait wait = new WebDriverWait(driver, 40);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("submit_feedback")));
     	SubmitFBBTN.click();
    	SetMethods.Wait_Mseconds(2000);
    }
    
    public static void ClickCloseBTN(){
    	ButtonCloseBTN.click();
    	SetMethods.Wait_Mseconds(2000);
    }
  
 	public SubmitFeedbackElements(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}