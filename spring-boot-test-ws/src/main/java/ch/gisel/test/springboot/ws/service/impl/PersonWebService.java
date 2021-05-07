package ch.gisel.test.springboot.ws.service.impl;

import ch.gisel.test.springboot.ws.dto.PersonDTO;
import ch.gisel.test.springboot.ws.rest.IPersonService;
import ch.gisel.test.springboot.ws.service.IPersonWebService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PersonWebService implements IPersonWebService {

    @Resource(name = "personServiceClient")
    private IPersonService personService;

    @Override
    public PersonDTO savePerson(PersonDTO person) {
        return personService.savePerson(person);
    }

    @Override
    public PersonDTO loadPerson(long id) {
        return personService.loadPerson(id);
    }
}
