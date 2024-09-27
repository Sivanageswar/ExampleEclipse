package formSubmissionDemoQA;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class DataProviders {
	
	@DataProvider(name ="StudentDetails")
	public String[][] method() throws IOException{
		File file = new File("C:\\EclipseWorkPlace\\Testing\\AutomationTasks\\Test Data\\StudentsData.xlsx");
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		int rows_count = sheet.getPhysicalNumberOfRows();
		int cols_count = sheet.getRow(0).getLastCellNum();
		
		String data[][] = new String[rows_count-1][cols_count];
		for (int i = 0; i < rows_count-1; i++) {
			for (int j = 0; j < cols_count; j++) {
				DataFormatter df = new DataFormatter();
				data[i][j] = df.formatCellValue(sheet.getRow(i+1).getCell(j));
			}
		}
		workbook.close();
		fis.close();
		return data;
		
	}
	
}
