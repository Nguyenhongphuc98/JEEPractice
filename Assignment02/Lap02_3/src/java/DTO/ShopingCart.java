/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author NguyenHongPhuc
 */
public class ShopingCart {
    
    private Item item;
    private int quantity;
    private int total;

    public ShopingCart(Item item, int quantity, int total) {
        this.item = item;
        this.quantity = quantity;
        this.total = total;
    }
    
    public static List<ShopingCart> generateItems() {
        List<Item> items = Item.generateItems();
        List<ShopingCart> itemsCart = new ArrayList<>();
        for (Item i : items) {
            itemsCart.add(new ShopingCart(i, 0, 0));
        }
        return itemsCart;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
