package com.dianascode.xmppchat.Models;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by diana on 06/02/17.
 */

public class Chat {

    private String username;
    private String last_message;
    private String time_last_message;
    private ArrayList<ChatMessage> messages;

    public Chat(String username, String last_message) {
        this.username = username;
        this.last_message = last_message;
        this.time_last_message = formateaHora(new Date());
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getLast_message() {
        return last_message;
    }

    public void setLast_message(String last_message) {
        this.last_message = last_message;
    }

    public String getTime_last_message() {
        return time_last_message;
    }

    public void setTime_last_message(String time_last_message) {
        this.time_last_message = time_last_message;
    }

    public ArrayList<ChatMessage> getMessages() {
        return messages;
    }

    public void setMessages(ArrayList<ChatMessage> messages) {
        this.messages = messages;
    }

    private String formateaHora(Date date){
        DateFormat hourFormat = new SimpleDateFormat("HH:mm:ss");
        hourFormat.format(date);
        return date.toString();
    }




}
