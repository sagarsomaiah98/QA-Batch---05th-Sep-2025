import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcel {

	public static void main(String[] args) throws IOException {
		Workbook wb = new XSSFWorkbook();
		Sheet s1 = wb.createSheet("SHEET1");
		Sheet s2 = wb.createSheet("SHEET2");
		
		for(int i=0;i<10;i++) {
			Row row = s1.createRow(i);
			for(int j=0;j<10;j++) {
		
			
			row.createCell(j).setCellValue(j);
		}
		
		}
		
	
		
		
		
		try (OutputStream fileOut = new FileOutputStream("S:\\JANBASK\\QA Batch - 05th Sep 2025\\DataParamertization\\src\\TestSuite\\Test.xlsx")) {
		    wb.write(fileOut);
		}

	}
}
