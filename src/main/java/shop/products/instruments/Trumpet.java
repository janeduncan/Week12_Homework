package shop.products.instruments;
import shop.products.Brand;

public class Trumpet extends Instrument {

    private String valve;

    public Trumpet(String description, String SKU, Brand brand, int purchasePrice, int sellingPrice, InstrumentType type, String material, String colour, String valve) {
        super(description, SKU, brand, purchasePrice, sellingPrice, type, material, colour);
        this.valve = valve;
    }

    public String getValve() {
        return valve;
    }

    public String play() {
        return "Trumpet sound";
    }

}
