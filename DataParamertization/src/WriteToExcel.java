import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteToExcel {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Workbook wb = new XSSFWorkbook();
		Sheet s1 = wb.createSheet("SHEET1");
		Sheet s2 = wb.createSheet("SHEET2");
		
		Row r0 = s2.createRow(10);
		Row r1 = s2.createRow(15);
		Row r2 = s2.createRow(20);
		
		Cell c0 = r0.createCell(12);
		Cell c1 = r1.createCell(8);
		Cell c2 = r2.createCell(13);
		c0.setCellValue(4567);
		c1.setCellValue(78.99);
		c2.setCellValue("HelloWorld");
		
		
		try (OutputStream fileOut = new FileOutputStream("S:\\JANBASK\\QA Batch - 05th Sep 2025\\DataParamertization\\src\\TestSuite\\Test.xlsx")) {
		    wb.write(fileOut);
		}

	}

}
