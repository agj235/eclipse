import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DynamicExcel {
// to make the class object dynamic we have to declare globally
	public static File fileSource;
	public static FileInputStream fis;
	public static XSSFWorkbook wWorkBook;
	public static XSSFSheet wSheet;
	public static XSSFRow wRow;
	public static XSSFCell wCell;
	public static FileOutputStream fout;
	
	
	public static void main(String[] args) throws IOException  {
		String value =dynamicData(2,1,0);
	System.out.println(value);
	
	wSheet.getRow(1).createCell(2).setCellValue("Pass");
	 fout = new FileOutputStream(fileSource);
	wWorkBook.write(fout);
	
	wSheet.getRow(2).createCell(2).setCellValue("Fail");
	 fout = new FileOutputStream(fileSource);
	wWorkBook.write(fout);
	wWorkBook.close();
			
			
		
}
public static String dynamicData(int row, int col, int sheetAt) throws IOException {
	//Step 1: 

	fileSource = new File ("/Users/angeljimenez/desktop/SampleEclipse.xlsx"); 
	 fis = new FileInputStream(fileSource);
	 //Step 2: 
	
	 wWorkBook = new XSSFWorkbook(fis); 
	// step 3:
	
	 wSheet = wWorkBook.getSheetAt(sheetAt);
	//Step 4:

	 wRow = wSheet.getRow(row);
	//Step 5 :
	
	 wCell= wRow.getCell(col);	
	
	//System.out.println(wCell.getStringCellValue());
	
	return wCell.getStringCellValue();
	 
}
}