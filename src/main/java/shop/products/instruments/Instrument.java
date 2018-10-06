package shop.products.instruments;
import shop.products.Brand;
import shop.products.Product;
import shop.behaviours.IPlay;

public abstract class Instrument extends Product implements IPlay {

    private InstrumentType type;
    private String material;
    private String colour;

    public Instrument(String description, String SKU, Brand brand, int purchasePrice, int sellingPrice, InstrumentType type, String material, String colour) {
        super(description, SKU, brand, purchasePrice, sellingPrice);
        this.type = type;
        this.material = material;
        this.colour = colour;
    }

    public InstrumentType getType() {
        return type;
    }

    public String getMaterial() {
        return material;
    }

    public String getColour() {
        return colour;
    }
}
