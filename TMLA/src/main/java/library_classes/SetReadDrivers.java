package library_classes;

import java.io.FileInputStream;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class SetReadDrivers {

	public static void readExcelGeckoPath(Integer row, Integer col, String FilePath) throws BiffException, IOException {
	    String strContent;
		//String FilePath = "C:\\Paul\\Automation\\TMLA_Settings.xls";
		FileInputStream fs = new FileInputStream(FilePath);
		Workbook wb = Workbook.getWorkbook(fs);
		Sheet sh = wb.getSheet("Sheet1");
		strContent = sh.getCell(col+4, row).getContents();
		System.setProperty("webdriver.gecko.driver", strContent);
	}

	public static void readChromeDriver(Integer row, Integer col, String FilePath) throws BiffException, IOException {
	    String strContent;
		//String FilePath = "C:\\Paul\\Automation\\TMLA_Settings.xls";
		FileInputStream fs = new FileInputStream(FilePath);
		Workbook wb = Workbook.getWorkbook(fs);
		Sheet sh = wb.getSheet("Sheet1");
		strContent = sh.getCell(col+3, row).getContents();
		System.setProperty("webdriver.chrome.driver",strContent);
	}
	
	public static void readIEDriver(Integer row, Integer col, String FilePath) throws BiffException, IOException {
	    String strIEpath;
		//String FilePath = "C:\\Paul\\Automation\\TMLA_Settings.xls";
		FileInputStream fs = new FileInputStream(FilePath);
		Workbook wb = Workbook.getWorkbook(fs);
		Sheet sh = wb.getSheet("Sheet1");
		strIEpath = sh.getCell(col+3, row).getContents();
		System.out.println ("IE path: "+ strIEpath);
		System.setProperty("webdriver.ie.driver",strIEpath);
	}
}
