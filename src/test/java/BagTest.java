import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by Moi on 10/07/2017.
 */
public class BagTest {

    private Bag myBag;

    @Test
    public void shouldAddLegumeToBag(){
        Eatable myLegume = new Legume();
        myBag.add(myLegume);

        assertTrue(myBag.contains(myLegume));
    }

    @Test
    public void shouldntAddMeatToBag(){
        Eatable myMeat = new Meat();
        myBag.add(myMeat);

        assertFalse(myBag.contains(myMeat));
    }

    @Before
    public void setup(){
        myBag= new Bag();
    }
}
