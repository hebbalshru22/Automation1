package com.qapitol.fileoperations;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;

public class excelWrite {
    public static void main(String args[]) throws IOException {
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Sheet1");
        Row headerRow = sheet.createRow(0);
        Cell headerCell1 = headerRow.createCell(0);
        headerCell1.setCellValue("ID");

        Cell headerCell2 = headerRow.createCell(1);
        headerCell2.setCellValue("Name");

        Cell headerCell3 = headerRow.createCell(2);
        headerCell3.setCellValue("Age");
        Row headerRow1 = sheet.createRow(1);
        Cell cell1 = headerRow1.createCell(0);
        cell1.setCellValue("123");
        Cell cell2 = headerRow1.createCell(1);
        cell2.setCellValue("Shruti");
        Cell cell3 = headerRow1.createCell(2);
        cell3.setCellValue("20");
        FileOutputStream fileOut = new FileOutputStream("C:\\Users\\Qapitol QA\\Downloads\\Book 7.xlsx");
        workbook.write(fileOut);
        workbook.close();
        System.out.println("Data header created");
    }
}