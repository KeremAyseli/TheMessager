package com.themessagger.Message;

import java.util.List;

import com.themessagger.Message.Message;
import com.themessagger.Message.MessaggeRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;


@AllArgsConstructor
@Service
public class MessageService {

	private final MessaggeRepository repository;

	public MessageService(MessaggeRepository repository) {
		this.repository = repository;
	}

	public List<Message> GetAllMessagge() {
		return repository.findAll();
	}

    @Bean
	CommandLineRunner add(MessaggeRepository messageRepository) {
        return args -> {
          Message messagge = new Message("denemeKisi","TestMesajı");
		  messageRepository.insert(messagge);
		};
	}
}
