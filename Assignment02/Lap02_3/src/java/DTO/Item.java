/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author NguyenHongPhuc
 */
public class Item {
    
    private int id;
    private String name;
    private int price;

    public Item(int id, String name, int price) {
        this.name = name;
        this.price = price;
        this.id = id;
    }

    public static List<Item> generateItems() {
        List<Item> items = new ArrayList<Item>();
        items.add(new Item(1,"Lap top sony vaio SR2400", 15000000));
        items.add(new Item(2,"Lap top sony vaio SR3400", 17000000));
        items.add(new Item(3,"Lap top sony vaio SR7400", 25000000));
        items.add(new Item(4,"Lap top sony vaio SR9400", 35000000));
        items.add(new Item(5,"Lap top HP HP1100", 12000000));
        items.add(new Item(6,"Lap top HPPro X5400", 15000000));
        items.add(new Item(7,"Lap top HPPro X9990", 25000000));
        items.add(new Item(8,"Lap top HPPro X20-3100", 18000000));
        
        return items;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
