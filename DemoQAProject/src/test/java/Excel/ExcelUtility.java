package Excel;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelUtility {
    public String getExcelData(String sheetname, int rowNum, int cellNum) throws IOException {
        FileInputStream fs = new FileInputStream("C:\\Users\\Qapitol QA\\Downloads\\Book 1 (2).xlsx");
        Workbook wb = WorkbookFactory.create(fs);
        String retVal = wb.getSheet(sheetname).getRow(rowNum).getCell(cellNum).getStringCellValue();
        return retVal;
    }

    public int getLastRowNumber(String sheetname) throws IOException {
        FileInputStream fs = new FileInputStream("C:\\Users\\Qapitol QA\\Downloads\\Book 1 (2).xlsx");
        Workbook wb = WorkbookFactory.create(fs);
        int  retVal = wb.getSheet(sheetname).getLastRowNum();
        return retVal;
    }
}