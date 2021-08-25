package com.themessagger.DataLayer.Message;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public class MessageService {

	 MessaggeRepository repository;

	public MessageService(MessaggeRepository repository) {
		this.repository = repository;
	}

	public List<Message> GetAllMessagge() {
		return repository.findAll();
	}
    
	public Optional<Message> GetAllMessaggeByReceiver(String receiverId) {
		return repository.findByreceiverId(receiverId);
	}

    @Bean
	CommandLineRunner add(MessaggeRepository messageRepository) {
        return args -> {
          Message messagge = new Message("denemeKisi","TestMesajı");
		  messageRepository.insert(messagge);
		};
	}
}
