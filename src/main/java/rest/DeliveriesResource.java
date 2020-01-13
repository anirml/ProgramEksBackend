package rest;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import utils.EMF_Creator;
import facades.DeliveriesFacade;
import javax.persistence.EntityManagerFactory;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

//Todo Remove or change relevant parts before ACTUAL use
@Path("deliveries")
public class DeliveriesResource {

    private static final EntityManagerFactory EMF = EMF_Creator.createEntityManagerFactory(
                "pu",
                "jdbc:mysql://localhost:3307/progeks_db",
                "dev",
                "ax2",
                EMF_Creator.Strategy.CREATE);
    private static final DeliveriesFacade FACADE =  DeliveriesFacade.getFacadeExample(EMF);
    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();
            
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public String demo() {
        return "{\"msg\":\"Hello World\"}";
    }
    @Path("count")
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public String getDeliveriesCount() {
        long count = FACADE.getDeliveriesCount();
        return "{\"count\":"+count+"}";  //Done manually so no need for a DTO
    }

 
}
