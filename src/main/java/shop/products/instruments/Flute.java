package shop.products.instruments;

import shop.products.Brand;

public class Flute extends Instrument {

    private String size;

    public Flute(String description, String SKU, Brand brand, int purchasePrice, int sellingPrice, InstrumentType type, String material, String colour, String size) {
        super(description, SKU, brand, purchasePrice, sellingPrice, type, material, colour);
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public String play() {
        return "Flute sound";
    }

}
