/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema8;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class TruncatedConeTest {
    
    public TruncatedConeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getDefinition method, of class TruncatedCone.
     */
    @Test
    public void testGetDefinition() {
        System.out.println("getDefinition");
        TruncatedCone instance = new TruncatedCone();
        String expResult = "The geometrical shape, 3D, with a circular flat base joined to a curved side that ends in an apex point cutted by a plane paralled to the base and removing the part containing the apex ";        String result = instance.getDefinition();
        System.out.println(instance.getClass().getSimpleName()+" : "+expResult);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
