package pf_or_modules;

import org.openqa.selenium.WebDriver;
import pf_object_repository.SubmitFeedbackElements;

public class SubmitFeedBackForms {
    
    // Main class to execute WebElements from Provide Feedback Experience 
    public static void SubmitFeedBack1 (String strNotes, WebDriver driver){
    	SubmitFeedbackElements.ClickOpenBTN(driver);
    	SubmitFeedbackElements.SetSelProvOrSubDDN(driver);
    	SubmitFeedbackElements.SetProvOrSubDDN1(driver);
    	SubmitFeedbackElements.SetUsefulInfoCBX(driver);
    	SubmitFeedbackElements.SetEasyNavCBX(driver);
    	SubmitFeedbackElements.SetAbleTaskCBX(driver);
    	SubmitFeedbackElements.SetRecoProdCBX(driver);
    	SubmitFeedbackElements.SetOverallExpCBX(driver);
    	SubmitFeedbackElements.SetFBackNotesTXT(strNotes,driver);
    	SubmitFeedbackElements.ClickSubmitFBBTN(driver);
    	SubmitFeedbackElements.ClickCloseBTN();
    }

    // Main class to execute WebElements from Submit a recommendation to improve the experience 
    public static void SubmitFeedBack2 (String strNotes, WebDriver driver){
    	SubmitFeedbackElements.ClickOpenBTN(driver);
    	SubmitFeedbackElements.SetSelProvOrSubDDN(driver);
    	SubmitFeedbackElements.SetProvOrSubDDN2(driver);
    	SubmitFeedbackElements.SetFBackRecomTXT(strNotes,driver);
    	SubmitFeedbackElements.SetRecoProdCBX(driver);
    	SubmitFeedbackElements.SetOverallExpCBX(driver);
    	SubmitFeedbackElements.ClickSubmitFBBTN(driver);
    	SubmitFeedbackElements.ClickCloseBTN();
    }
}
