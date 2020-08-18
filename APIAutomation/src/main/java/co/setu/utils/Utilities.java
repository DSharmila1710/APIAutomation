package co.setu.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Utilities {
	static Properties prop = new Properties();
	public static String getGlobalValue(String key) throws IOException {
		FileInputStream fis = new FileInputStream("./env.properties");
		prop.load(fis);
		return prop.getProperty(key);
	}
	
	public static ArrayList<Object[]> extractDataFromCreateJiraSheet(String API) throws IOException {
		ArrayList<Object[]> Dataset = new ArrayList<Object[]>();

		FileInputStream fis = new FileInputStream("./testinput\\Input.xlsx");
		XSSFWorkbook Workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = Workbook.getSheet(API);
		for (int R = 1; R <= sheet.getLastRowNum(); R++) {
			String cell0 = sheet.getRow(R).getCell(0).getStringCellValue();
			System.out.println("Executing test case : " + cell0 + " by the thread " + Thread.currentThread());
			String summary = sheet.getRow(R).getCell(1).getStringCellValue();
			String description = sheet.getRow(R).getCell(2).getStringCellValue();
			String priority = sheet.getRow(R).getCell(3).getStringCellValue();
			String reporter = sheet.getRow(R).getCell(4).getStringCellValue();
			Dataset.add(new Object[] { summary, description, reporter, priority });

		}
		return Dataset;
	}

}
