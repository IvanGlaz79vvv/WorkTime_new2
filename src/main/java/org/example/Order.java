package org.example;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.apache.poi.ss.usermodel.Cell;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Getter
@Setter
@RequiredArgsConstructor
public class Order {
    Cell cell;
    int id;
    String orderName;
    String kol_vo;
    String uil;
    int kol_vo_Polos;
    Integer orderWorkTime;
    User user = new User();

    Map<String, Integer> orderTime = new HashMap<String, Integer>();
    Map<String, Integer> OrderTimeMap = new HashMap<String, Integer>();
    Map<User, Order> UserOrderMap = new HashMap<>();
    List<String> orderList = new ArrayList<>();

    public Order(Cell cell, int id, String kol_vo, int kol_vo_Polos, List<String> orderList, String orderName, Map<String, Integer> orderTime, Map<String, Integer> orderTimeMap, Integer orderWorkTime, String uil, User user, Map<User, Order> userOrderMap) {
        this.cell = cell;
        this.id = id;
        this.kol_vo = kol_vo;
        this.kol_vo_Polos = kol_vo_Polos;
        this.orderList = orderList;
        this.orderName = orderName;
        this.orderTime = orderTime;
        OrderTimeMap = orderTimeMap;
        this.orderWorkTime = orderWorkTime;
        this.uil = uil;
        this.user = user;
        UserOrderMap = userOrderMap;
    }

    public Order(String orderName, Integer orderWorkTime, User user) {
        this.orderName = orderName;
        this.orderWorkTime = orderWorkTime;
        this.user = user;
    }

    public Order(Cell cell, Integer orderWorkTime, User user) {
        this.cell = cell;
        this.orderName = orderName;
        this.orderWorkTime = orderWorkTime;
        this.user = user;
    }

    public Order(List<String> orderList, String orderName, Map<String, Integer> orderTime, Map<String, Integer> orderTimeMap, Integer orderWorkTime, Map<User, Order> userOrderMap) {
        this.orderList = orderList;
        this.orderName = orderName;
        this.orderTime = orderTime;
        this.orderWorkTime = orderWorkTime;
        UserOrderMap = userOrderMap;
    }

    public Order(Cell cell) {
        this.cell = cell;
    }
}

