package ch.gisel.test.springboot.core.ws.impl;

import ch.gisel.test.springboot.api.dto.PersonDTO;
import ch.gisel.test.springboot.api.service.IPersonService;
import ch.gisel.test.springboot.core.ws.IPersonWebService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class PersonWebService implements IPersonWebService {

    @Autowired
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
