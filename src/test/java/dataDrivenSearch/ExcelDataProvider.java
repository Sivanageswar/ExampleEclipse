package dataDrivenSearch;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class ExcelDataProvider {
	
	@DataProvider(name ="Test Data")
	public String[][] method() throws IOException{
		File file = new File("C:\\EclipseWorkPlace\\Testing\\AutomationTasks\\Test Data\\Test Data_Ecommerce.xlsx");
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("TestData");
		int rows_count = sheet.getPhysicalNumberOfRows();
		int cols_count = sheet.getRow(0).getLastCellNum();
		
		String data[][] = new String[rows_count][cols_count];
		for (int i = 0; i < rows_count; i++) {
			for (int j = 0; j < cols_count; j++) {
				DataFormatter df = new DataFormatter();
				data[i][j] = df.formatCellValue(sheet.getRow(i).getCell(j));
			}
		}
		workbook.close();
		fis.close();
		return data;
		
	}

}
