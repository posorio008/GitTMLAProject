package library_classes;

import java.awt.Dimension;
import java.io.FileInputStream;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class SetReadWebURLs {

	public static void readURL(WebDriver driver, Integer row, Integer col, String FilePath) throws BiffException, IOException {
	    String strURLContent;
	    //String FilePath = "C:\\Paul\\Automation\\TMLA_Settings.xls";
		FileInputStream fs = new FileInputStream(FilePath);
		Workbook wb = Workbook.getWorkbook(fs);
		// TO get the access to the sheet
		Sheet sh = wb.getSheet("Sheet1");
		strURLContent = sh.getCell(col+5, row).getContents();
	   	driver.get(strURLContent);
	   	
	   	//Dimension d = new Dimension(1382,744); 
	    //Resize the current window to the given dimension
	    //driver.manage().window().setSize(d);
	   	//driver.manage().window().fullscreen();
	}
	
}
