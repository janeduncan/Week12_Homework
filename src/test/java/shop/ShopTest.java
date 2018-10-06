package shop;
import org.junit.Before;
import org.junit.Test;
import shop.behaviours.ISell;
import shop.products.Brand;
import shop.products.accessories.DrumSticks;
import shop.products.accessories.GuitarStrings;
import shop.products.accessories.SheetMusic;
import shop.products.instruments.*;
import java.util.ArrayList;
import static org.junit.Assert.*;

public class ShopTest {

    Shop shop;
    DrumSticks drumSticks;
    DrumSticks drumSticks2;
    GuitarStrings guitarStrings;
    SheetMusic sheetMusic;
    Flute flute;
    Piano piano;
    Tambourine tambourine;
    Trumpet trumpet;
    Violin violin;
    ArrayList<ISell> stock;

    @Before
    public void setUp() {
        stock = new ArrayList<>();
        drumSticks = new DrumSticks("Ahead Signature Rick Allen Def Leppard drumsticks", "S128", Brand.AHEAD, 26, 39);
        drumSticks2 = new DrumSticks("Ahead Signature Phil Rudd AC/DC drumsticks", "S131", Brand.AHEAD, 26, 39);
        stock.add(drumSticks);
        guitarStrings = new GuitarStrings("Fender Super Bullets 3250L guitar strings", "S129", Brand.FENDER, 4, 6);
        stock.add(guitarStrings);
        sheetMusic = new SheetMusic("Toto - Africa (Easy Piano Solo)", "S130", Brand.THEPIANOMUSIC, 3, 5);
        stock.add(sheetMusic);
        flute = new Flute("Pearl PFA-201SU Alto Flute", "S123", Brand.PEARL, 1199, 1599, InstrumentType.WOODWIND, "Silver Alloy", "Silver", "Alto");
        stock.add(flute);
        piano = new Piano("Yamaha B3 PE", "S124", Brand.YAMAHA, 4000, 4775, InstrumentType.KEYBOARD, "Wood", "Black", 237);
        stock.add(piano);
        tambourine = new Tambourine("Pearl Primero Rock Tambourine", "S125", Brand.PEARL, 18, 30, InstrumentType.PERCUSSION, "Plastic", "Matte Black", 9);
        stock.add(tambourine);
        trumpet = new Trumpet("Vincent Bach Stradivarius Bb Trumpet", "S126", Brand.VINCENTBACH, 1850, 2649, InstrumentType.BRASS, "Brass", "Yellow Brass", "Monel");
        stock.add(trumpet);
        violin = new Violin("Wessex V Series Violin Outfit", "S127", Brand.WESSEX, 1500, 1949, InstrumentType.STRINGS, "Wood", "Maple", "Full-size 4/4");
        stock.add(violin);
        shop = new Shop("McGilloways Music Market", stock);
    }

    @Test
    public void hasName() {
        assertEquals("McGilloways Music Market", shop.getName());
    }

    @Test
    public void canCountStock() {
        assertEquals(8, shop.stockCount());
    }

    @Test
    public void canCheckItemsInStock() {
        assertEquals(true, shop.checkItemsInStock(drumSticks));
    }

    @Test
    public void canCheckItemsNotInStock() {
        assertEquals(false, shop.checkItemsInStock(drumSticks2));
    }

    @Test
    public void canAddStock() {
        shop.addStock(drumSticks2);
        assertEquals(9, shop.stockCount());
    }

    @Test
    public void canRemoveStock() {
        shop.removeStock(drumSticks);
        assertEquals(false, shop.checkItemsInStock(drumSticks));
        assertEquals(7, shop.stockCount());
    }

    @Test
    public void canCalculatePotentialProfit() {
        assertEquals(2452, shop.calculatePotentialProfit());
    }

}
