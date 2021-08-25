package com.themessagger.DataLayer.Message;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping
@RestController

public class MessaggeController {
    MessageService messageService;

    public MessaggeController(MessageService messageService) {
        this.messageService = messageService;
    }

    @RequestMapping("api/v1/messages")
    public List<Message> getMessagges() {
        return messageService.GetAllMessagge();
    }
}
