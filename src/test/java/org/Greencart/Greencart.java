package org.Greencart;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Greencart {
	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://greenscart.in/#/login?returnUrl=%2F");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		WebElement register= driver.findElement(By.xpath("//input[@class='form-control-1']"));
		register.click();
		Thread.sleep(5000);
		
		WebElement dDndate = driver.findElement(By.id("month"));
		Select select = new Select(dDndate);
		List<WebElement> options = select.getOptions();
		File file = new File("C:\\Users\\VIGNESH\\eclipse-workspace\\Sample\\src\\excelNew\\new.xlsx");
		Workbook workbook = new XSSFWorkbook();
		Sheet sheet = workbook.createSheet("Sheet1");
		
		
	for (int i = 0; i < options.size(); i++) {
		WebElement element = options.get(i);
	
		
		String text = element.getText();
	
		Row row = sheet.createRow(i);
		Cell cell = row.createCell(0);
		cell.setCellValue(text);
		
	}	
	FileOutputStream o = new FileOutputStream(file);
	workbook.write(o);
		
		
		
		
		
		
		
	
			
	
	
	
	
	
		}
		
		
		
		
		
	}
