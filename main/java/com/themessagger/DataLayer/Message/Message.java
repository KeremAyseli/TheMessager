package com.themessagger.DataLayer.Message;

import java.sql.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document
public class Message {
    @Id
    public String messageId;
    public String message;
    public String senderId;
    public String senderName;
    public String senderImage;
    public String receiverId;
    @Indexed
    public String receiverName;
    public String receiverImage;
    public Date date;
    public String type;
    public String status;
    public boolean isRead;
    public boolean isSent;
    public boolean isDeleted;

    public Message(String message, String senderName) {
        this.message = message;
        this.senderName = senderName;
    }
    public String getMessageId() {
        return messageId;
    }
    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public String getSenderId() {
        return senderId;
    }
    public void setSenderId(String senderId) {
        this.senderId = senderId;
    }
    public String getSenderName() {
        return senderName;
    }
    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }
    public String getSenderImage() {
        return senderImage;
    }
    public void setSenderImage(String senderImage) {
        this.senderImage = senderImage;
    }
    public String getReceiverId() {
        return receiverId;
    }
    public void setReceiverId(String receiverId) {
        this.receiverId = receiverId;
    }
    public String getReceiverName() {
        return receiverName;
    }
    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }
    public String getReceiverImage() {
        return receiverImage;
    }
    public void setReceiverImage(String receiverImage) {
        this.receiverImage = receiverImage;
    }
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }

}
