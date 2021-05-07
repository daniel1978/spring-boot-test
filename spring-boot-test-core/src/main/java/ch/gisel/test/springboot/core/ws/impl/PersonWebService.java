package ch.gisel.test.springboot.core.ws.impl;

import ch.gisel.test.springboot.api.dto.PersonDTO;
import ch.gisel.test.springboot.api.service.IPersonService;
import ch.gisel.test.springboot.core.ws.IPersonWebService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
        return personService.loadPerson(id);
    }
}
