package com.samthegitguy.webpack4j.tests.unittests;

import com.samthegitguy.webpack4j.requests.Brewer;
import static org.junit.Assert.*;
import org.junit.Test;
/** Unit test for the Brewer class. 
 * @see com.samthegitguy.webpack4j.core.Brewer
 */
public class TestBrewer implements UnitTest {

    @Override @Test
    public void positivetest() {
        assertEquals(Brewer.brew("google.com"), 418);
    }

    @Override @Test
    public void negativetest() {
        try {
            Brewer.brew(1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override @Test
    public void edgetest() {
        Brewer.brew("f");
    }

    @Override @Test
    public void monkeytest() {
        for (int i = 0; i < 100; i++) {
            Brewer.brew("google.com");
        }
        
    }
}
