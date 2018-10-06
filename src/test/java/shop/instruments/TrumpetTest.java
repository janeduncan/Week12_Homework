package shop.instruments;
import org.junit.Before;
import org.junit.Test;
import shop.products.Brand;
import shop.products.instruments.InstrumentType;
import shop.products.instruments.Trumpet;
import static org.junit.Assert.*;

public class TrumpetTest {

    Trumpet trumpet;

    @Before
    public void setUp() {
        trumpet = new Trumpet("Vincent Bach Stradivarius Bb Trumpet", "S126", Brand.VINCENTBACH, 1850, 2649, InstrumentType.BRASS, "Brass", "Yellow Brass", "Monel");
    }

    @Test
    public void getDescription() {
        assertEquals("Vincent Bach Stradivarius Bb Trumpet", trumpet.getDescription());
    }

    @Test
    public void getSKU() {
        assertEquals("S126", trumpet.getSKU());
    }

    @Test
    public void getBrand() {
        assertEquals(Brand.VINCENTBACH, trumpet.getBrand());
    }

    @Test
    public void getPurchasePrice() {
        assertEquals(1850, trumpet.getPurchasePrice());
    }

    @Test
    public void getSellingPrice() {
        assertEquals(2649, trumpet.getSellingPrice());
    }

    @Test
    public void getInstrumentType() {
        assertEquals(InstrumentType.BRASS, trumpet.getType());
    }

    @Test
    public void getMaterial() {
        assertEquals("Brass", trumpet.getMaterial());
    }

    @Test
    public void getColour() {
        assertEquals("Yellow Brass", trumpet.getColour());
    }

    @Test
    public void getValve() {
        assertEquals("Monel", trumpet.getValve());
    }

    @Test
    public void play() {
        assertEquals("Trumpet sound", trumpet.play());
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(799, trumpet.calculateMarkup());
    }

}