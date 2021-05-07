package ch.gisel.test.springboot.ws.service.impl;

import ch.gisel.test.springboot.api.dto.PersonDTO;
import ch.gisel.test.springboot.api.service.IPersonService;
import ch.gisel.test.springboot.ws.service.IPersonWebService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;

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
        long start = new Date().getTime();
        PersonDTO person = personService.loadPerson(id);
        long end = new Date().getTime();
        person.setComment("Duration: " + (end - start));
        return person;
    }
}
