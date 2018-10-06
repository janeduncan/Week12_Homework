package shop.products.instruments;

import shop.products.Brand;

public class Tambourine extends Instrument {

    private int size;

    public Tambourine(String description, String SKU, Brand brand, int purchasePrice, int sellingPrice, InstrumentType type, String material, String colour, int size) {
        super(description, SKU, brand, purchasePrice, sellingPrice, type, material, colour);
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public String play() {
        return "Tambourine sound";
    }

}
