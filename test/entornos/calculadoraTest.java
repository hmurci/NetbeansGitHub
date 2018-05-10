/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entornos;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ASIR 7L
 */
public class calculadoraTest {
    
    public calculadoraTest() {
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
     * Test of suma method, of class calculadora.
     */
    @Test
    public void testSuma() {
        /*System.out.println("suma");
        calculadora instance = null;
        int expResult = 0;
        int result = instance.suma();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");*/
    System.out.println("suma");
        calculadora instance = new calculadora(10,20);
        int expResult = 30;
        int result = instance.suma();
        assertEquals(expResult, result);
    }

    /**
     * Test of resta method, of class calculadora.
     */
    @Test
    public void testResta() {
        System.out.println("resta");
        calculadora instance = null;
        int expResult = 0;
        int result = instance.resta();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of multiplicacion method, of class calculadora.
     */
    @Test
    public void testMultiplicacion() {
        System.out.println("multiplicacion");
        calculadora instance = null;
        int expResult = 0;
        int result = instance.multiplicacion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of divide method, of class calculadora.
     */
    @Test
    public void testDivide() {
        System.out.println("divide");
        calculadora instance = null;
        int expResult = 0;
        int result = instance.divide();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
