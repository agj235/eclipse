import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelProgram {
	
	
	public static void main(String[] args) throws IOException{
	

 // Step 1 : provide path of the excel file
		 File fileSource = new File("/Users/angeljimenez/desktop/SampleEclipse.xlsx");
		FileInputStream fis = new FileInputStream(fileSource);
		
// Step 2 :  Take control of the Workbook, in this case it is an excel file
		XSSFWorkbook getWorkBook = new XSSFWorkbook(fis);
		
// Step 3 : We have to access the sheet
		XSSFSheet getSheet = getWorkBook.getSheet("Sheet1");
		//XSSFSheet getSheet = getWorkBook.getSheetAt(1);
// Step 4 : get the Row
		XSSFRow getRow = getSheet.getRow(0);
//Step 5: get the Cell
		XSSFCell getCell = getRow.getCell(1);
//Step 6 : get the Value		
		String value1 = getCell.getStringCellValue();
		
	System.out.println(value1);
	System.out.println(getSheet.getLastRowNum());
		
		int totalRows = getSheet.getLastRowNum();
		for(int i = 0; i < totalRows; i++) {
			System.out.println(getSheet.getRow(i).getCell(0).getStringCellValue());
			
		
		}
	
	}
}
