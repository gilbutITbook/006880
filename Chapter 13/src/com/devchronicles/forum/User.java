package com.devchronicles.forum;


public class User {
    
    private int id;
    private String firstName;
    private String lastName;

    public User(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getId() {
        return this.id;
    }

    public String getFirstname() {
        return this.lastName;
    }

    public String getFirstName() {
        return firstName;
    }


}
