/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package REST;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import io.restassured.parsing.Parser;
import static org.hamcrest.Matchers.*;
import test.utils.EmbeddedTomcat;

/**
 *
 * @author Jmach
 */
public class GenericResourceTest
{
    private static EmbeddedTomcat tomcat;
   
    
    public GenericResourceTest()
    {
    }
    
    @BeforeClass
    public static void setUpClass()
    {
        tomcat = new EmbeddedTomcat();
        tomcat.start(9999, "/flights");
        
        RestAssured.baseURI="http://localhost";
        RestAssured.port=9999;
        RestAssured.basePath="/flights";
        RestAssured.defaultParser=Parser.JSON;
    }
    
    @AfterClass
    public static void tearDownClass()
    {
    }
    
    @Before
    public void setUp()
    {
    }
    
    @After
    public void tearDown()
    {
    }

    /**
     * Test of getTEST method, of class GenericResource.
     */
    
    
    
//    @Test
//    public void testGetTEST()
//    {
//        System.out.println("getTEST");
//        GenericResource instance = new GenericResource();
//        String expResult = "";
//        String result = instance.getTEST();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getJson method, of class GenericResource.
//     */
//    @Test
//    public void testGetJson()
//    {
//        System.out.println("getJson");
//        String from = "";
//        String date = "";
//        int tickets = 0;
//        GenericResource instance = new GenericResource();
//        String expResult = "";
//        String result = instance.getJson(from, date, tickets);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//    
}
