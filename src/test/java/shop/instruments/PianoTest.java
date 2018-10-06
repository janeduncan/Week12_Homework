package shop.instruments;
import org.junit.Before;
import org.junit.Test;
import shop.products.Brand;
import shop.products.instruments.InstrumentType;
import shop.products.instruments.Piano;
import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void setUp() {
        piano = new Piano("Yamaha B3 PE", "S124", Brand.YAMAHA, 4000, 4775, InstrumentType.KEYBOARD, "Wood", "Black", 237);
    }

    @Test
    public void getDescription() {
        assertEquals("Yamaha B3 PE", piano.getDescription());
    }

    @Test
    public void getSKU() {
        assertEquals("S124", piano.getSKU());
    }

    @Test
    public void getBrand() {
        assertEquals(Brand.YAMAHA, piano.getBrand());
    }

    @Test
    public void getPurchasePrice() {
        assertEquals(4000, piano.getPurchasePrice());
    }

    @Test
    public void getSellingPrice() {
        assertEquals(4775, piano.getSellingPrice());
    }

    @Test
    public void getInstrumentType() {
        assertEquals(InstrumentType.KEYBOARD, piano.getType());
    }

    @Test
    public void getMaterial() {
        assertEquals("Wood", piano.getMaterial());
    }

    @Test
    public void getColour() {
        assertEquals("Black", piano.getColour());
    }

    @Test
    public void getWeight() {
        assertEquals(237, piano.getWeight());
    }

    @Test
    public void play() {
        assertEquals("Piano sound", piano.play());
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(775, piano.calculateMarkup());
    }
}


