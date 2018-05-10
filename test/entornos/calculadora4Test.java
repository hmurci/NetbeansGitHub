/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entornos;

import java.util.Arrays;
import java.util.Collection;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
@RunWith(Parameterized.class)
public class calculadora4Test {
    private int num1;
    private int num2;
    private int resul;
    public calculadora4Test(int num1, int num2, int resul) {
        this.num1=num1;
        this.num2=num2;
        this.resul=resul;
    }
    @Parameters
    public static Collection<Object[]> numeros(){
        return Arrays.asList(new Object[][]{{20,10,2},{30,-2,-15},{5,2,3}});
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
        System.out.println("suma");
        calculadora instance = null;
        int expResult = 0;
        int result = instance.suma();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
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
        calculadora instance = new calculadora(this.num1,this.num2);
        int division = instance.divide();
        assertEquals(this.resul, division);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
