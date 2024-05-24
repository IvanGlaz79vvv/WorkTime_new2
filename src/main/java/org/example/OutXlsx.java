package org.example;

import lombok.SneakyThrows;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.util.WorkbookUtil;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;


public class OutXlsx extends Thread {
    Cell cell = null;
    Order order = null;

    /*public OutXlsx(Cell cell)*/
    public OutXlsx(Cell cell){
        this.cell = cell;
    }
    public OutXlsx(Order order) {
        this.order = order;
    }

    public OutXlsx() {
    }

    public void run(/*Cell cell*//*Order order*/ String string) {
        outXlsxStart(string/*order*/);
    }

    @SneakyThrows
    public void outXlsxStart(/*Cell order*//*Order order*/String s) {
//        Workbook wb = new HSSFWorkbook();
        Workbook wbX = new XSSFWorkbook();
//        Sheet sheet = wb.createSheet("mySheet");

        Thread thread = new Thread();
        thread.start();
//        FileOutputStream fos = new FileOutputStream("my.xls");
        FileOutputStream fosX = new FileOutputStream("my.xlsx");
        Sheet sheetX0 = wbX.createSheet("mySheetX0");

        Row rowX0 = sheetX0.createRow(0);
        Cell cellX00 = rowX0.createCell(0);
        cellX00.setCellValue("Исполнитель: ");
        Cell cellX01 = rowX0.createCell(1);
//        cellX01.setCellValue(/*order*/s.getUser().name);

        Row rowX1 = sheetX0.createRow(1);
        Cell cellX10 = rowX1.createCell(0);
        cellX10.setCellValue("Заказ: ");
        Cell cellX11 = rowX1.createCell(1);
//        cellX11.setCellValue(order.orderName);

        Row rowX2 = sheetX0.createRow(2);
        Cell cellX20 = rowX2.createCell(0);
        cellX20.setCellValue("Время выполнения заказа: ");
        Cell cellX21 = rowX2.createCell(1);
//        cellX21.setCellValue(order.orderWorkTime + " ч.");

        Sheet sheetX1 = wbX.createSheet("mySheetX1");
        Sheet sheetX2 = wbX.createSheet("mySheetX2");
        Sheet sheetX3 = wbX.createSheet("mySheetX3");
        Sheet sheetX4 = wbX.createSheet("mySheetX4");
        Sheet sheetX5 = wbX.createSheet(WorkbookUtil.createSafeSheetName("!@#$%^&*"));
//            wb.write(fos);
        wbX.write(fosX);
        thread.interrupt();


//        System.out.println("Исполнитель: " + order.getUser().name);
//        System.out.println("Заказ: " + order.orderName);
//        System.out.println("Время выполнения заказа: " + order.orderWorkTime + " ч.");
    }
}
