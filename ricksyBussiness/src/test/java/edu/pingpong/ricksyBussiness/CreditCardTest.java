package edu.pingpong.ricksyBussiness;




import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class CreditCardTest {

    private CreditCard card = null;
    @Before
    public void setup_card() {
        this.card = new CreditCard("Rick", "123456789");
        assertNotNull(card);
    }
    @Test
    public void constructor_test() {
        CreditCard card = new CreditCard("Rick", "123456789");
        assertNotNull(card);
    }
    @Test
    public void getOwner_test() {
        CreditCard card = new CreditCard ("Rick", "123456789");
        assertEquals("123456789", card.getNumber());
    }
    @Test
    public void getNumber() {
        CreditCard card = new CreditCard("Rick", "123456789");
        assertEquals("123456789", card.getNumber());
    }
}
