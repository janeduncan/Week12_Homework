package shop.products;

import shop.behaviours.ISell;

public abstract class Product implements ISell {

    private String description;
    private String SKU;
    private Brand brand;
    private int purchasePrice;
    private int sellingPrice;

    public Product(String description, String SKU, Brand brand, int purchasePrice, int sellingPrice) {
        this.description = description;
        this.SKU = SKU;
        this.brand = brand;
        this.purchasePrice = purchasePrice;
        this.sellingPrice = sellingPrice;
    }

    public String getDescription() {
        return description;
    }

    public String getSKU() {
        return SKU;
    }

    public Brand getBrand() {
        return brand;
    }

    public int getPurchasePrice() {
        return purchasePrice;
    }

    public int getSellingPrice() {
        return sellingPrice;
    }

    public int calculateMarkup() {
        return sellingPrice - purchasePrice;
    }

}
