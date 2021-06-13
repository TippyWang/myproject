package com.tippy;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Shop {
    Map<String ,Item> menu = new HashMap<>();

    public Shop() {
        File file = new File("item.txt");
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line = bufferedReader.readLine();
            while (line != null){
                String[] tokens = line.split(",");
                Item item = new Item(
                        tokens[0],
                        tokens[1],
                        tokens[2],
                        Integer.parseInt(tokens[3])
                );
                menu.put(item.id ,item);
                line = bufferedReader.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Shop shop = new Shop();
        shop.printMenu();
    }

    public void printMenu() {
        for (Map.Entry<String, Item> itemEntry : menu.entrySet()) {
//            System.out.println(itemEntry.getValue().id);
            System.out.println(itemEntry.getValue());
        }
    }
}
// !! 跟上方為不同類別
class Item {
    String id;
    String name;
    String size;
    int money;

    public Item(String id, String name, String size, int money) {
        this.id = id;
        this.name = name;
        this.size = size;
        this.money = money;
    }

    @Override
    public String toString() {
        return "單號 : " + id + " 品名 : " + name + " 尺寸 : " + size + " 價格 : " + money;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}