package Rest;

import DAL.DTO.BrugerDTO;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Consumes(MediaType.APPLICATION_JSON)
@Path("createUser")

public class CreateUser {

    @GET
    public Response getHelloWorld() {
        return Response.ok("hej").build();
    }


/*    @POST
    @Path("{navn}")
    public Response postHelloWorld(@PathParam("navn") String navn) {

        return Response.ok("Hej " + navn + "").build();
    }*/


    @POST
    public Response opretUser(BrugerDTO brugerDTO) {

        System.out.println("UserId: " + brugerDTO.getBrugerId() + "Username: " + brugerDTO.getBrugerNavn());
        return Response.ok("OK" + brugerDTO.getBrugerNavn()).build();

    }
}

