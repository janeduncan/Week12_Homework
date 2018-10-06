package shop.products.instruments;

import shop.products.Brand;

public class Piano extends Instrument {

    private int weight;

    public Piano(String description, String SKU, Brand brand, int purchasePrice, int sellingPrice, InstrumentType type, String material, String colour, int weight) {
        super(description, SKU, brand, purchasePrice, sellingPrice, type, material, colour);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public String play() {
        return "Piano sound";
    }

}
