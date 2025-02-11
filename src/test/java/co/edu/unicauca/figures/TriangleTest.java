/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package co.edu.unicauca.figures;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author evers
 */
public class TriangleTest {
    
    public TriangleTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of calculateArea method, of class Triangle.
     */
    @Test
    public void testCalculateArea() {
        System.out.println("calculateArea");
        Triangle instance =  new Triangle(12, 15);
        double expResult = 90;
        double result = instance.calculateArea();
        assertEquals(expResult, result, 0.1);

    }

    /**
     * Test of calculatePerimeter method, of class Triangle.
     */
    @Test
    public void testCalculatePerimeter() {
        System.out.println("calculatePerimeter");
        Triangle instance =  new Triangle(12, 15);
        double expResult = 44.32;
        double result = instance.calculatePerimeter();
        assertEquals(expResult, result, 0.1);

    }

   
    
}
