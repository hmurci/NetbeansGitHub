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
public class calculadora2Test {
    private calculadora calcu;
    private int resultado;
    public calculadora2Test() {
        
        
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        calcu=new calculadora(20,10);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of suma method, of class calculadora.
     */
    @Test
    public void testSuma() {
        System.out.println("suma");
        resultado= calcu.suma();
        assertEquals(30,resultado);
    }

    /**
     * Test of resta method, of class calculadora.
     */
    @Test
    public void testResta() {
        System.out.println("resta");
        resultado=calcu.resta();
        assertEquals(10, resultado);
        
    }

    /**
     * Test of multiplicacion method, of class calculadora.
     */
    @Test
    public void testMultiplicacion() {
        System.out.println("multiplicacion");
        resultado=calcu.multiplicacion();
        assertEquals(200, resultado);
    }

    /**
     * Test of divide method, of class calculadora.
     */
    @Test
    public void testDivide() {
        System.out.println("divide");
        resultado=calcu.divide();
        assertEquals(22, resultado);
    }
    
}
