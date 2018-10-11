/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.harris.reames.jenkins;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author reames
 */
public class YesManTest {
    
    private YesMan yesMan;
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        yesMan = new YesMan();
    }
    
    @After
    public void tearDown() {
        yesMan = null;
    }

    /**
     * Test of canYouDoIt method, of class YesMan.
     */
    @Test
    public void testCanYouDoIt() {
        
        boolean result = yesMan.canYouDoIt();
        assertEquals(true, result);
    }
}
