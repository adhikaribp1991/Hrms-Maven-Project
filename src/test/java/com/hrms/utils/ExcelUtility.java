package com.hrms.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {
	public static Workbook book;
	public static Sheet sheet;

	private static void openExcel(String filePath) {
		try {
			FileInputStream file = new FileInputStream(filePath);
			book = new XSSFWorkbook(file);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void loadSheet(String sheetName) {
		sheet = book.getSheet(sheetName);
	}

	private static int rowCount() {
		return sheet.getPhysicalNumberOfRows();
	}

	private static int columnCount(int row) {
		return sheet.getRow(row).getLastCellNum();
	}

	private static String cellData(int rowIndex, int columnIndex) {
		return sheet.getRow(rowIndex).getCell(columnIndex).toString();
	}

	public static Object[][] excelIntoArray(String filePath, String sheetName) {
		openExcel(filePath);
		loadSheet(sheetName);

		Object[][] data = new Object[rowCount() - 1][columnCount(0)];
		for (int i = 1; i < rowCount(); i++) {

			for (int j = 0; j < columnCount(0); j++) {
				data[i - 1][j] = cellData(i, j);
			}

		}
		return data;

	}

}
