package org.example;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import io.basc.framework.mapper.DefaultObjectMapper;
import io.basc.framework.mapper.Mapping;
import io.basc.framework.mapper.ObjectMapper;
import org.Trash.SimpleWindow;
import org.apache.poi.ss.usermodel.Cell;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.util.WorkbookUtil;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import javax.swing.*;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

import static org.apache.poi.ss.usermodel.Cell.*;

public class Main {
    public static void main(String[] args) {
//        Cell cell;
//        Processor processor = new Processor();
////        processor.startProcessor();
//        Order order = processor.getOrder();
//        User user = new User();
        Gson json = new Gson();
        Order order = new Order();
        String cellRead = "";
        List<String> listCells = new ArrayList<>();
        String path = "src/main/resources/Сотрудники_журналы РАН.xlsx";// "E:\\YandexDisk\\WorkTime\\Сотрудники_журналы РАН.xlsx";
        ReadXlsx readXlsx = new ReadXlsx();
        Map<String, String> mapOfCells = new TreeMap<>();

        for (int j = 2; j < 10; j++) {
//            System.out.println("\n--------------\n");
            for (int i = 0; i < 21; i++) {
                String cell = readXlsx.ReadXlsxStart(path, 0, j, i);
                cellRead = readXlsx.ReadXlsxStart(path, 0, 1, i) + ": ";
//                System.out.print(readXlsx.ReadXlsxStart(path, 0, 1, i) + ": ");
                if (cell != null) {
//                    System.out.println(cellRead);
                    OutXlsx outXlsx = new OutXlsx();
                    outXlsx.run(cell);
                    mapOfCells.put((j+1) + "-" + i, cellRead + ":" + cell + "\n");
                    listCells.add(cellRead + ":" + cell + "\n");
//                    json.readXlsx.ReadXlsxStart(path, 0, 1, i) + ": ");
                } else {
                    System.out.println("Cell is empty");
                }
            }
        }
//        ShowCellByNumber showCellByNumber = new ShowCellByNumber();
//        showCellByNumber.runShowCellByNumber(mapOfCells);
    }
}

//        User ivan = new User(readXlsx.ReadXlsxStart(path, 0, 1, 10));
//        Order ivanOrder = new Order(readXlsx.ReadXlsxStart(path, 0, 1, 3), 10, ivan);

//        OutXlsx outXlsx = new OutXlsx();
//        outXlsx.run(ivanOrder);

//        System.out.println(readXlsx.ReadXlsxStart(path, 0, 1, 11));


   /* public void getCellText(Cell cell) {
        String result;
        switch (cell.getCellType()) {
            case STRING:
                System.out.println(cell.getRichStringCellValue()
                        .getString());
                break;
            case NUMERIC:
                if (DateUtil.isCellDateFormatted(cell))
                    System.out.println(cell.getDateCellValue());
                else
                    System.out.println(cell.getNumericCellValue());
                break;
            case BOOLEAN:
                System.out.println(cell.getBooleanCellValue());
                break;
            case FORMULA:
                System.out.println(cell.getCellFormula());
                break;
            case BLANK:
                System.out.println();
                break;
            default:
                System.out.println();
        }
    }*/
