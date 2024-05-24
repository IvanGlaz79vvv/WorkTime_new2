package org.example;

import org.apache.poi.ss.usermodel.Cell;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class User {
    Cell cell;
    String name;
    Order orderName;
    Order orderTime;
    Integer[] arrayWorkTime = new Integer[8];

    public User() {
    }

    public User(String name, Order orderName, Order orderTime) {
        this.name = name;
        this.orderName = orderName;
        this.orderTime = orderTime;
    }

    public User(String name, Order orderName) {
        this.name = name;
        this.orderName = orderName;

    }

    public User(String name) {
        this.name = name;
    }

    public User(Cell cell) {
        this.cell = cell;
    }

    public static Map<Integer, String> getUsers() {
        Map<Integer, String> user = new HashMap<>();
        try (BufferedReader br = new BufferedReader(new FileReader("Users.txt"))) {
            int id = 0;
            while (br.ready()) {
                user.put(id, br.readLine());
                id++;
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return user;
    }
}
