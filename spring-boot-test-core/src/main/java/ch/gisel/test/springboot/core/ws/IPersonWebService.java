package ch.gisel.test.springboot.core.ws;

import ch.gisel.test.springboot.api.dto.PersonDTO;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

//http://localhost:8080/services/ws/person/?wsdl
@WebService(name = "PersonWebService")
public interface IPersonWebService {

    @WebMethod
    @WebResult(name = "out")
    PersonDTO savePerson(@WebParam(name = "in") PersonDTO person);

    @WebMethod
    @WebResult(name = "out")
    PersonDTO loadPerson(@WebParam(name = "id") long id);
}
