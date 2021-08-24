package com.themessagger;

import java.sql.Date;
import java.util.List;

import com.themessagger.Message.Message;
import com.themessagger.Message.MessaggeRepository;
import com.themessagger.Person.Person;
import com.themessagger.Person.PersonRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

@SpringBootApplication
public class ThemessaggerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ThemessaggerApplication.class, args);
	}
}
