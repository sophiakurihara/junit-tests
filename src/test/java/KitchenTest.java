import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class KitchenTest {
    Kitchen emptyKitchen;
    Kitchen kitchenWithOne;
    Kitchen kitchenWithMany;

    @Before
    public void setUp(){
        emptyKitchen = new Kitchen();

        kitchenWithOne = new Kitchen();
        kitchenWithOne.add("yellow corn");

        kitchenWithMany = new Kitchen();
        kitchenWithMany.add("blue corn");
        kitchenWithMany.add("yellow corn");
        kitchenWithMany.add("yellow corn");
        kitchenWithMany.add("white corn");
    }

    @Test
    public void testIsEmpty(){
        assertTrue(emptyKitchen.isEmpty());
        assertFalse(kitchenWithMany.isEmpty());
    }

    @Test
    public void testPop(){
        emptyKitchen.pop();

        assertEquals(0,emptyKitchen.size());

        kitchenWithOne.pop();
        assertEquals(0,kitchenWithOne.size());

        kitchenWithMany.pop();
        assertEquals(3, kitchenWithMany.size());
    }
}
