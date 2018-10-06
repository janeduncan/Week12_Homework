package shop.instruments;
import org.junit.Before;
import org.junit.Test;
import shop.products.Brand;
import shop.products.instruments.InstrumentType;
import shop.products.instruments.Violin;
import static org.junit.Assert.*;

public class ViolinTest {

    Violin violin;

    @Before
    public void setUp() {
        violin = new Violin("Wessex V Series Violin Outfit", "S127", Brand.WESSEX, 1500, 1949, InstrumentType.STRINGS, "Wood", "Maple", "Full-size 4/4");
    }

    @Test
    public void getDescription() {
        assertEquals("Wessex V Series Violin Outfit", violin.getDescription());
    }

    @Test
    public void getSKU() {
        assertEquals("S127", violin.getSKU());
    }

    @Test
    public void getBrand() {
        assertEquals(Brand.WESSEX, violin.getBrand());
    }

    @Test
    public void getPurchasePrice() {
        assertEquals(1500, violin.getPurchasePrice());
    }

    @Test
    public void getSellingPrice() {
        assertEquals(1949, violin.getSellingPrice());
    }

    @Test
    public void getInstrumentType() {
        assertEquals(InstrumentType.STRINGS, violin.getType());
    }

    @Test
    public void getMaterial() {
        assertEquals("Wood", violin.getMaterial());
    }

    @Test
    public void getColour() {
        assertEquals("Maple", violin.getColour());
    }

    @Test
    public void getSize() {
        assertEquals("Full-size 4/4", violin.getSize());
    }

    @Test
    public void play() {
        assertEquals("Violin sound", violin.play());
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(449, violin.calculateMarkup());
    }

}
