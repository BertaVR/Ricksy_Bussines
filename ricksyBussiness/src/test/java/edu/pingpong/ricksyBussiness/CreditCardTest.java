package edu.pingpong.ricksyBussiness;




import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.Before;

public class CreditCardTest {

    private CreditCard card = null;
    @Before 
    public void setup_card() {
        this.card = new CreditCard("Rick", "123456789");
        assertNotNull(card);
    }
    @Test
    public void constructor_test() {
        assertNotNull(this.card);
    }
    @Test
    public void getOwner_test() {
        assertEquals("123456789", this.card.getNumber());
    }
    @Test
    public void getNumber() {
        assertEquals("123456789", this.card.getNumber());
    }
    
    @Test
    public void getCredit_test() {
        assertEquals("3000.0", this.card.getCredit());
    }
}
