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
public class LineTest {
    
    public LineTest() {
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
     * Test of getDefinition method, of class Line.
     */
    @Test
    public void testGetDefinition() {
        System.out.println("getDefinition");
        Line instance = new Line();
        String expResult = "The geometrical shape, 2D, that connects two points";
        System.out.println(instance.getClass().getSimpleName()+" : "+expResult);
        String result = instance.getDefinition();
        assertEquals(expResult, result);
    }
    
}
