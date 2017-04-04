package library_classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SetMethods {
	
	public static void Wait_Mseconds(Integer msecs) {
		try {
			Thread.sleep(msecs);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void WaitUntilEnabled(WebDriver driver, Integer secs, String ElementType, String Element) {
		// Validation by ElementType (id, className, cssSelector)
        if (ElementType == "id") {
        	WebElement myDynamicElement0 = (new WebDriverWait(driver, secs))
			  .until(ExpectedConditions.presenceOfElementLocated(By.id(Element)));
        }
        if (ElementType == "className") {
        	WebElement myDynamicElement0 = (new WebDriverWait(driver, secs))
			  .until(ExpectedConditions.presenceOfElementLocated(By.className(Element)));
        }
        if (ElementType == "cssSelector") {
        	WebElement myDynamicElement0 = (new WebDriverWait(driver, secs))
			  .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(Element)));
        }
	}
}
