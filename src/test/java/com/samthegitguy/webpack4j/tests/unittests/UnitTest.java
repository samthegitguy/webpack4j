package com.samthegitguy.webpack4j.tests.unittests;
import static org.junit.Assert.*;
/**
 * Unit tests interface. See function javadoc for more info.
 * @author samthegitguy
 */
public interface UnitTest {
    /**
     * Standard positive test. Provide valid input and expect valid output.
     * 
     * E.G. In a calculator you might use {@code import static org.junit.*; Calculator calculator = new Calculator(); assertEquals(calculator.add(1,2), 3)}.
     */
    void positivetest();
    /** 
     * Standard negative test. Provide invalid input and expect proper error handling.
     * 
     * E.G. As in our  calculator example {@code import static org.junit.*; Calculator calculator = new Calculator(); calculator.divide(fda, ff);}
     */
    void negativetest();
    /** 
     * Standard edge test. Provide extreme input and expect valid output.
     *
     * E.G. {@code import static org.junit.*; Calculator calculator = new Calculator(); calculator.add(9999, 9999);}
     */
    void edgetest();
    /** 
     * Monkeytest. Provide random/repeated input and expect valid output.
     * 
     * E.G.
     * {@code import static org.junit.*; Calculator calculator = new Calculator(); for (i=0; i<1000000000; i++) { calculator.add(9999, 9923199);} 
     * or 
     * {@code import static org.junit.*; Calculator calculator = new Calculator(); calculator.add(48390214834321, 431243124321);}
     * 
     */
    void monkeytest();
}
