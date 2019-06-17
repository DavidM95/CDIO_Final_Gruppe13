package Rest;

import DAL.DTO.BrugerDTO;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Consumes(MediaType.APPLICATION_JSON)
@Path("LoginService")

public class LoginService {

//    @GET
//    public Response getHelloWorld() {
//        return Response.ok("hej").build();
//    }


    @POST
    public Response loginUser(BrugerDTO brugerDTO) {
        System.out.println("brugerNavn" + brugerDTO.getBrugerNavn() + "brugerPassword" + brugerDTO.getBrugerPassword());
            return Response.ok("OK" + brugerDTO.getBrugerNavn()+ brugerDTO.getBrugerPassword()).build();



    }
}

