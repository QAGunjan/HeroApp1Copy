package com.oneapp.basic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;

import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.oneapp.utils.TestUtils;

public class ExcelData {

	public XSSFWorkbook wb;
	public File file;
	public HashMap<String, String> hm;

	public ExcelData() {
		GetExcel();
	}

	public void GetExcel( ) {
		file = new File("./TestData/Data.xlsx");
		try {
			FileInputStream fis = new FileInputStream(file); // for converting the excel file into a RAW data.
			wb = new XSSFWorkbook(fis); // In order to read xlsx, we need XSSFworkbook class
    
		} catch (Exception e) {
			System.out.println("Unable to read excel file " + e.getMessage());
		}
	}

	public HashMap<String, String> hashmapping(String SheetName) {
		HashMap<String, String> testdata = new LinkedHashMap<String, String>();
 try {
		
		XSSFSheet sheet = wb.getSheet(SheetName);
		int lastRowNumber = sheet.getLastRowNum();

		for (int i = 1; i <= lastRowNumber; i++) {
			XSSFRow rowData = sheet.getRow(i);
			XSSFCell KeyCell = rowData.getCell(0);
			String key = KeyCell.getStringCellValue().trim();

			XSSFCell ValueCell = rowData.getCell(1);
			String value = ValueCell.getStringCellValue().trim();
			testdata.put(key, value);
		}
 }
  catch (Exception e) {
	  System.out.println("Unable to read excel file " + e.getMessage());
	  
  }
		return testdata;
	}

	// For Book Service Module
	/*
	 * public void WriteExceldata(String SR, String Kilometers, String SR_ID) { //
	 * XSSFSheet sheet3 = wb.createSheet("Book Service"); XSSFSheet sheet3 =
	 * wb.getSheetAt(2);
	 * 
	 * XSSFRow rowheading = sheet3.createRow(0);
	 * rowheading.createCell(0).setCellValue(SR);
	 * rowheading.createCell(1).setCellValue(Kilometers); for (int i = 0; i < 2;
	 * i++) { XSSFCellStyle stylerowheading = wb.createCellStyle(); XSSFFont font =
	 * wb.createFont(); font.setBold(true); font.setFontName(HSSFFont.FONT_ARIAL);
	 * font.setFontHeightInPoints((short) 11); stylerowheading.setFont(font);
	 * rowheading.getCell(i).setCellStyle(stylerowheading); }
	 * 
	 * XSSFRow row = sheet3.createRow(1); row.createCell(0).setCellValue(SR_ID);
	 * 
	 * for (int i = 0; i < 2; i++) { sheet3.autoSizeColumn(i); }
	 * 
	 * try { FileOutputStream fos = new FileOutputStream(file); wb.write(fos);
	 * fos.close(); wb.close(); System.out.println("Excel written successfully"); }
	 * catch (Exception e) { System.out.println("Unable to write on excel file " +
	 * e.getMessage()); }
	 * 
	 * }
	 */
	public String getStringData(String SheetName, int Row, int Column) {
		return wb.getSheet(SheetName).getRow(Row).getCell(Column).getStringCellValue();
	}

	public double getNumericData(String SheetName, int Row, int Column) {
		return wb.getSheet(SheetName).getRow(Row).getCell(Column).getNumericCellValue();
	}

	public void setCellData(String SheetName, String RowValue, String ColumnValue) {
		XSSFSheet sheet4 = wb.getSheet(SheetName);
		sheet4.createRow(1);
		sheet4.getRow(1).createCell(0).setCellValue(RowValue);
		sheet4.getRow(1).createCell(1).setCellValue(ColumnValue);
		try {
			FileOutputStream fos = new FileOutputStream(file);
			wb.write(fos);
			fos.close();
			wb.close();
			System.out.println("Excel written successfully");
		} catch (Exception e) {
			System.out.println("Unable to write on excel file " + e.getMessage());
		}

	}

	// HashMap for storing data from Excel
	/*
	 * public HashMap<String, String> getMapData(String SheetName) { hm = new
	 * HashMap<String, String>(); try { GetExcel(); XSSFSheet sheet =
	 * wb.getSheet(SheetName); int lastRowNumber = sheet.getLastRowNum();
	 * TestUtils.log().debug(lastRowNumber);
	 * 
	 * for (int i = 1; i <= lastRowNumber; i++) { XSSFRow row =
	 * wb.getSheet(SheetName).getRow(i); XSSFCell KeyCell = row.getCell(0); String
	 * Key = KeyCell.getStringCellValue().trim();
	 * 
	 * XSSFCell valueCell = row.getCell(1); String Value =
	 * valueCell.getStringCellValue().trim(); hm.put(Key, Value);
	 * 
	 * } }
	 * 
	 * catch (Exception e) { System.out.println("Yes"); } return hm;
	 * 
	 * }
	 */
}
