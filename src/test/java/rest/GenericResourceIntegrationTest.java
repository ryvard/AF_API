package rest;

import static io.restassured.RestAssured.given;
import rest.GenericResource;
import org.junit.*;
import static org.junit.Assert.*;

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

    @Test
    public void serverIsRunning()
    {
        given().
                when().get("http://localhost:8084/AF_API").
                then().
                statusCode(200);
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
