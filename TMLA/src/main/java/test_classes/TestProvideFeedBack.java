package test_classes;

import java.io.FileInputStream;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import library_classes.SetCrossBrowsers;
import pf_object_repository.SubmitFeedbackElements;

public class TestProvideFeedBack {
    WebDriver driver;
    SubmitFeedbackElements objProvideFeedback;

    @Test
    public void setup() throws BiffException, IOException{
	    String strContent;
		String FilePath = "C:\\Paul\\Automation\\TMLA_Settings.xls";
		FileInputStream fs = new FileInputStream(FilePath);
		Workbook wb = Workbook.getWorkbook(fs);
		Sheet sh = wb.getSheet("Sheet1");
		int totalNoOfRows = sh.getRows();
		int totalNoOfCols = sh.getColumns();
		for (int row = 1; row < totalNoOfRows; row++) {
			for (int col = 0; col < totalNoOfCols; col++) {
				System.out.print(sh.getCell(col, row).getContents() + "\t");
				strContent = sh.getCell(col, row).getContents();
				System.out.println("my strcontent =" + col + row + strContent);
				
				
				if (sh.getCell(col, row).getContents().contentEquals("Chrome")){
					SetCrossBrowsers.ChromeInstance(row, col, objProvideFeedback, FilePath);
				}
				
				if (sh.getCell(col, row).getContents().contentEquals("IE")){
					System.out.println("this is my IE info: " +driver+" "+row+" "+col+" "+FilePath);
					SetCrossBrowsers.IEInstance(sh, row, col, objProvideFeedback, FilePath);
				}
				
				/*
				if (sh.getCell(col, row).getContents().contentEquals("FFX")){
					SetCrossBrowsers.FireFoxInstance(sh, row, col, objProvideFeedback, FilePath);
				}
				*/
			}
			System.out.println();
		}
    }
 }