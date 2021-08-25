package com.themessagger.DataLayer.Person;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RequestMapping
@RestController

public class PersonController {
    PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("api/v1/person")
    public List<Person> getPersons() {
        return personService.getAllPerson();
    }
    @GetMapping(path = "api/v1/person/{email}")
    public Optional<Person> getByEmail(@PathVariable("email") String email) {
        return personService.getPersonByEmail(email);
    }

}
