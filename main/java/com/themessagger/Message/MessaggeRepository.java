package com.themessagger.Message;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessaggeRepository extends MongoRepository<Message, String> {
    
}
