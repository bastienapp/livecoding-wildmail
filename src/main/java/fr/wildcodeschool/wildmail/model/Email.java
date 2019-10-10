package fr.wildcodeschool.wildmail.model;

import java.util.Date;

public class Email {

    private String sender;
    private String receiver;
    private Date date;
    private String object;
    private String message;

    public Email(String sender, String receiver, String object, String message) {
        this.sender = sender;
        this.receiver = receiver;
        this.date = new Date();
        this.object = object;
        this.message = message;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
