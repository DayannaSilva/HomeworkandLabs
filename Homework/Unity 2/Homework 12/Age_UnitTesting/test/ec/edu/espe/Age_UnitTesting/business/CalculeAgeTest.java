/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.Age_UnitTesting.business;

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
public class CalculeAgeTest {
    
    public CalculeAgeTest() {
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
     * Test of day method, of class CalculeAge.
     */
    /*@Test
    public void testAge() {
        System.out.println("AGE");
        int bornDay = 5;
        int bornMonth = 8;
        int bornYear = 1997;
        CalculeAge instance = new CalculeAge();
        int expResult = 30;
        int result = instance.day(bornDay, bornMonth, bornYear);
        assertEquals(expResult, result);
        int expResult2 = 21;
        int result2 = instance.year(bornDay, bornMonth, bornYear);
        assertEquals(expResult2, result2);
        int expResult3 = 3 ;
        int result3 = instance.month(bornDay, bornMonth, bornYear);
        assertEquals(expResult3, result3);       
        
        bornDay = 3;
        bornMonth = 4;
        bornYear = 2000;
        expResult = 1;
        result = instance.day(bornDay, bornMonth, bornYear);
        assertEquals(expResult, result);
        expResult3 = 8 ;
        result3 = instance.month(bornDay, bornMonth, bornYear);
        assertEquals(expResult3, result3);
        expResult2 = 18;
        result2 = instance.year(bornDay, bornMonth, bornYear);
        assertEquals(expResult2, result2);
           
        
        bornDay = 11;
        bornMonth = 4;
        bornYear = 1997;
        expResult = 30;
        result = instance.day(bornDay, bornMonth, bornYear);
        assertEquals(expResult, result);
        expResult3 = 7 ;
        result3 = instance.month(bornDay, bornMonth, bornYear);
        assertEquals(expResult3, result3); 
        expResult2 = 22;
        result2 = instance.year(bornDay, bornMonth, bornYear);
        assertEquals(expResult2, result2);
        
        
    }
    @Test
    public void leapYearAge() {
        System.out.println("AGE");
        int bornDay = 29;
        int bornMonth = 2;
        int bornYear = 2015;
        CalculeAge instance = new CalculeAge();
        int expResult = 5;
        int result = instance.day(bornDay, bornMonth, bornYear);
        assertEquals(expResult, result);
        int expResult2 = 3;
        int result2 = instance.year(bornDay, bornMonth, bornYear);
        assertEquals(expResult2, result2);
        int expResult3 = 9;
        int result3 = instance.month(bornDay, bornMonth, bornYear);
        assertEquals(expResult3, result3);  
    }
     @Test
    public void charTestAge() {
        System.out.println("AGE");
        int bornDay = '5';
        int bornMonth = '8';
        int bornYear = 1997;
        CalculeAge instance = new CalculeAge();
        int expResult = 30;
        int result = instance.day(bornDay, bornMonth, bornYear);
        assertEquals(expResult, result);
        int expResult2 = 21;
        int result2 = instance.year(bornDay, bornMonth, bornYear);
        assertEquals(expResult2, result2);
        int expResult3 = 3 ;
        int result3 = instance.month(bornDay, bornMonth, bornYear);
        assertEquals(expResult3, result3);
        
    }*/
    @Test
    public void testAge1() {
        System.out.println("AGE");
        int bornDay = 29;
        int bornMonth = 2;
        int bornYear = 2015;
        CalculeAge instance = new CalculeAge();
        int expResult = -1;
        int result = instance.day(bornDay, bornMonth, bornYear);
        assertEquals(expResult, result);
        int expResult2 = -1;
        int result2 = instance.year(bornDay, bornMonth, bornYear);
        assertEquals(expResult2, result2);
        int expResult3 = -1;
        int result3 = instance.month(bornDay, bornMonth, bornYear);
        assertEquals(expResult3, result3);
        
    }
    @Test
    public void testAge2() {
        System.out.println("AGE");
        int bornDay = 31;
        int bornMonth = 4;
        int bornYear = 2016;
        CalculeAge instance = new CalculeAge();
        int expResult = -1;
        int result = instance.day(bornDay, bornMonth, bornYear);
        assertEquals(expResult, result);
        int expResult2 = -1;
        int result2 = instance.year(bornDay, bornMonth, bornYear);
        assertEquals(expResult2, result2);
        int expResult3 = -1;
        int result3 = instance.month(bornDay, bornMonth, bornYear);
        assertEquals(expResult3, result3);
    }
    @Test
    public void testAge3() {
        System.out.println("AGE");
        int bornDay = 31;
        int bornMonth = 11;
        int bornYear = 2013;
        CalculeAge instance = new CalculeAge();
        int expResult = -1;
        int result = instance.day(bornDay, bornMonth, bornYear);
        assertEquals(expResult, result);
        int expResult2 = -1;
        int result2 = instance.year(bornDay, bornMonth, bornYear);
        assertEquals(expResult2, result2);
        int expResult3 = -1;
        int result3 = instance.month(bornDay, bornMonth, bornYear);
        assertEquals(expResult3, result3);   
    }
    @Test
    public void testAge4() {
        System.out.println("AGE");
        int bornDay = 17;
        int bornMonth = 12;
        int bornYear = 1970;
        CalculeAge instance = new CalculeAge();
        int expResult =27 ;
        int result = instance.day(bornDay, bornMonth, bornYear);
        assertEquals(expResult, result);
        int expResult2 = 47;
        int result2 = instance.year(bornDay, bornMonth, bornYear);
        assertEquals(expResult2, result2);
        int expResult3 = 11;
        int result3 = instance.month(bornDay, bornMonth, bornYear);
        assertEquals(expResult3, result3);
    }
    @Test
    public void testAge5() {
        System.out.println("AGE");
        int bornDay = 17;
        int bornMonth = 12;
        int bornYear = 1970;
        CalculeAge instance = new CalculeAge();
        int expResult = 26;
        int result = instance.day(bornDay, bornMonth, bornYear);
        assertEquals(expResult, result);
        int expResult2 = 47;
        int result2 = instance.year(bornDay, bornMonth, bornYear);
        assertEquals(expResult2, result2);
        int expResult3 = 11;
        int result3 = instance.month(bornDay, bornMonth, bornYear);
        assertEquals(expResult3, result3);  
    }
    @Test
    public void testAge6() {
        System.out.println("AGE");
        int bornDay = 13;
        int bornMonth = 12;
        int bornYear = 1970;
        CalculeAge instance = new CalculeAge();
        int expResult = 0;
        int result = instance.day(bornDay, bornMonth, bornYear);
        assertEquals(expResult, result);
        int expResult2 = 47;
        int result2 = instance.year(bornDay, bornMonth, bornYear);
        assertEquals(expResult2, result2);
        int expResult3 = 0;
        int result3 = instance.month(bornDay, bornMonth, bornYear);
        assertEquals(expResult3, result3);  
    }

    /**
     * Test of year method, of class CalculeAge.
     */
   /* @Test
    public void testYear() {
        System.out.println("year");
        int bornDay = 5;
        int bornMonth = 8;
        int bornYear = 1997;
        CalculeAge instance = new CalculeAge();
        int expResult2 = 21;
        int result2 = instance.year(bornDay, bornMonth, bornYear);
        assertEquals(expResult2, result2);
        int expResult3 = 3 ;
        int result3 = instance.month(bornDay, bornMonth, bornYear);
        assertEquals(expResult3, result3);
    }

    /**
     * Test of month method, of class CalculeAge.
     */
    /*@Test
    public void testMonth() {
        System.out.println("month");
        int bornDay = 5;
        int bornMonth = 8;
        int bornYear = 1997;
        CalculeAge instance = new CalculeAge();
        int expResult = 3 ;
        int result = instance.month(bornDay, bornMonth, bornYear);
        assertEquals(expResult, result);   
    }
    //LEAPYEAR
    @Test
    public void leapDay (){
        System.out.println("day");
        int bornDay = 29;
        int bornMonth = 2;
        int bornYear = 2015;
        CalculeAge instance = new CalculeAge();
        int expResult = 3;
        int result = instance.day(bornDay, bornMonth, bornYear);
        assertEquals(expResult, result);
    }
    public void leapMonth() {
        System.out.println("month");
        int bornDay = 29;
        int bornMonth = 2;
        int bornYear = 2015;
        CalculeAge instance = new CalculeAge();
        int expResult = 4;
        int result = instance.month(bornDay, bornMonth, bornYear);
        assertEquals(expResult, result);   
    }
    public void leapYear() {
        System.out.println("month");
        int bornDay = 29;
        int bornMonth = 2;
        int bornYear = 2015;
        CalculeAge instance = new CalculeAge();
        int expResult = 3;
        int result = instance.month(bornDay, bornMonth, bornYear);
        assertEquals(expResult, result);   
    }*/
    
    
}
