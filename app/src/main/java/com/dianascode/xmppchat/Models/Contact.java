package com.dianascode.xmppchat.Models;

/**
 * Created by diana on 04/02/17.
 */

public class Contact {

    private String username;
    private String name;
    private String state;

    public Contact(String username, String name, String state) {
        this.username = username;
        this.name = name;
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
