package org.example;

import lombok.SneakyThrows;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;


public class ReadXlsx {
    String path;
    int sheetAt;
    int row;
    int cell;

    public ReadXlsx(String path, int sheetAt, int row, int cell) {
        this.path = path;
        this.cell = cell;
        this.row = row;
        this.sheetAt = sheetAt;
    }

    public ReadXlsx() {
    }

    @SneakyThrows
    String ReadXlsxStart(String path, int sheetAt, int row, int cell) {
        String read = "";
        Workbook wb = new XSSFWorkbook(new FileInputStream(path));
//        try (FileInputStream fis = new FileInputStream(path)) {
        if (wb.getSheetAt(sheetAt).getRow(row).getCell(cell).getCellType() == CellType.STRING) {
            read = wb.getSheetAt(sheetAt).getRow(row).getCell(cell).getStringCellValue();
        }
        return read;
    }




}
//    Integer getCell(String path, int sheetAt, int row, int cell) {
//        Workbook wb = new XSSFWorkbook(new FileInputStream(path));
//        try (FileInputStream fis = new FileInputStream(path)) {
////            String read = wb.getSheetAt(sheetAt).getRow(row).getCell(cell).getStringCellValue();
//            Cell cellRead = wb.getSheetAt(sheetAt).getRow(row).getCell(cell);
////            cell1 = wb.getSheetAt(sheetAt).getRow(row).getCell(cell);
//            return cellRead;
//        }
