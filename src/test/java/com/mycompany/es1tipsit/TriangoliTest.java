/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.es1tipsit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author arlin
 */
public class TriangoliTest {
    
    public TriangoliTest() {
    }

    /**
     * Test of tipologiaTriangolo method, of class Triangoli.
     */
    @Test
    public void testTipologiaTriangoloEquilatero() {
        System.out.println("tipologiaTriangolo");
        Triangoli instance = new Triangoli(3, 3, 3);
        String expResult = "Equilatero";
        String result = instance.tipologiaTriangolo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testTipologiaTriangoloIsoscele() {
        System.out.println("tipologiaTriangolo");
        Triangoli instance = new Triangoli(12, 8, 8);
        String expResult = "Isoscele";
        String result = instance.tipologiaTriangolo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testTipologiaTriangoloRettangolo() {
        System.out.println("tipologiaTriangolo");
        Triangoli instance = new Triangoli(26, 10, 24);
        String expResult = "Rettangolo";
        String result = instance.tipologiaTriangolo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testTipologiaTriangoloScaleno() {
        System.out.println("tipologiaTriangolo");
        Triangoli instance = new Triangoli(1, 8, 14);
        String expResult = "Scaleno";
        String result = instance.tipologiaTriangolo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of calcolaPerimetro method, of class Triangoli.
     */
    @Test
    public void testCalcolaPerimetro() {
        System.out.println("calcolaPerimetro");
        Triangoli instance = new Triangoli(37, 13, 40);
        double expResult = 90;
        double result = instance.calcolaPerimetro();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of calcolaArea method, of class Triangoli.
     */
    @Test
    public void testCalcolaArea() {
        System.out.println("calcolaArea");
        Triangoli instance = new Triangoli(37, 13, 40);
        double expResult = 240;
        double result = instance.calcolaArea();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
