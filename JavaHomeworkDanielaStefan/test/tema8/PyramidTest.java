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

/**
 *
 * @author iulica
 */
public class PyramidTest {
    
    public PyramidTest() {
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
     * Test of getDefinition method, of class Pyramid.
     */
    @Test
    public void testGetDefinition() {
        System.out.println("getDefinition");
        Pyramid instance = new Pyramid();
        String expResult = "The geometrical shape, 3D, formed by connecting all the corners of a polygon to a central apex ";
        System.out.println(instance.getClass().getSimpleName()+" : "+expResult);
        String result = instance.getDefinition();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
