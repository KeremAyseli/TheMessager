package com.themessagger.DataLayer.Message;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessaggeRepository extends MongoRepository<Message, String> {
       public Optional<Message> findByreceiverId(String receiverId);
}
