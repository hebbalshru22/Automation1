package Excel;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Array;

public class ExcelDataprovider {
   @DataProvider(name="loginData")
    public   String [][] getData() throws IOException {
        File excel = new File("C:\\Users\\Qapitol QA\\Downloads\\Book 2.xlsx");
        System.out.println(excel.exists());
        FileInputStream fis = new FileInputStream(excel);
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        XSSFSheet sheet = workbook.getSheet("Sheet1");
        int noOfRows = sheet.getPhysicalNumberOfRows();
        int noOfColoumns = sheet.getRow(0).getLastCellNum();
        String[][] data = new String[noOfRows - 1][noOfColoumns];
        for (int i = 0; i < noOfRows - 1; i++) {
            for (int j = 0; j < noOfColoumns; j++) {
                DataFormatter df = new DataFormatter();
                data[i][j] = df.formatCellValue(sheet.getRow(i + 1).getCell(j));
            }
        }
        workbook.close();
        fis.close();
       return data;
     }
    }

