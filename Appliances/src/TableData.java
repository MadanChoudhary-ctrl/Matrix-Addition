/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
public class TableData {

    private final String modelNumber;
    private final String name;
    private final String category;
    private final String brand;
    private final int price;
    private final String range;
    private final String quantity;
    private final String storageType;

    public TableData(String modelNumber, String name, String category, String brand, int price, String range, String quantity, String storageType) {
        this.modelNumber = modelNumber;
        this.name = name;
        this.category = category;
        this.brand = brand;
        this.price = price;
        this.range = range;
        this.quantity = quantity;
        this.storageType = storageType;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public String getBrand() {
        return brand;
    }

    public int getPrice() {
        return price;
    }

    public String getRange() {
        return range;
    }

    public String getQuantity() {
        return quantity;
    }

    public String getStorageType() {
        return storageType;
    }

}
