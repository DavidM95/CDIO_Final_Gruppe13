package rest;

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
    public Response seBruger(BrugerDTO brugerDTO) {
//        BrugeradministrationCTRL brugeradministrationCTRL = new BrugeradministrationCTRL();
//        brugeradministrationCTRL.LoginChecker(brugerDTO);
        System.out.println(brugerDTO);

        return Response.ok("hej" + brugerDTO).build();
    }



    @POST
    public Response opretUser(BrugerDTO brugerDTO) {
//        BrugeradministrationCTRL brugeradministrationCTRL = new BrugeradministrationCTRL();
//        brugeradministrationCTRL.LoginChecker(brugerDTO);
        System.out.println(brugerDTO);
        return Response.ok("OK" + brugerDTO).build();

    }
}

