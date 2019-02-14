package ac.za;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */

    @Test
    public void add(){
        // Asset
        App calculator = new App();
        Assert.assertEquals(5, calculator.add(2,3));

    }





}
