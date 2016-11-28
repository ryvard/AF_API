package rest;

import rest.GenericResource;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import io.restassured.parsing.Parser;
import java.net.MalformedURLException;

import static org.hamcrest.Matchers.*;
//import test.utils.EmbeddedTomcat;

/**
 *
 * @author miaryvard
 */
public class GenericResourceIntegrationTest
{
//    private static EmbeddedTomcat tomcat;

    public GenericResourceIntegrationTest()
    {
    }

    @BeforeClass
    public static void setUpClass()
    {
//        tomcat = new EmbeddedTomcat();
//        tomcat.start(9999,"/flights");
    }

    @AfterClass
    public static void tearDownClass()
    {
//        tomcat.stop();
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
    @Test
    public void testGetTEST()
    {
        System.out.println("getTEST");
        GenericResource instance = new GenericResource();
        String expResult = "{\"airline\":\"Adventure Flights\",\"flights\":{\"flightID\":\"1234\",\"flightNumber\":\"COL1234\",\"date\":\"2016-11-22-16T3:00:00.000z\",\"numberOfSeats\":1,\"travelPrice\":\"180\",\"traveltime\":\"120\",\"origin\":\"CDG\",\"destination\":\"CPH\"}}";
        String result = instance.getTEST();
        assertEquals(expResult, result);
    }

}
