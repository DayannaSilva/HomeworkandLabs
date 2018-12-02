/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.Lab10_UnitTesting.business;

import junit.framework.Assert;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author DayannaSilva
 */
public class OperationTest {
    
    public OperationTest() {
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
     * Test of add method, of class Operation.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        short addend1 = 5;
        short addend2 = 6;
        Operation instance = new Operation();
        short expResult = 11;
        short result = instance.add(addend1, addend2);
        assertEquals(expResult, result);
        
    }
    @Test
    public void testAddSimpleCase (){
        short operand1 =1 ;  
        short operand2 =2 ;   
        short expResult = 3;
        Operation operation = new Operation();
        short actualResult = operation.add(operand1, operand2);
        assertEquals(expResult,actualResult);
        System.out.println(""+ operand1 +"+"+  operand2 +"Succeeded");
        
        operand1 = 2;
        operand2 = -1;
        expResult = 1;
        actualResult = operation.add(operand1, operand2);;
        assertEquals(expResult,actualResult);
        System.out.println(""+ operand1 +"+"+  operand2 +"Succeeded");
        
        operand1 = 12;
        operand2 = 15;
        expResult = 27;
        actualResult = operation.add(operand1, operand2);;
        assertEquals(expResult,actualResult);
        System.out.println(""+ operand1 +"+"+  operand2 +"Succeeded");
        
        operand1 = 0;
        operand2 = 5;
        expResult = 5;
        actualResult = operation.add(operand1, operand2);;
        assertEquals(expResult,actualResult);
        System.out.println(""+ operand1 +"+"+  operand2 +"Succeeded");
        
        operand1 = 0;
        operand2 = -8;
        expResult = -8;
        actualResult = operation.add(operand1, operand2);;
        assertEquals(expResult,actualResult);
        System.out.println(""+ operand1 +"+"+  operand2 +"Succeeded");
    }
    @Test
    public void wrongCases (){
        short operand1 =32000 ;  
        short operand2 =32000 ;   
        int expResult = 64000;
        Operation operation = new Operation();
        short actualResult = operation.add(operand1, operand2);
        assertEquals(expResult,actualResult);
        System.out.println(""+ operand1 +"+"+  operand2 +"Succeeded");
    }
    @Test
    public void testAddCaracter (){
        short operand1 ='1';  
        short operand2 ='2';   
        int expResult = '3';
        Operation operation = new Operation();
        short actualResult = operation.add(operand1, operand2);
        assertEquals(expResult,actualResult);
        System.out.println(""+ operand1 +"+"+  operand2 +"Succeeded");
    }
}
