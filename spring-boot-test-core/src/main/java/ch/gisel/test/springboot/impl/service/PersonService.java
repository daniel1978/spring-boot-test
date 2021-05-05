package ch.gisel.test.springboot.impl.service;

import ch.gisel.test.springboot.api.dto.PersonDTO;
import ch.gisel.test.springboot.api.service.IPersonService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class PersonService implements IPersonService {

    private long currentId = 0;
    private Map<Long, PersonDTO> personMap = new HashMap<>();

    @Override
    public PersonDTO savePerson(PersonDTO person) {
        if (person.getId() == null) {
            person.setId(currentId);
            currentId ++;
        }
        personMap.put(person.getId(), person);
        return person;
    }

    @Override
    public PersonDTO loadPerson(long id) {
        return personMap.get(id);
    }
}
