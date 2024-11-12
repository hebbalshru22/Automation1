package com.qapitol.util;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelData {
    public String getExcelData(String sheetname,int rowNum,int cellNum) throws IOException {
        String retVal=null;
        FileInputStream fs=new FileInputStream("C:\\Users\\Qapitol QA\\Downloads\\Book.xlsx");
        Workbook wb= WorkbookFactory.create(fs);
        Sheet s=wb.getSheet(sheetname);
        Row r=s.getRow(rowNum);
        Cell c= r.getCell(cellNum);
        retVal=c.getStringCellValue();


        return retVal;
    }
public int getLastRowNumber(String sheetname) throws IOException {
    int retVal=0;
    FileInputStream fs=new FileInputStream("C:\\Users\\Qapitol QA\\Downloads\\Book.xlsx");
    Workbook wb= WorkbookFactory.create(fs);
    Sheet s=wb.getSheet(sheetname);
    retVal=s.getLastRowNum();

return retVal;
}
}