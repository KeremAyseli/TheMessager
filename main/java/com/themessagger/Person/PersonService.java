package com.themessagger.Person;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class PersonService {

    private final PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public List<Person> getAllPerson() {
        System.out.println(personRepository.findAll().get(0).getName());
        return personRepository.findAll();
    }
    @Bean
	CommandLineRunner add2(PersonRepository personRepository, MongoTemplate mongoTemplate) {
		return args -> {
			String email = "ayselikerem@outlook.com";
			Person user = new Person("Kerem", "Ayseli", "İstanbul", "12345678910", email, "123456", "keremayseli",
					"23.04.2000");
			Query query = new Query();
			query.addCriteria(Criteria.where("email").is(email));
			personRepository.findByEmail(email).ifPresentOrElse(s -> {
				System.out.println("User found with email: " + email);
			}, () -> {
				personRepository.insert(user);
			});
		};
	}
}
