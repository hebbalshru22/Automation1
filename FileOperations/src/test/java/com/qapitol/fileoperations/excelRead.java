package com.qapitol.fileoperations;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class excelRead {
    public static void main(String args[]) throws IOException {
        FileInputStream fis = new FileInputStream("C:\\Users\\Qapitol QA\\Downloads\\Book 5.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(fis);

        XSSFSheet sheet = workbook.getSheet("Sheet1");
        int rownum = sheet.getLastRowNum();
        int colnum = sheet.getRow(0).getLastCellNum();
        for (int i = 0; i < rownum - 1; i++) {
            for (int j = 0; j < colnum; j++) {
                System.out.println(sheet.getRow(i + 1).getCell(j).getStringCellValue());
            }
        }
    }
}
