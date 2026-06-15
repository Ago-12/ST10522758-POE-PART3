/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.part3poe;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Student
 */
public class Part3POETest {
    
    public Part3POETest() {
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
     * Test of main method, of class Part3POE.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Part3POE.main(args);
        
        
    }

    /**
     * Test of messageReport method, of class Part3POE.
     */
    @Test
    public void testMessageReport() {
        System.out.println("messageReport");
        Part3POE instance = new Part3POE();
        String expected = "Expected output";
        instance.messageReport();
        
    }

    /**
     * Test of displayRecipient method, of class Part3POE.
     */
    @Test
    public void testDisplayRecipient() {
        System.out.println("displayRecipient");
        Part3POE.displayRecipient();
     
    }

    /**
     * Test of displayLongestMessage method, of class Part3POE.
     */
    @Test
    public void testDisplayLongestMessage() {
        System.out.println("displayLongestMessage");
        Part3POE.displayLongestMessage();
       
    }

    /**
     * Test of MessageIDsearch method, of class Part3POE.
     */
    @Test
    public void testMessageIDsearch() {
        System.out.println("MessageIDsearch");
        Part3POE.MessageIDsearch();
        
    }

    /**
     * Test of searchRecipient method, of class Part3POE.
     */
    @Test
    public void testSearchRecipient() {
        System.out.println("searchRecipient");
        Part3POE.searchRecipient();
        
    }

    /**
     * Test of MessageHashdeleting method, of class Part3POE.
     */
    @Test
    public void testMessageHashdeleting() {
        System.out.println("MessageHashdeleting");
        Part3POE.MessageHashdeleting();
        
    }

    /**
     * Test of Report method, of class Part3POE.
     */
    @Test
    public void testReport() {
        System.out.println("Report");
        Part3POE.Report();
        
    }
    
}
