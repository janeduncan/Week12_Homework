import org.junit.Before;
import org.junit.Test;
import shop.products.Brand;
import shop.products.instruments.Flute;
import shop.products.instruments.InstrumentType;
import static org.junit.Assert.*;

public class FluteTest {

    Flute flute;

    @Before
    public void setUp() {
        flute = new Flute("Pearl PFA-201SU Alto Flute", "S123", Brand.PEARL, 1199, 1599, InstrumentType.WOODWIND, "Silver Alloy", "Silver", "Alto");
    }

    @Test
    public void getDescription() {
        assertEquals("Pearl PFA-201SU Alto Flute", flute.getDescription());
    }

    @Test
    public void getSKU() {
        assertEquals("S123", flute.getSKU());
    }

    @Test
    public void getBrand() {
        assertEquals(Brand.PEARL, flute.getBrand());
    }

    @Test
    public void getPurchasePrice() {
        assertEquals(1199, flute.getPurchasePrice());
    }

    @Test
    public void getSellingPrice() {
        assertEquals(1599, flute.getSellingPrice());
    }

    @Test
    public void getInstrumentType() {
        assertEquals(InstrumentType.WOODWIND, flute.getType());
    }

    @Test
    public void getMaterial() {
        assertEquals("Silver Alloy", flute.getMaterial());
    }

    @Test
    public void getColour() {
        assertEquals("Silver", flute.getColour());
    }

    @Test
    public void getSize() {
        assertEquals("Alto", flute.getSize());
    }

    @Test
    public void play() {
        assertEquals("Flute sound", flute.play());
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(400, flute.calculateMarkup());
    }
}
