package rest;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author miaryvard
 */

@Path("flights")
public class GenericResource
{

    @Context
    private UriInfo context;
    
    
    
    private static Map<Integer, String> bla = new HashMap()
    {
        {
            JsonObject flight = new JsonObject();
            flight.addProperty("flightID","1234");
            flight.addProperty("flightNumber", "COL1234");
            flight.addProperty("date","2016-11-22-16T3:00:00.000z");
            flight.addProperty("numberOfSeats",1);
            flight.addProperty("travelPrice", "180");
            flight.addProperty("traveltime", "120");
            flight.addProperty("origin", "CDG");
            flight.addProperty("destination", "CPH");
            
//            JsonObject flight1 = new JsonObject();
//            flight.addProperty("flightID","1234");
//            flight.addProperty("flightNumber", "COL1234");
//            flight.addProperty("date","2016-11-22-16T3:00:00.000z");
//            flight.addProperty("numberOfSeats",1);
//            flight.addProperty("travelPrice", "180");
//            flight.addProperty("traveltime", "120");
//            flight.addProperty("origin", "CDG");
//            flight.addProperty("destination", "CPH");
            
            JsonObject json = new JsonObject();
            json.addProperty("airline", "Adventure Flights");
            json.add("flights", flight);
            
            put(1, json);
            
        }
    };

    /**
     * Creates a new instance of GenericResource
     */
    public GenericResource()
    {
    }
    
    
    /**
     * Retrieves representation of an instance of ex_rest.jaxrs.af_api.GenericResource
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("test")
    public String getTEST()
    {
        String response = new Gson().toJson(bla.get(1));
        
        return response;
    }

    /**
     * Retrieves representation of an instance of ex_rest.jaxrs.af_api.GenericResource
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("{from}/{date}/{tickets}")
    public String getJson(@PathParam("from") String from, @PathParam("date") String date, @PathParam("tickets") int tickets)
    {
        JsonObject json = new JsonObject();
        json.addProperty("name", "mia");
        String response = new Gson().toJson(json);
        
        return response;
    }

}
