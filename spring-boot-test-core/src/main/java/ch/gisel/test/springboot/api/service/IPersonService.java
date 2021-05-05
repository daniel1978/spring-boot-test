package ch.gisel.test.springboot.api.service;

import ch.gisel.test.springboot.api.dto.PersonDTO;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/person")
public interface IPersonService {

    @POST
    @Path("/")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    PersonDTO savePerson(PersonDTO person);

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    PersonDTO loadPerson(@PathParam("id") long id);
}
