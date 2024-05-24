package org.example;

import java.util.Map;
import java.util.Scanner;

public class ShowCellByNumber {
    public String runShowCellByNumber(Map<String, String> mapOfCells) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер ячейки");
        String number = scanner.nextLine();
        System.out.println(mapOfCells.get(number));
        return mapOfCells.get(number);
    }
}
