package shop.products.instruments;
import shop.products.Brand;

public class Violin extends Instrument {

    private String size;

    public Violin(String description, String SKU, Brand brand, int purchasePrice, int sellingPrice, InstrumentType type, String material, String colour, String size) {
        super(description, SKU, brand, purchasePrice, sellingPrice, type, material, colour);
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public String play() {
        return "Violin sound";
    }

}
